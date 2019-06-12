/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import systemUI.TheMainUI;
import util.DBcls;
import util.Mypanel;

/**
 *
 * @author 23155
 */
public class NewUser3 extends Mypanel {
	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet rs;
	String sex = null;
	String type[] = {"addt", "adds" }, stype = "addt";

	/**
	 * Creates new form NewUser2
	 */
	public NewUser3() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jLabel5 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		abc1 = new javax.swing.JPasswordField();
		abc = new javax.swing.JPasswordField();
		jLabel9 = new javax.swing.JLabel();
		jComboBox3 = new javax.swing.JComboBox();

		jLabel1.setFont(new java.awt.Font("宋体", 3, 36)); // NOI18N
		jLabel1.setText("    NewUser");

		jLabel2.setFont(new java.awt.Font("宋体", 2, 24)); // NOI18N
		jLabel2.setText("    UserName");

		jLabel3.setFont(new java.awt.Font("宋体", 2, 24)); // NOI18N
		jLabel3.setText("    Password");

		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jLabel7.setFont(new java.awt.Font("宋体", 2, 24)); // NOI18N
		jLabel7.setText("  Confirm password");

		jLabel8.setFont(new java.awt.Font("宋体", 2, 24)); // NOI18N
		jLabel8.setText("   Name");

		jLabel4.setFont(new java.awt.Font("宋体", 2, 24)); // NOI18N
		jLabel4.setText("    Sex");

		buttonGroup1.add(jRadioButton1);
		jRadioButton1.setFont(new java.awt.Font("宋体", 2, 18)); // NOI18N
		jRadioButton1.setText("Male");
		jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton1ActionPerformed(evt);
			}
		});

		buttonGroup1.add(jRadioButton2);
		jRadioButton2.setFont(new java.awt.Font("宋体", 2, 18)); // NOI18N
		jRadioButton2.setText("Female");
		jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton2ActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("宋体", 2, 24)); // NOI18N
		jLabel5.setText("City");

		jComboBox2.setEditable(true);
		jComboBox2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "成都", "西安", "重庆", "上海", "广州" }));
		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox2ActionPerformed(evt);
			}
		});

		jButton1.setFont(new java.awt.Font("宋体", 1, 16)); // NOI18N
		jButton1.setText("OK");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("宋体", 1, 16)); // NOI18N
		jButton2.setText("Cancel");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel9.setFont(new java.awt.Font("宋体", 2, 24)); // NOI18N
		jLabel9.setText("    UserType");

		jComboBox3.setEditable(true);
		jComboBox3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
		jComboBox3
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "teacher", "student" }));
		jComboBox3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(181, 181, 181)
						.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(144, 144, 144)
						.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(
										jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(171, 171, 171))
				.addGroup(layout.createSequentialGroup().addGap(70, 70, 70).addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(32, 32, 32).addComponent(jLabel8,
										javax.swing.GroupLayout.PREFERRED_SIZE, 114,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabel4,
										javax.swing.GroupLayout.PREFERRED_SIZE, 164,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(59, 59, 59).addComponent(jLabel5,
										javax.swing.GroupLayout.PREFERRED_SIZE, 71,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(181, 181, 181)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 160,
												Short.MAX_VALUE)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jRadioButton2)
												.addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
														136, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 230,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 230,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(135, 135, 135)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(abc1)
										.addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 160,
												Short.MAX_VALUE)
										.addComponent(abc, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
										.addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, 0,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGap(105, 105, 105)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addComponent(
						jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(29, 29, 29)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(28, 28, 28)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3)
						.addComponent(abc, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7)
						.addComponent(abc1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9)
						.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(26, 26, 26)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4)
						.addComponent(jRadioButton1))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton2)
				.addGap(17, 17, 17)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton1)
						.addComponent(jButton2))
				.addGap(27, 27, 27)));
		jComboBox2.setEditable(false);
		jComboBox3.setEditable(false);
	}// </editor-fold>

	private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		sex = "male";
	}

	private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		sex = "female";
	}

	private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String regex = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,15}$";

		if (jTextField2.getText().length() == 0) {
			JOptionPane.showMessageDialog(this, "UserName could'n be Null");
			return;
		}
		if (abc.getText().length() == 0) {
			JOptionPane.showMessageDialog(this, "Password could'n be Null");
			return;
		}
		if (jTextField4.getText().length() == 0) {
			JOptionPane.showMessageDialog(this, "Name could'n be Null");
			return;
		}

		if (jTextField2.getText().length() < 6 && jTextField2.getText().length() > 15) {
			JOptionPane.showMessageDialog(this, "The length of UserName need to be six to fifteen");
			return;
		}

		if (jTextField4.getText().length() < 6 && jTextField4.getText().length() > 15) {
			JOptionPane.showMessageDialog(this, "The length of Name need to be six to fifteen");
			return;
		}
		if (abc.getText().length() < 6 && abc.getText().length() > 15) {
			JOptionPane.showMessageDialog(this, "The length of Password need to be six to fifteen");
			return;
		}
		if (!jTextField4.getText().matches(regex)) {
			JOptionPane.showMessageDialog(this, "Name need to be conposed of letters and numbers");
			return;
		}
		if (!abc.getText().equals(abc1.getText())) {
			JOptionPane.showMessageDialog(this, "Password need to be equal to confirm password");
			return;
		}
		if (!jTextField2.getText().matches(regex)) {
			JOptionPane.showMessageDialog(this, "UserName need to be conposed of letters and numbers");
			return;
		}

		if (!abc.getText().matches(regex)) {
			JOptionPane.showMessageDialog(this, "Password need to be conposed of letters and numbers");
			return;
		} else {
			String sql[] = { "Insert into users values(?,?,?,null,?,?,?)", "call " + stype + " (?,?,?,?,?)" };
			try {
//				con = DBcls.getcon();
//				ps = con.prepareStatement(sql[0]);
//				ps.setString(1, jTextField2.getText());
//				ps.setString(3, abc.getText());
//				ps.setString(2, jComboBox3.getSelectedItem().toString());
//				ps.setString(5, jComboBox2.getSelectedItem().toString());
//				ps.setString(4, sex);
//				ps.setString(6, jTextField4.getText());
//				int i = ps.executeUpdate();
				con = DBcls.getcon();
				ps = con.prepareStatement(sql[1]);
				ps.setString(1, jTextField2.getText());
				ps.setString(2, abc.getText());
				ps.setString(4, jComboBox2.getSelectedItem().toString());
				ps.setString(3, sex);
				ps.setString(5, jTextField4.getText());
				System.out.println(ps);
				int i = ps.executeUpdate();
				if (i > 0) {
					JOptionPane.showMessageDialog(this, "Succeeded!");
					TheMainUI.frame.setContentPane(new Message3());
					TheMainUI.frame.setVisible(true);
				}

			} catch (Exception ex) {
				Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
			}

		}

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		int i = JOptionPane.showConfirmDialog(this, "Do you want to leave?", "Warning", WIDTH, WIDTH);

		if (i == 0) {
			TheMainUI.frame.setContentPane(new Message3());
			TheMainUI.frame.setVisible(true);

		}

	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		stype = type[jComboBox3.getSelectedIndex()];
	}

	// Variables declaration - do not modify
	private javax.swing.JPasswordField abc;
	private javax.swing.JPasswordField abc1;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JComboBox jComboBox3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JLabel jLabel9;
	// End of variables declaration
}
