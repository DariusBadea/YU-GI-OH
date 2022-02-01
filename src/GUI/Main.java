package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import classes.Card;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Main {

	private JFrame frame;

	private Main window;
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
		frame.setTitle("YUGIOH");
		frame.setBounds(200, 50, 650, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("NEW GAME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game2 gamewindow = new Game2();
				gamewindow.setVisible(true);
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		btnNewButton.setBounds(250, 58, 159, 68);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnOptions = new JButton("OPTIONS");
		btnOptions.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOptions.setBounds(250, 214, 159, 68);
		frame.getContentPane().add(btnOptions);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object[] options = {"YES",
                "NO"};
		int n = JOptionPane.showOptionDialog(frame,
				"Are you sure you want to exit?",
				"EXIT GAME",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[1]);
			if (n == JOptionPane.YES_OPTION)				
				frame.dispose();
	
	}
});
				
	
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setBounds(250, 365, 159, 68);
		frame.getContentPane().add(btnExit);
		
		JButton btnExit_1 = new JButton("YOUR PACK");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YourPack2 packwindow = new YourPack2();
				packwindow.setVisible(true);
				
			}
		});
		btnExit_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit_1.setBounds(250, 136, 159, 68);
		frame.getContentPane().add(btnExit_1);
	}
}
