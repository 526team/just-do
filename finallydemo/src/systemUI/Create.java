package systemUI;

import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import util.DBcls;
import util.Language;
import util.Mypanel;

public class Create extends Mypanel {
	private JTextField tfname;
	private JTextField tftnumber;
	JCheckBox cbnc;
	JComboBox cbname, cbweek, cbcls, cbduration, cbbuilding, cbfloor, cbroom, cbteacher;
	JButton ok, canc;
	JLabel lbfom, lbwrong;

	Connection con = null;
	ResultSet rs;
	Statement st;
	PreparedStatement ps;
	JLabel lblId;

	/**
	 * Create the panel.
	 */
	public Create() {
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setBounds(0, 0, 684, 562);

		JLabel label = new JLabel(Language.courseName);
		label.setBounds(69, 57, 80, 15);

		tfname = new JTextField();
		tfname.setBounds(391, 58, 96, 21);
		tfname.setEditable(false);
		tfname.setColumns(10);

		cbnc = new JCheckBox(Language.newCourse);
		cbnc.setBounds(288, 57, 97, 23);
		cbnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setcbname();
			}
		});

		cbname = new JComboBox();
		cbname.setBounds(159, 58, 96, 21);
		cbname.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				tfname.setText((String) cbname.getSelectedItem());
			}
		});

		JLabel label_1 = new JLabel(Language.courseTime);
		label_1.setBounds(69, 163, 78, 15);

		cbweek = new JComboBox();
		cbweek.setBounds(159, 160, 80, 21);
		cbweek.setModel(new DefaultComboBoxModel(
				new String[] { Language.monday, Language.tuesday, Language.wednesday, Language.thursday, Language.friday, Language.saturday }));

		JLabel label_2 = new JLabel("Begin at class");
		label_2.setBounds(249, 163, 84, 15);

		cbcls = new JComboBox();
		cbcls.setBounds(356, 160, 43, 21);
		cbcls.setModel(new DefaultComboBoxModel(new String[] { "1", "3", "5", "7", "9" }));

		JLabel label_3 = new JLabel(Language.duration);
		label_3.setBounds(432, 163, 48, 15);

		JLabel label_4 = new JLabel(Language.classes);
		label_4.setBounds(540, 163, 50, 15);

		JLabel label_5 = new JLabel(Language.classRoom);
		label_5.setBounds(69, 256, 72, 15);

		JLabel lblTechingBuilding = new JLabel(Language.techingBuilding);
		lblTechingBuilding.setBounds(370, 253, 115, 15);

		cbbuilding = new JComboBox();
		cbbuilding.setBounds(495, 250, 38, 21);
		cbbuilding.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

		JLabel label_7 = new JLabel(Language.floor);
		label_7.setBounds(258, 256, 102, 15);

		cbfloor = new JComboBox();
		cbfloor.setBounds(298, 253, 62, 21);
		cbfloor.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));

		JLabel label_8 = new JLabel(Language.classRoom);
		label_8.setBounds(159, 256, 32, 15);

		cbroom = new JComboBox();
		cbroom.setBounds(193, 253, 55, 21);
		cbroom.setModel(new DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

		JLabel label_9 = new JLabel(Language.totalNumber);
		label_9.setBounds(69, 338, 78, 15);

		tftnumber = new JTextField();
		tftnumber.setBounds(180, 335, 66, 21);
		tftnumber.setText("100");
		tftnumber.setColumns(10);

		JLabel label_10 = new JLabel(Language.teacher);
		label_10.setBounds(308, 338, 48, 15);

		cbteacher = new JComboBox();
		cbteacher.setBounds(389, 335, 213, 21);

		JButton ok = new JButton(Language.ok);
		ok.setBounds(75, 458, 55, 23);
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Delete.selectedID > -1)
					update(Delete.selectedID);
				else
					update();
			}
		});

		JButton back = new JButton(Language.back);
		back.setBounds(524, 458, 66, 23);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.menu.cl.show(Menu.menu.parent, "del");
				reset();
			}
		});

		cbduration = new JComboBox();
		cbduration.setBounds(498, 160, 32, 21);
		cbduration.setModel(new DefaultComboBoxModel(new String[] { "2", "3" }));

		lbfom = new JLabel("               ");
		lbfom.setBounds(180, 355, 115, 15);
		lbfom.setForeground(Color.RED);
		lbfom.setFont(new Font("宋体", Font.ITALIC, 12));

		lbwrong = new JLabel("                                                             ");
		lbwrong.setBounds(75, 391, 527, 16);
		lbwrong.setForeground(Color.DARK_GRAY);
		lbwrong.setFont(new Font("宋体", Font.ITALIC, 14));
		setLayout(null);

		lblId = new JLabel("                                  ");
		lblId.setBounds(75, 36, 247, 15);
		add(lblId);
		add(label);
		add(cbname);
		add(cbnc);
		add(tfname);
		add(label_1);
		add(cbweek);
		add(label_2);
		add(cbcls);
		add(label_3);
		add(cbduration);
		add(label_4);
		add(label_5);
		add(label_8);
		add(cbroom);
		add(label_7);
		add(cbfloor);
		add(lblTechingBuilding);
		add(cbbuilding);
		add(label_9);
		add(tftnumber);
		add(lbfom);
		add(label_10);
		add(cbteacher);
		add(lbwrong);
		add(ok);
		add(back);

	}

	public void set() {
		if (Delete.selectedID > -1) {
			lblId.setText("Change course informattion, course ID:" + Delete.selectedID);
			getitems(Delete.selectedID);
		} else {
			lblId.setText("                                  ");
			getitems();
		}
	}

	void reset() {

		Delete.selectedID = -1;
		lblId.setText(null);
		lbfom.setText(null);
		lbwrong.setText(null);
		cbnc.setSelected(false);
		getitems();
	}

	void getitems(int ID) {
		getitems();
		String sql[] = { "select * from course where CID = " + ID };
		try {
			con = DBcls.getcon();
			st = con.createStatement();
			rs = st.executeQuery(sql[0]);
			rs.next();
			cbname.setSelectedItem(rs.getString(2));
			cbteacher.setSelectedItem(rs.getString(8));
			cbbuilding.setSelectedItem(rs.getString(3).substring(0, 1));
			cbfloor.setSelectedItem(rs.getString(3).substring(2, 3));
			cbroom.setSelectedItem(rs.getString(3).substring(3));
			cbweek.setSelectedIndex(new Integer(rs.getString(4).substring(0, 1)));
			cbcls.setSelectedItem(rs.getString(4).substring(2, 3));
			cbduration.setSelectedItem(rs.getString(4).substring(4));
			tftnumber.setText(rs.getString(5));
			tftnumber.setEditable(false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void getitems() {
		cbname.removeAllItems();
		cbteacher.removeAllItems();
		String s[] = { "select cname from coursebase where iscompulsory=false", "select tname from teacherdetail" };
		try {
			con = DBcls.getcon();
			st = con.createStatement();
			rs = st.executeQuery(s[0]);
			String item = null;
			while (rs.next()) {
				item = rs.getString(1);
				cbname.addItem(item);
			}
			rs = st.executeQuery(s[1]);
			while (rs.next()) {
				item = rs.getString(1);
				cbteacher.addItem(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tfname.setText((String) cbname.getSelectedItem());
	}

	void setcbname() {
		cbname.setEnabled(!cbnc.isSelected());
		tfname.setEditable(cbnc.isSelected());
		if (cbnc.isSelected())
			tfname.setText(null);
		else
			tfname.setText((String) cbname.getSelectedItem());
	}

	String execute(String sql[]) throws Exception {

		String name = tfname.getText().toString(), tname = cbteacher.getSelectedItem().toString();
		Integer tnum = new Integer(tftnumber.getText().toString());

		StringBuffer classroom = new StringBuffer(), classtime = new StringBuffer();
		classroom.append(cbbuilding.getSelectedItem() + "-" + cbfloor.getSelectedItem() + cbroom.getSelectedItem());
		String classr = new String(classroom);
		classtime.append(cbweek.getSelectedIndex() + "-" + cbcls.getSelectedItem() + "-"
				+ (new Integer(cbcls.getSelectedItem().toString()) - 1
						+ new Integer(cbduration.getSelectedItem().toString())));

		String classt = new String(classtime);

		con = DBcls.getcon();

		ps = con.prepareStatement(sql[2]);
		ps.setString(1, classr);
		ps.setString(2, classt.substring(0, 3));
		System.out.println(ps);//
		rs = ps.executeQuery();
		if (rs.next())
			throw new roomException();
		ps = con.prepareStatement(sql[3]);
		ps.setString(1, tname);
		ps.setString(2, classt.substring(0, 3));
		System.out.println(ps);//
		rs = ps.executeQuery();
		if (rs.next())
			throw new teacherException();

		if (cbnc.isSelected()) {
			ps = con.prepareStatement(sql[1]);
			//
			ps.setString(1, name);
			ps.execute();
		}
		ps = con.prepareStatement(sql[0]);
		//
		ps.setString(1, name);
		ps.setString(2, classr);
		ps.setString(3, classt);
		ps.setInt(4, tnum);
		ps.setString(5, tname);
		System.out.println(ps);
		ps.execute();
		return name;
	}

	void update() {

		String sql[] = new String[] { "insert into course values(null,?,?,?,?,0,false,?,null)", "insert into coursebase values (?,false)",
				"select * from course where classroom=? and substring(classtime,1,3)=?",
				"select * from course where tname=? and substring(classtime,1,3)=?" };
		try {
			lbwrong.setText("Course created \"" + execute(sql) + "\" successfully!");
			getitems();
		} catch (NumberFormatException e) {
			lbfom.setText("* Invalid input");
		} catch (roomException e) {
			lbwrong.setText("* Cannot create course: Contradictory courses at same time for Class room");
		} catch (teacherException e) {
			lbwrong.setText("* Cannot create course: Contradictory courses at same time for Teacher");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			lbwrong.setText("* The course named \"" + tfname.getText().toString() + "\" already exists");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void update(int ID) {

		String sql[] = { "update course set cname=?,classroom=?,classtime=?,tnumber=?,tname=? where CID=" + ID,
				"insert into coursebase values (?,false)",
				"select * from course where classroom=? and substring(classtime,1,3)=? and CID !=" + ID,
				"select * from course where tname=? and substring(classtime,1,3)=? and CID !=" + ID };
		try {
			execute(sql);
			lbwrong.setText("Information of course \"" + ID + "\" changed successfully!");
		} catch (NumberFormatException e) {
			lbfom.setText("* Invalid input");
		} catch (roomException e) {
			lbwrong.setText("* Cannot change course: Contradictory courses at same time for Class room");
		} catch (teacherException e) {
			lbwrong.setText("* Cannot change course: Contradictory courses at same time for Teacher");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			lbwrong.setText("* The course named \"" + tfname.getText().toString() + "\" already exists");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	class roomException extends RuntimeException {
	}

	class teacherException extends RuntimeException {
	}
}