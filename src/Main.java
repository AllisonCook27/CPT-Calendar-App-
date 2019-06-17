import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setBounds(0, 0, 137, 16);
		popupMenu.setToolTipText("");
		popupMenu.setLabel("");
		addPopup(frame.getContentPane(), popupMenu);
		frame.getContentPane().setLayout(null);
		
		//menu items to add to the popup menu
		JMenuItem home = new JMenuItem("Home");
		JMenuItem personal = new JMenuItem("Personal planner");
		JMenuItem classPage = new JMenuItem("Class");
		JMenuItem exit = new JMenuItem("Exit");
		
		//when the items are clicked
		home.addActionListener(
				//the action listener
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						//check which page your on
						
					}
				}
				);
		//when the personal page is clicked
		personal.addActionListener(
				//the action listener
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						//check page
						
					}
				}
				);
		
		//thne class page selected 
		classPage.addActionListener(
				//the action listener
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				}
				);
		
		//when exit is clicked
		exit.addActionListener(
				//the action listener
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						//close the program
						System.exit(0);
						
					}
				}
				);
		
		//add the items to the menu
		popupMenu.add(home);
		popupMenu.add(personal);
		popupMenu.add(classPage);
		popupMenu.add(exit);
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
