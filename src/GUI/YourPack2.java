package GUI;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Player;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import java.awt.Font;

public class YourPack2 extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	JLabel CardDetails = new JLabel("");
	Player player = new Player("YuGi");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {				
					YourPack2 frame = new YourPack2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * */
	
	public YourPack2() {
		//   FRAME CONSTRUCT
		frame = new JFrame();
		getContentPane().setLayout(null);
		setResizable(false);
		setBounds(200, 50, 807, 733);
		frame.setTitle("YUGIOH");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
			
		
		
		//    BUTTONS
		//JButton[] butoane = new JButton[20];
		List<JButton>butoane = new Vector<>(20);
		
		
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnNewButton.setBounds(10, 102, 85, 21);
		getContentPane().add(btnNewButton);
		JButton btnPackCard_1 = new JButton("1");
		btnPackCard_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(0);
			}
		});
		
		
		btnPackCard_1.setBounds(160, 169, 63, 83);
		btnPackCard_1.setIcon(null);
		btnPackCard_1.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_1);
		
		JButton btnPackCard_2 = new JButton("2");
		btnPackCard_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(1);
			}
		});
		btnPackCard_2.setBounds(233, 169, 63, 83);
	
		btnPackCard_2.setIcon(null);
		btnPackCard_2.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_2);
		
		JButton btnPackCard_3 = new JButton("3");
		btnPackCard_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(2);
			}
		});
		btnPackCard_3.setBounds(306, 169, 63, 83);
		btnPackCard_3.setIcon(null);
		btnPackCard_3.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_3);
		
		JButton btnPackCard_4 = new JButton("4");
		btnPackCard_4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(3);
			}
		});
		btnPackCard_4.setBounds(379, 169, 63, 83);
		btnPackCard_4.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_4);
		
		JButton btnPackCard_5 = new JButton("5");
		btnPackCard_5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(4);
			}
		});
		btnPackCard_5.setBounds(452, 169, 63, 83);
		btnPackCard_5.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_5);
		
		JButton btnPackCard_6 = new JButton("6");
		btnPackCard_6.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(5);
			}
		});
		btnPackCard_6.setBounds(525, 169, 63, 83);
		btnPackCard_6.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_6);
		
		JButton btnPackCard_7 = new JButton("7");
		btnPackCard_7.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(6);
			}
		});
		btnPackCard_7.setBounds(598, 169, 63, 83);
		btnPackCard_7.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_7);
		
		JButton btnPackCard_8 = new JButton("8");
		btnPackCard_8.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(7);
			}
		});
		btnPackCard_8.setBounds(598, 268, 63, 83);
		btnPackCard_8.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_8);
		
		JButton btnPackCard_9 = new JButton("9");
		btnPackCard_9.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(8);
			}
		});
		btnPackCard_9.setBounds(525, 268, 63, 83);
		btnPackCard_9.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_9);
		
		JButton btnPackCard_10 = new JButton("10");
		btnPackCard_10.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(9);
			}
		});
		btnPackCard_10.setBounds(452, 268, 63, 83);
		btnPackCard_10.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_10);
		
		JButton btnPackCard_11 = new JButton("11");
		btnPackCard_11.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(10);
			}
		});
		btnPackCard_11.setBounds(379, 268, 63, 83);
		btnPackCard_11.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_11);
		
		JButton btnPackCard_12 = new JButton("12");
		btnPackCard_12.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(11);
			}
		});
		btnPackCard_12.setBounds(306, 268, 63, 83);
		btnPackCard_12.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_12);
		
		JButton btnPackCard_13 = new JButton("13");
		btnPackCard_13.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(12);
			}
		});
		btnPackCard_13.setBounds(233, 268, 63, 83);
		btnPackCard_13.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_13);
		
		JButton btnPackCard_14 = new JButton("14");
		btnPackCard_14.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(13);
			}
		});
		btnPackCard_14.setBounds(160, 268, 63, 83);
		btnPackCard_14.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_14);
		
		JButton btnPackCard_15 = new JButton("15");
		btnPackCard_15.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				cardDetails(14);
			}
		});
		btnPackCard_15.setBounds(598, 371, 63, 83);
		btnPackCard_15.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_15);
		
		JButton btnPackCard_16 = new JButton("16");
		btnPackCard_16.setBounds(525, 371, 63, 83);
		btnPackCard_16.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_16);
		
		JButton btnPackCard_17 = new JButton("17");
		btnPackCard_17.setBounds(452, 371, 63, 83);
		btnPackCard_17.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_17);
		
		JButton btnPackCard_18 = new JButton("18");
		btnPackCard_18.setBounds(379, 371, 63, 83);
		btnPackCard_18.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_18);
		
		JButton btnPackCard_19 = new JButton("19");
		btnPackCard_19.setBounds(306, 371, 63, 83);
		btnPackCard_19.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_19);
		
		JButton btnPackCard_20 = new JButton("20");
		btnPackCard_20.setBounds(233, 371, 63, 83);
		btnPackCard_20.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_20);
		
		JButton btnPackCard_21 = new JButton("21");
		
		btnPackCard_21.setBounds(160, 371, 63, 83);
		btnPackCard_21.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_21);
		
		JButton btnPackCard_22 = new JButton("22");
		btnPackCard_22.setBounds(598, 476, 63, 83);
		btnPackCard_22.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_22);
		
		JButton btnPackCard_23 = new JButton("23");
		btnPackCard_23.setBounds(525, 476, 63, 83);
		btnPackCard_23.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_23);
		
		JButton btnPackCard_24 = new JButton("24");
		btnPackCard_24.setBounds(452, 476, 63, 83);
		btnPackCard_24.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_24);
		
		JButton btnPackCard_25 = new JButton("25");
		btnPackCard_25.setBounds(379, 476, 63, 83);
		btnPackCard_25.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_25);
		
		JButton btnPackCard_26 = new JButton("26");
		btnPackCard_26.setBounds(306, 476, 63, 83);
		btnPackCard_26.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_26);
		
		JButton btnPackCard_27 = new JButton("27");
		btnPackCard_27.setBounds(233, 476, 63, 83);
		btnPackCard_27.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_27);
		
		JButton btnPackCard_28 = new JButton("28");
		btnPackCard_28.setBounds(160, 476, 63, 83);
		btnPackCard_28.setBackground(new Color(119, 136, 153));
		getContentPane().add(btnPackCard_28);
		
		
		
		butoane.add(btnPackCard_1);
		butoane.add(btnPackCard_2);
		butoane.add(btnPackCard_3);
		butoane.add(btnPackCard_4);
		butoane.add(btnPackCard_5);
		butoane.add(btnPackCard_6);
		butoane.add(btnPackCard_7);
		butoane.add(btnPackCard_8);
		butoane.add(btnPackCard_9);
		butoane.add(btnPackCard_10);
		butoane.add(btnPackCard_11);
		butoane.add(btnPackCard_12);
		butoane.add(btnPackCard_13);
		butoane.add(btnPackCard_14);
		butoane.add(btnPackCard_15);
		butoane.add(btnPackCard_16);
		butoane.add(btnPackCard_17);
		butoane.add(btnPackCard_18);
		butoane.add(btnPackCard_19);
		butoane.add(btnPackCard_20);
		
		
		CardDetails.setBounds(160, 10, 501, 97);
		getContentPane().add(CardDetails);
		
		
		
		
//	    PLAYER PACK CONSTRUCT
		int i =0 ;
		
// 		SET CARDS
		for (JButton b : butoane)
			if (i <= 14) {	
		b.setIcon(new ImageIcon(player.getPlayer_pack().getCards()[i].getImage()));
			i++;}
			

	
	
	
	}
	
	
//		HOVER
	
	public void cardDetails(int i) {
	
			CardDetails.setText(player.getPlayer_pack().getCards()[i].toString());
			
		};
}
