import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;



public class Views extends JFrame {


	
	
	public JPanel contentPane;
	protected JTextField textField;
	protected JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Views frame = new Views();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				Controller c = new Controller();
				

				
			
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Views() {
		setBackground(Color.DARK_GRAY);
		
		setTitle("KİM 500 BİN İSTER");
		
		
		setType(Type.UTILITY);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 1076, 658);
		
		contentPane = new JPanel();
		
		contentPane.setBounds(getBounds());
		
		setContentPane(contentPane);
		
		contentPane.setBackground(Color.DARK_GRAY);
		
		
		
		
		Controller c = new Controller();
		//Crud işleminin gerçekleşeceği homePage'i contentPane'e basıyoruz
	System.out.println(	c.dataCount("questions"));
		
	c.homePage(contentPane);
		contentPane.setLayout(null);
	
		}
	}

