package systemUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import util.DBcls;
import util.Mypanel;

public class Delete extends Mypanel implements Runnable {

	public static int selectedID = -1;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnRefresh;
	private JTextField tfsearch;
	Connection con;
	Object[][] tab;
	int[] id;
	JComboBox cborder;
	String order[] = { "CID", "cname", "classtime", "tname" };
	String orderby;
	JButton del;
	JButton chan;

	/**
	 * Create the panel.
	 */
	public Delete() {
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setBounds(0, 0, 684, 562);

		JButton cre = new JButton("Create course");
		cre.setBounds(83, 486, 119, 23);
		cre.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectedID = -1;
				Menu.menu.create.set();
				Menu.menu.cl.show(Menu.menu.parent, "cre");
			}
		});

		del = new JButton("Delete course");
		del.setBounds(272, 486, 119, 23);
		del.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Delete.selectedID = id[table.getSelectedRow()];
				delete();
			}
		});

		chan = new JButton("Change course");
		chan.setBounds(466, 486, 128, 23);
		chan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Delete.selectedID = id[table.getSelectedRow()];
				Menu.menu.create.set();
				Menu.menu.cl.show(Menu.menu.parent, "cre");
			}
		});

		scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 93, 674, 359);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		btnRefresh = new JButton("Refresh");
		btnRefresh.setBounds(583, 64, 80, 23);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfsearch.setText("Search for course name");
				settable(table);
			}
		});

		tfsearch = new JTextField();
		tfsearch.setBounds(15, 65, 244, 21);
		tfsearch.setText("Search for course name");
		tfsearch.setColumns(10);

		JButton btnSerach = new JButton("Serach");
		btnSerach.setBounds(277, 64, 75, 23);
		btnSerach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search();
			}
		});

		cborder = new JComboBox();
		cborder.setBounds(478, 65, 87, 21);
		cborder.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				orderby = order[cborder.getSelectedIndex()];
				settable(table);
			}
		});
		cborder.setModel(
				new DefaultComboBoxModel(new String[] { "Defult(ID)", "Course a-z", "Time up", "Tacher a-z" }));

		JLabel lblOrderBy = new JLabel("Order by");
		lblOrderBy.setBounds(406, 68, 54, 15);

		table = new JTable();
		scrollPane.setViewportView(table);

		orderby = order[cborder.getSelectedIndex()];
		settable(table);
		setLayout(null);
		add(cre);
		add(del);
		add(chan);
		add(scrollPane);
		add(tfsearch);
		add(btnSerach);
		add(lblOrderBy);
		add(cborder);
		add(btnRefresh);

		Thread th = new Thread(this);
		th.start();
	}

	void setobj(ResultSet rs) {
		String[] week = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Satuaday" };
		int i = 0;
		try {
			while (rs.next()) {
				id[i] = rs.getInt(1);
				tab[i][0] = rs.getString(2);
				tab[i][1] = new String("Room" + rs.getString(3).substring(2) + ",Teaching Building No."
						+ rs.getString(3).substring(0, 1));
				tab[i][2] = new String("Lessons" + rs.getString(4).substring(2) + " on "
						+ week[new Integer(rs.getString(4).substring(0, 1))]);
				tab[i][3] = rs.getInt(5);
				tab[i][4] = rs.getInt(6);
				tab[i][5] = rs.getString(8);
				i++;
			}
			table.setModel(new DefaultTableModel(tab, new String[] { "Course Name", "Class Room", "Class Time",
					"Total Number", "Joined Number", "Teacher" }) {
				boolean[] columnEditables = new boolean[] { true, false, false, false, false, true };

				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			table.getColumnModel().getColumn(1).setPreferredWidth(185);
			table.getColumnModel().getColumn(2).setPreferredWidth(140);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void settable(JTable table) {
		try {
			con = DBcls.getcon();

			String[] s = { "select count(CID) from course where iscompulsory=false ",
					"select * from course where iscompulsory=false order by " + orderby };

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(s[0]);

			int row = 0;
			if (rs.next())
				row = rs.getInt(1);

			rs = st.executeQuery(s[1]);
			id = new int[row];
			tab = new Object[row][6];
			if (row > 0)
				setobj(rs);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void search() {
		try {
			String[] s = { "select count(CID) from course where iscompulsory=false and cname like ?",
					"select * from course where iscompulsory=false and cname like ? order by " + orderby };

			PreparedStatement ps = con.prepareStatement(s[0]);
			ps.setString(1, new String(new StringBuffer(tfsearch.getText() + "%")));
			ResultSet rs = ps.executeQuery();

			int row = 0;
			if (rs.next())
				row = rs.getInt(1);

			ps = con.prepareStatement(s[1]);
			ps.setString(1, new String(new StringBuffer(tfsearch.getText() + "%")));
			rs = ps.executeQuery();
			id = new int[row];
			tab = new Object[row][6];
			if (row > 0)
				setobj(rs);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void delete() {
		String[] s = { "delete from course where CID=" + Delete.selectedID };

		if (JOptionPane.showConfirmDialog(this, "Delete this?") == 0)
			try {
				PreparedStatement ps = con.prepareStatement(s[0]);
				System.out.println(ps);
				if (ps.executeUpdate(s[0]) > 0) {
					JOptionPane.showMessageDialog(this, "Operation secceeded");
					settable(table);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (table.getSelectedRow() == -1) {
				del.setEnabled(false);
				chan.setEnabled(false);
			} else {
				del.setEnabled(true);
				chan.setEnabled(true);
			}
		}
	}
}
