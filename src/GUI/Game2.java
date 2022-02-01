package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import classes.Player;

import java.awt.Toolkit;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class Game2 extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private int turn = 1;
	JPanel player_field = new JPanel();
	JPanel opp_field = new JPanel();
	Color magic_card_color = new Color(153, 204, 255);
	Color monster_card_color = new Color(153, 153, 153);
	Color hand_card_color = new Color(240, 240, 240);
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game2 frame = new Game2();
					frame.setVisible(true);
					Player player = new Player("Mihai");
					
								
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void change_field_color(int turn) {
		if (turn % 2 == 0) {
			opp_field.setForeground(Color.GREEN);
			opp_field.setBackground(Color.GREEN);
			player_field.setForeground(Color.BLACK);
			player_field.setBackground(Color.GRAY);
			
		}
		
		else if (turn % 2 != 0){
			opp_field.setForeground(Color.BLACK);
			opp_field.setBackground(Color.GRAY);
			player_field.setForeground(Color.GREEN);
			player_field.setBackground(Color.GREEN);
			
		}
		
	}
	
	
	
	
	
	/**
	 * Create the frame.
	 */
	public Game2() {
		setResizable(false);
		frame = new JFrame();
		setTitle("YU-GI-OH!");
		setForeground(new Color(102, 51, 51));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Darius\\Desktop\\OIP.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 807, 733);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(131, 137, 151));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	


		JButton btnPLGrave = new JButton("");
		btnPLGrave.setBounds(10, 575, 63, 83);
		btnPLGrave.setBackground(new Color(139, 69, 19));
		btnPLGrave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		getContentPane().add(btnPLGrave);
		
		JButton btnHand = new JButton("HAND1");
		btnHand.setBounds(176, 575, 63, 83);
		btnHand.setBackground(hand_card_color);
		getContentPane().add(btnHand);
		
		JButton btnHand_1 = new JButton("HAND2");
		btnHand_1.setBounds(249, 575, 63, 83);
		btnHand_1.setBackground(hand_card_color);
		getContentPane().add(btnHand_1);
		
		JButton btnHand_2 = new JButton("HAND3");
		btnHand_2.setBounds(322, 575, 63, 83);
		btnHand_2.setBackground(hand_card_color);
		getContentPane().add(btnHand_2);
		
		JButton btnHand_3 = new JButton("HAND4");
		btnHand_3.setBounds(395, 575, 63, 83);
		btnHand_3.setBackground(hand_card_color);
		getContentPane().add(btnHand_3);
		
		JButton btnHand_4 = new JButton("HAND5");
		btnHand_4.setBounds(468, 575, 63, 83);
		btnHand_4.setBackground(hand_card_color);
		getContentPane().add(btnHand_4);
		
		JButton btnHand_5 = new JButton("HAND6");
		btnHand_5.setBounds(541, 575, 63, 83);
		btnHand_5.setBackground(hand_card_color);
		getContentPane().add(btnHand_5);
		
		
		JButton btnOppack = new JButton("PACK");
		btnOppack.setBounds(701, 575, 63, 83);
		btnOppack.setIcon(new ImageIcon("C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\OIF.jpg"));
		getContentPane().add(btnOppack);
		
		JButton btnOpgrave = new JButton("opPACK");
		btnOpgrave.setIcon(new ImageIcon("C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\OIF.jpg"));
		btnOpgrave.setBounds(10, 38, 63, 83);
		btnOpgrave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnOpgrave);
		
		JButton btnOphand = new JButton("opHAND1");
		btnOphand.setIcon(new ImageIcon("C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\OIF.jpg"));
		btnOphand.setBounds(176, 38, 63, 83);
		btnOphand.setBackground(UIManager.getColor(hand_card_color));
		btnOphand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnOphand);
		
		JButton btnHand_1_1 = new JButton("opHAND2");
		btnHand_1_1.setIcon(new ImageIcon("C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\OIF.jpg"));
		btnHand_1_1.setBounds(249, 38, 63, 83);
		btnHand_1_1.setBackground(UIManager.getColor(hand_card_color));
		getContentPane().add(btnHand_1_1);
		
		JButton btnHand_2_1 = new JButton("opHAND3");
		btnHand_2_1.setIcon(new ImageIcon("C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\OIF.jpg"));
		btnHand_2_1.setBounds(322, 38, 63, 83);
		btnHand_2_1.setBackground(UIManager.getColor(hand_card_color));
		getContentPane().add(btnHand_2_1);
		
		JButton btnHand_3_1 = new JButton("opHAND4");
		btnHand_3_1.setIcon(new ImageIcon("C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\OIF.jpg"));
		btnHand_3_1.setBounds(395, 38, 63, 83);
		btnHand_3_1.setBackground(UIManager.getColor(hand_card_color));
		getContentPane().add(btnHand_3_1);
		
		JButton btnHand_4_1 = new JButton("opHAND5");
		btnHand_4_1.setIcon(new ImageIcon("C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\OIF.jpg"));
		btnHand_4_1.setBounds(468, 38, 63, 83);
		btnHand_4_1.setBackground(UIManager.getColor(hand_card_color));
		getContentPane().add(btnHand_4_1);
		
		JButton btnHand_5_1 = new JButton("opHAND6");
		btnHand_5_1.setIcon(new ImageIcon("C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\OIF.jpg"));
		btnHand_5_1.setBounds(541, 38, 63, 83);
		btnHand_5_1.setBackground(UIManager.getColor(hand_card_color));
		getContentPane().add(btnHand_5_1);
		
		JButton btnPlayer_Magic1 = new JButton("");
		btnPlayer_Magic1.setBounds(176, 482, 63, 83);
		btnPlayer_Magic1.setBackground(magic_card_color);
		btnPlayer_Magic1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnPlayer_Magic1);
		
		JButton btnPlayer_Magic2 = new JButton("");
		btnPlayer_Magic2.setBounds(249, 482, 63, 83);
		btnPlayer_Magic2.setBackground(magic_card_color);
		btnPlayer_Magic2.setForeground(new Color(0, 0, 0));
		getContentPane().add(btnPlayer_Magic2);
		
		JButton btnPlayer_Magic3 = new JButton("");
		btnPlayer_Magic3.setBounds(395, 482, 63, 83);
		btnPlayer_Magic3.setBackground(magic_card_color);
		btnPlayer_Magic3.setForeground(new Color(0, 0, 0));
		getContentPane().add(btnPlayer_Magic3);
		
		JButton btnPlayer_Magic4 = new JButton("");
		btnPlayer_Magic4.setBounds(322, 482, 63, 83);
		btnPlayer_Magic4.setBackground(magic_card_color);
		btnPlayer_Magic4.setForeground(new Color(0, 0, 0));
		getContentPane().add(btnPlayer_Magic4);
		
		JButton btnPlayer_Magic5 = new JButton("");
		btnPlayer_Magic5.setBounds(541, 482, 63, 83);
		btnPlayer_Magic5.setBackground(magic_card_color);
		btnPlayer_Magic5.setForeground(new Color(0, 0, 0));
		getContentPane().add(btnPlayer_Magic5);
		
		JButton btnPlayer_Magic6 = new JButton("");
		btnPlayer_Magic6.setBounds(468, 482, 63, 83);
		btnPlayer_Magic6.setBackground(magic_card_color);
		btnPlayer_Magic6.setForeground(new Color(0, 0, 0));
		getContentPane().add(btnPlayer_Magic6);
		
		JButton btnOpp_Magic1 = new JButton("");
		btnOpp_Magic1.setBounds(249, 131, 63, 83);
		btnOpp_Magic1.setBackground(magic_card_color);
		getContentPane().add(btnOpp_Magic1);
		
		JButton btnOpp_Magic2 = new JButton("");
		btnOpp_Magic2.setBounds(176, 131, 63, 83);
		btnOpp_Magic2.setBackground(magic_card_color);
		getContentPane().add(btnOpp_Magic2);
		
		JButton btnOpp_Magic3 = new JButton("");
		btnOpp_Magic3.setBounds(395, 131, 63, 83);
		btnOpp_Magic3.setBackground(magic_card_color);
		getContentPane().add(btnOpp_Magic3);
		
		JButton btnOpp_Magic4 = new JButton("");
		btnOpp_Magic4.setBounds(322, 131, 63, 83);
		btnOpp_Magic4.setBackground(magic_card_color);
		getContentPane().add(btnOpp_Magic4);
		
		JButton btnOpp_Magic5 = new JButton("");
		btnOpp_Magic5.setBounds(541, 131, 63, 83);
		btnOpp_Magic5.setBackground(magic_card_color);
		getContentPane().add(btnOpp_Magic5);
		
		JButton btnOpp_Magic6 = new JButton("");
		btnOpp_Magic6.setBounds(468, 131, 63, 83);
		btnOpp_Magic6.setBackground(magic_card_color);
		getContentPane().add(btnOpp_Magic6);
		
		JButton btnPlayer_Mnstr1 = new JButton("");
		btnPlayer_Mnstr1.setBounds(176, 368, 63, 83);
		btnPlayer_Mnstr1.setBackground(monster_card_color);
		btnPlayer_Mnstr1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnPlayer_Mnstr1);
		
		JButton btnPlayer_Mnstr2 = new JButton("");
		btnPlayer_Mnstr2.setBounds(249, 368, 63, 83);
		btnPlayer_Mnstr2.setBackground(monster_card_color);
		getContentPane().add(btnPlayer_Mnstr2);
		
		JButton btnPlayer_Mnstr3 = new JButton("");
		btnPlayer_Mnstr3.setBounds(322, 368, 63, 83);
		btnPlayer_Mnstr3.setBackground(monster_card_color);
		getContentPane().add(btnPlayer_Mnstr3);
		
		JButton btnPlayer_Mnstr4 = new JButton("");
		btnPlayer_Mnstr4.setBounds(395, 368, 63, 83);
		btnPlayer_Mnstr4.setBackground(monster_card_color);
		getContentPane().add(btnPlayer_Mnstr4);
		
		JButton btnPlayer_Mnstr5 = new JButton("");
		btnPlayer_Mnstr5.setBounds(468, 368, 63, 83);
		btnPlayer_Mnstr5.setBackground(monster_card_color);
		getContentPane().add(btnPlayer_Mnstr5);
		
		JButton btnPlayer_Mnstr6 = new JButton("");
		btnPlayer_Mnstr6.setBounds(541, 368, 63, 83);
		btnPlayer_Mnstr6.setBackground(monster_card_color);
		getContentPane().add(btnPlayer_Mnstr6);
		
		JButton btnOpp_Mnstr2 = new JButton("");
		btnOpp_Mnstr2.setBounds(468, 249, 63, 83);
		btnOpp_Mnstr2.setBackground(monster_card_color);
		getContentPane().add(btnOpp_Mnstr2);
		
		JButton btnOpp_Mnstr1 = new JButton("");
		btnOpp_Mnstr1.setBounds(541, 249, 63, 83);
		btnOpp_Mnstr1.setBackground(monster_card_color);
		getContentPane().add(btnOpp_Mnstr1);
		
		JButton btnOpp_Mnstr3 = new JButton("");
		btnOpp_Mnstr3.setBounds(322, 249, 63, 83);
		btnOpp_Mnstr3.setBackground(monster_card_color);
		getContentPane().add(btnOpp_Mnstr3);
		
		JButton btnOpp_Mnstr4 = new JButton("");
		btnOpp_Mnstr4.setBounds(395, 249, 63, 83);
		btnOpp_Mnstr4.setBackground(monster_card_color);
		getContentPane().add(btnOpp_Mnstr4);
		
		JButton btnOpp_Mnstr5 = new JButton("");
		btnOpp_Mnstr5.setBounds(176, 249, 63, 83);
		btnOpp_Mnstr5.setBackground(monster_card_color);
		getContentPane().add(btnOpp_Mnstr5);
		
		JButton btnOpp_Mnstr6 = new JButton("");
		btnOpp_Mnstr6.setBounds(249, 249, 63, 83);
		btnOpp_Mnstr6.setBackground(monster_card_color);
		getContentPane().add(btnOpp_Mnstr6);
		
		JButton btnExitBtn = new JButton("exit");
		btnExitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object[] options = {"YES",
	                    "NO"};
				int n = JOptionPane.showOptionDialog(frame,
	    "Are you sure you want to exit?",
	    "EXIT MATCH",
	    JOptionPane.YES_NO_OPTION,
	    JOptionPane.QUESTION_MESSAGE,
	    null,
	    options,
	    options[1]);
				if (n == JOptionPane.YES_OPTION)				
					dispose();
			
			}
		});
		
		btnExitBtn.setBounds(0, 334, 85, 21);
		getContentPane().add(btnExitBtn);
		
		JButton btnTurnSwitch = new JButton("end turn");
		btnTurnSwitch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turn++;
				change_field_color(turn);
			}
		});
		btnTurnSwitch.setBounds(683, 334, 85, 21);
		getContentPane().add(btnTurnSwitch);
		
		JButton btnOpgrave_1 = new JButton("");
		btnOpgrave_1.setBackground(new Color(139, 69, 19));
		btnOpgrave_1.setBounds(701, 38, 63, 83);
		contentPane.add(btnOpgrave_1);
		
		
		
		opp_field.setForeground(Color.BLACK);
		opp_field.setBackground(Color.GRAY);
		opp_field.setBounds(10, 10, 773, 21);
		contentPane.add(opp_field);
		
		JLabel lblOpponentsTurn = new JLabel("OPPONENT'S TURN");
		lblOpponentsTurn.setForeground(Color.GRAY);
		opp_field.add(lblOpponentsTurn);
		
		
		player_field.setForeground(new Color(112, 128, 144));
		player_field.setBackground(Color.GREEN);
		player_field.setBounds(10, 664, 773, 21);
		contentPane.add(player_field);
		
		JLabel lblNewLabel_1 = new JLabel("YOUR TURN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		player_field.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.GRAY);
		
		JLabel lbOppHP = new JLabel("8000HP");
		lbOppHP.setForeground(new Color(0, 255, 0));
		lbOppHP.setBackground(SystemColor.windowText);
		lbOppHP.setFont(new Font("Cinzel Black", Font.BOLD, 22));
		lbOppHP.setBounds(683, 249, 100, 21);
		contentPane.add(lbOppHP);
		
		JLabel lbPlayerHP = new JLabel("8000HP");
		lbPlayerHP.setForeground(new Color(0, 255, 0));
		lbPlayerHP.setFont(new Font("Cinzel Black", Font.BOLD, 22));
		lbPlayerHP.setBackground(new Color(0, 0, 0));
		lbPlayerHP.setBounds(683, 430, 100, 21);
		contentPane.add(lbPlayerHP);
	

	}
}

