package systemUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;


public class Menu extends JFrame {

	/**
     * 
     */
    private static final long serialVersionUID = 1L;
	public static Menu menu;
	public CardLayout cl;
	public JPanel parent;
	public Delete delete;
	public Create create;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		menu = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		cl = new CardLayout();
		parent = new JPanel(cl);
		parent.setBorder(new EmptyBorder(5, 5, 5, 5));

		delete = new Delete();
		parent.add(delete, "del");

		create = new Create();
		parent.add(create, "cre");

		getContentPane().add(parent);
	}
}
