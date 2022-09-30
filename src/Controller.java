import java.awt.Color;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.Image;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import com.mysql.cj.protocol.Resultset;

public class Controller extends databaseConnect {
	
int sessionID = 0; 


public ArrayList <String> [] sorular = new ArrayList[dataCount("questions")]; 


public String cevap = "";


ArrayList<Integer> sira = new ArrayList(dataCount("questions"));

















int dogru = 0 ;

int point = 0; 

int j = 0 ;
	
int i = 0 ;
	/*
	 * PROJEYE AİT BÜTÜN METHODLAR CONTROLLER CLASSININ İÇERİSİNDE TANIMLANIR VE BÜTÜN 
	 * 
	 * KULLANIMLAR BU CLASS ÜZERİNDEN GERÇEKLEŞİR...
	 * 
	 * 
	 * PROJE KAPSAMINDAKİ HOMEPAGE,ADMİNPAGE,PLAYPAGE SAYFLARI BU CLASSTA TANIMLANIR,
	 * 
	 * GEREKEN DURUMLARDA GEREKEN PAGE VİEWS CLASSINA GÖNDERİLİP CONTENTPANE'E BASILIR
	 */
	






public void questionAdd(JPanel t)
{
	
	JPanel panel = new JPanel();
	
	panel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), null));
	
	panel.setBounds(50, 0, 950, 700);
	
	t.add(panel);
	
	panel.setLayout(null);
	
	
	JTextField questionField = new JTextField();
	
	questionField.setHorizontalAlignment(SwingConstants.CENTER);
	
	questionField.setFont(new Font("YU Gothic UI",Font.BOLD,20));
	
	
	
	
	questionField.setBounds(85,120,800,150);
	
	panel.add(questionField);
	
	
	JLabel feedBack = new JLabel ();
	
	
	feedBack.setBounds(250,0,430,50);
	
	
	feedBack.setFont(new Font("YU Gothich UI",Font.BOLD,20));
	
	feedBack.setForeground(Color.BLACK);
	
	feedBack.setHorizontalAlignment(SwingConstants.CENTER);
	
	Image image = new ImageIcon(this.getClass().getResource("/backspace.png")).getImage();
	
	
	JButton goBack = new JButton();
	
	goBack.setIcon( new ImageIcon(image));
	
	goBack.setBounds(0,0,50,50);
	
	panel.add(goBack);
	
	
	
	panel.add(feedBack);
	
	JLabel questionAdd = new JLabel("Soru Metni :");
	
	questionAdd.setFont(new Font("YU Gothich UI",Font.BOLD,20));
	
	questionAdd.setBounds(425,90,150,30);
	
	questionAdd.setOpaque(true);
	
	panel.add(questionAdd);
	
	JButton newAdd = new JButton();
	
	newAdd.setBounds(350,550,250,40);
	
	newAdd.setForeground(Color.BLACK);
	
	newAdd.setHorizontalAlignment(SwingConstants.CENTER);
	
	newAdd.setFont(new Font("YU Gothic UI",Font.BOLD,22));
	
	newAdd.setText("EKLE");

	
	JTextField option1 = new JTextField(); 
	
	option1.setBounds(390,300,200,30);
	
	option1.setHorizontalAlignment(SwingConstants.CENTER);
	
	panel.add(option1);
	
	
	
	JTextField option2 = new JTextField(); 
	
	option2.setHorizontalAlignment(SwingConstants.CENTER);
	
	option2.setBounds(390,350,200,30);



	panel.add(option2);
	
	
	JTextField option3 = new JTextField(); 
	
	
	option3.setHorizontalAlignment(SwingConstants.CENTER);

	
	option3.setBounds(390,400,200,30);

	
	panel.add(option3);
	

	
	
	
	JTextField option4 = new JTextField(); 
	
	option4.setHorizontalAlignment(SwingConstants.CENTER);

	option4.setBounds(390,450,200,30);

	
	panel.add(option4);
	
	
	JLabel option1Add = new JLabel("Şık Ekle :");
	
	option1Add.setFont(new Font("YU Gothich UI",Font.BOLD,15));
	
	option1Add.setBounds(455,275,100,30);
	
	option1Add.setOpaque(true);
	
	panel.add(option1Add);
	
	
	
	
	JLabel option2Add = new JLabel("Şık Ekle :");
	
	option2Add.setFont(new Font("YU Gothich UI",Font.BOLD,15));
	
	option2Add.setBounds(455,325,200,30);
	
	option2Add.setOpaque(true);
	
	panel.add(option2Add);
	
	
	
	
	
	JLabel option3Add = new JLabel("Şık Ekle :");
	
	option3Add.setFont(new Font("YU Gothich UI",Font.BOLD,15));
	
	option3Add.setBounds(455,375,200,30);
	
	option3Add.setOpaque(true);
	
	panel.add(option3Add);
	
	
	
	
	
	JLabel option4Add = new JLabel("Şık Ekle :");
	
	option4Add.setFont(new Font("YU Gothich UI",Font.BOLD,15));
	
	option4Add.setBounds(455,425,100,30);
	
	option4Add.setOpaque(true);
	
	panel.add(option4Add);
	
	
	panel.add(newAdd);
	
	
	

	
	
	JRadioButton optionn1 = new JRadioButton("");
	
	 optionn1.setBounds(370,300,17,30);
	
	 panel.add(optionn1);
	 
	 
	 JRadioButton optionn2 = new JRadioButton("");
		
	 optionn2.setBounds(370,350,17,30);
	
	 panel.add(optionn2);
	 
	 
	 
	 JRadioButton optionn3 = new JRadioButton("");
		
	 optionn3.setBounds(370,400,17,30);
	
	 panel.add(optionn3);
	 
	 
	 
	 JRadioButton optionn4 = new JRadioButton("");
		
	 optionn4.setBounds(370,450,17,30);
	
	 panel.add(optionn4);
	 
	 
	 ButtonGroup bg = new ButtonGroup();
	 
	 bg.add(optionn1);
	 
	 bg.add(optionn2);
	 
	 bg.add(optionn3);
	 
	 bg.add(optionn4);
	
	
	ActionListener al = new ActionListener() 
			
	{
		
		public void actionPerformed(ActionEvent e)
		{
			String dogruCevap ="" ;
			
			
			if(optionn1.isSelected()) dogruCevap = option1.getText();
			
			if(optionn2.isSelected()) dogruCevap = option2.getText();
			
			if(optionn3.isSelected()) dogruCevap = option3.getText();
			
			if(optionn4.isSelected()) dogruCevap = option4.getText();
			
			String SQL2 = "insert into questions (questionText,option1,option2,option3,option4,trueOption)"
					+"values("
					+ "('"+questionField.getText()+"'),"
					+ "('"+option1.getText().toString()+"'),"
					+ "('"+option2.getText().toString()+"'),"
					+ "('"+option3.getText().toString()+"'),"
					+ "('"+option4.getText().toString()+"'),"
					+ "('"+dogruCevap+"')"
							+ ");";
					
		
			
			if(e.getSource()==newAdd)
			{
				
				
				Statement statement2;
				
				
				
				int rs2;
				
				
				try {
					
					
					
					statement2 = connect.createStatement();
					
					rs2 = statement2.executeUpdate(SQL2);
					
					feedBack.setText("Soru Ekleme İşlemi Başarıyla Gerçekleşti...");
					
					feedBack.setForeground(Color.GREEN);
					
				}catch(SQLException exx)
				{

					
					
					feedBack.setForeground(Color.RED);
					
					feedBack.setText("Soru Ekleme İşlemi Gerçekleştirilirken Hata...");
					
					exx.printStackTrace();
					
					
					
				}
				
				

				
				
				
			}
			
			
			
			if(e.getSource()==goBack)
			{
				
				
				t.removeAll();
				
				try {
					adminPage(t);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				t.repaint();
			}
			
			
			
			
		}
		
		
	};
	
	
	
	newAdd.addActionListener(al);
	goBack.addActionListener(al);
	
	
	
	
	
	
	
	
	
	
}

	
public String check(String buton ) throws SQLException  
{		
	

	
	String SQL = "Select * from questions WHERE trueOption = '"+ buton + "';";
	
		Statement statement ;
		
		ResultSet rs =null ;
		
	try {	
		statement=connect.createStatement();
		
		rs = statement.executeQuery(SQL);
		
	
		
		
	
	}catch(SQLException x) {
		
		x.printStackTrace();
	}
	
	
	while(rs.next()) {
		
		cevap = rs.getString("trueOption");
	}

	return cevap;
	
	
	
		

	
	
}
	
	
	
	public int  dataCount(String tableName) 
	{
	
	 
	int dataCount = 0 ;
		
		try {
			
			String SQL = "Select * from kim_500_bin_ister."+ tableName +";"; 
			
			Statement statement = connect.createStatement();
			
			ResultSet rs = statement.executeQuery(SQL);
			
			while(rs.next())
			{
				
				
			dataCount= rs.getRow();
				
			
				
			}
			
			
			
		}catch (SQLException e )
		{
			
			e.printStackTrace();
		}
		
		
		return dataCount ;
		
		
	}
	
	

	


	
	
	
	
	
	public ArrayList<String> [] questionFetch() throws SQLException
	{
		
	
		
		int i = 0;
		
		int j = 0 ;
		
		String SQL = "select * from kim_500_bin_ister.questions ";
		
		Statement statement;
		
		ResultSet rs = null;
		try {	
			
			
			statement = connect.createStatement();
			
			rs = statement.executeQuery(SQL);
			
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
	
		
		while (rs.next())
		{
			
			
			
			sorular [i]= new ArrayList<String>(Arrays.asList((
					
					rs.getString("questionText")),
					
					rs.getString("option1"),
					
					rs.getString("option2"),
					
					rs.getString("option3"),
					
					rs.getString("option4"),
					
					rs.getString("trueOption")
				
					
					
					
					));
						
			i++;
			
			
		
		}
	
		
		
		return sorular ;
		
		
	}
	

	
	
	
	
	
	
	public void homePage(JPanel t) 
	
	{
		
		
		Image img = new ImageIcon(this.getClass().getResource("/milyoner.png")).getImage();
		
		t.setLayout(null);
		
		JPanel panel = new JPanel();
		
		panel.setBounds(675, 120, 431, 363);
		
		panel.setOpaque(false);
		
		t.add(panel);
		
		panel.setLayout(null);
		
		JLabel userNameLabel = new JLabel("KULLANICI ADI :");
		
		userNameLabel.setForeground(Color.WHITE);
		
		userNameLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 25));
		
		userNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		userNameLabel.setBounds(130, 11, 200, 33);
		
		panel.add(userNameLabel);
		
		JLabel passwordLabel = new JLabel("ŞİFRE :");
		
		passwordLabel.setForeground(Color.WHITE);
		
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		passwordLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 25));
		
		passwordLabel.setBounds(140, 128, 200, 33);
		
		panel.add(passwordLabel);
		
	    JTextField userName = new JTextField();
	    
	    userName.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    userName.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
	    
		userName.setBounds(120, 73, 230, 30);
		
		panel.add(userName);
		
		
		
		password= new JPasswordField();
		
		password.setHorizontalAlignment(SwingConstants.CENTER);
		
		password.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		
		password.setBounds(120,168,230,30);
		
		panel.add(password);
		
		
		JButton girisYap = new JButton("Giriş Yap");
	
		girisYap.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		
		girisYap.setBounds(176, 237, 122, 43);
		
		panel.add(girisYap);
		
		JLabel feedbackLabel = new JLabel("");
		
		feedbackLabel.setBounds(0, 300, 421, 30);
		
		panel.add(feedbackLabel);
		
		feedbackLabel.setForeground(Color.RED);
		
		feedbackLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		feedbackLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		
		JButton UyeOl = new JButton("Hesabın mı Yok ? Hemen Üye Ol !");
		
		UyeOl.setBounds(621, 533, 400, 52);
		
		UyeOl.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		
		t.add(UyeOl);
		
		
		JLabel Logo = new JLabel("");
		
		
		Logo.setBounds(0, 0, 1062, 621);
		
		t.add(Logo);
		
		Logo.setIcon(new ImageIcon(img));
		
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		ActionListener al = new ActionListener(){
			
		//Giriş Yap Butonuna basıldığı zaman database'den user tablosundaki verileri çekiyor
		//ve Authentication işlemini gerçekleştiriyoruz,hatalı ise sisteme girişe izin vermiyoruz
			
			
			
	//************************* Authentication CONTROL MOUSE CLİCK*****************************
			public void actionPerformed(ActionEvent e) 
			{	
			
				if(e.getSource()==girisYap) 
				{
					
				
				String UserName = userName.getText();
				
				String Password = password.getText().toString();
				
				Controller c = new Controller();
				
				
				
			
				if(c.adminAuthentication(UserName, Password)) {
					feedbackLabel.setForeground(Color.GREEN);
					
					feedbackLabel.setText("Admin Girişi Başarılı....");
				
					
					t.removeAll();
					t.repaint();
					try {
						c.adminPage(t);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
				
				
				
				try {
					if(c.Authentication(UserName, Password)) 
					{
						
						feedbackLabel.setForeground(Color.GREEN);
						
						feedbackLabel.setText("Giriş Başarılı....");
						
						t.removeAll();
						
						
						c.playStart(t);
					
						
						t.repaint();
						
						
						
					
						
						
					}
					
							
					
					

					
					else if (userName.getText().equals("") || password.getText().equals(""))
					{
						
						userName.setBackground(new Color(255,0,0));
						password.setBackground(new Color(255,0,0));
						feedbackLabel.setForeground(new Color(255,0,0));
						feedbackLabel.setText("Kullanıcı Adı ve Şifre Alanları Boş Bırakılamaz");
							
					}
					
					
					else 
					{
						
						userName.setBackground(new Color(255,0,0));
						password.setBackground(Color.RED);
						feedbackLabel.setForeground(Color.RED);
						feedbackLabel.setText("Kullanıcı Adı veya Şifre Yanlış....");
						
						
					
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
				
				if(e.getSource()==UyeOl)
				{
					Controller c = new Controller();
					t.setBackground(Color.CYAN);
					t.removeAll();
					t.repaint();
					c.signUpPage(t);
					
					
					
					
				}
		
			}};
			
			girisYap.addActionListener(al);
			UyeOl.addActionListener(al);

		
		
		//Authentication start





}
	
	
	
	
	public boolean adminAuthentication(String userName,String userPassword) {
		String SQL = "Select * From kim_500_bin_ister.users where UserName='admin';";
		String adminUser = "" ;
		String adminPassword= "" ;
		
			
				try {
			
				
				Statement statement= connect.createStatement();
				
				ResultSet rs = statement.executeQuery(SQL);
				
				while(rs.next())
				{
					
					adminUser = rs.getString("userName");
					
					adminPassword= rs.getString("userPassword");
					
			if(userName.equals(adminUser) && userPassword.equals(adminPassword)) 
				{
				
				return true;
				}
					
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
				
				

				return false;
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	


	public void playStart(JPanel t) 
	{	
		
		t.setLayout(null);
		
Image img = new ImageIcon(this.getClass().getResource("/milyoner.png")).getImage();
		
		JPanel startButtonPanel = new JPanel();
		
		startButtonPanel.setBounds(750, 300, 301, 65);
		
		startButtonPanel.setOpaque(true);
		
		startButtonPanel.setBackground(Color.black);
		
		startButtonPanel.setLayout(null);
		
		
		
		
		JLabel backGround = new JLabel();
		
		backGround.setIcon(new ImageIcon(img));
		
		backGround.setBounds(0, 0, 1062, 621);
		
	
		//önce paneli eklemezsen panel labelin içinde kalacağı için paneli de butonu da göremezsin
		
		t.add(startButtonPanel);
		
	
		t.add(backGround);
		
		
		
		JButton startButton = new JButton();
		
		startButton.setBounds(2,3, 298, 60);
		
		startButton.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLACK, null));
		
		startButton.setBackground(Color.YELLOW);
		
		startButton.setFont(new Font("Comic Sans MS",Font.BOLD, 30));
		
		startButton.setText("Oyuna Başla");
		
		startButton.setForeground(Color.BLACK);
		
		startButtonPanel.add(startButton);
		
		
	ActionListener al = new ActionListener() {
		
		public void actionPerformed(ActionEvent e)
		{
			
		if(	e.getSource()==startButton ) 
		{
			t.removeAll();
			t.repaint();
			try {
				start(t);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
			
			
		}
		
		
	};
	
	startButton.addActionListener(al);
	
	
	
	
	}
	
	

	
	
	
	
	public void signUpPage(JPanel t)
	{
		

		JPanel panel = new JPanel();
		
		panel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), null));
		
		panel.setBounds(83, 30, 927, 512);
		
		t.add(panel);
		
		panel.setLayout(null);
		
		
		JPasswordField userPassword = new JPasswordField();
		
		userPassword.setBounds(330, 251, 300, 30);
		
		panel.add(userPassword);
		
		userPassword.setHorizontalAlignment(SwingConstants.CENTER);
		
		JTextField userName = new JTextField();
		
		userName.setHorizontalAlignment(SwingConstants.CENTER);
		
		userName.setFont(new Font("Yu Gothic UI",Font.BOLD,20));
		
		userName.setBounds(330, 194, 300, 30);
		
		panel.add(userName);
		
		
		JLabel user = new JLabel("Kullanıcı Adı : ");
		
		user.setBounds(165, 191, 140, 30);
		
		panel.add(user);
		
		user.setHorizontalAlignment(SwingConstants.CENTER);
		
		user.setForeground(Color.BLACK);
	
		user.setFont(new Font("Yu Gothic UI", Font.BOLD, 21));
		
		
		JLabel lblSifre = new JLabel("Şifre:");
		
		lblSifre.setBounds(172, 257, 140, 30);
		
		panel.add(lblSifre);
		
		lblSifre.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblSifre.setForeground(Color.BLACK);
		
		lblSifre.setFont(new Font("Yu Gothic UI", Font.BOLD, 21));
		
		
		JButton create = new JButton("KAYDET");
		
		Image image = new ImageIcon(this.getClass().getResource("/backspace.png")).getImage();
		
		JButton goBack = new JButton();
		
		goBack.setIcon( new ImageIcon(image));
		
		goBack.setBounds(0,0,50,50);
		
		create.setBackground(Color.GREEN);
		
		create.setBounds(372, 342, 214, 41);
		
		panel.add(create);
		
		panel.add(goBack);
		
		create.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		
		JLabel feedBack = new JLabel("");
		
		feedBack.setHorizontalAlignment(SwingConstants.CENTER);
		
		feedBack.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		
		feedBack.setBounds(180, 130, 595, 28);
		
		panel.add(feedBack);
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		
		lblNewLabel_1.setBounds(165, 72, 595, 59);
		
		panel.add(lblNewLabel_1);
		

		

		
		
		ActionListener al = new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) 
			{Controller c = new Controller();
				
				
			if(e.getSource()==goBack) 
			{
			
				
				t.removeAll();
				t.repaint();
				c.homePage(t);
				
			}
			
			if(e.getSource() == create) {
				
				
				String SQL = "Insert Into kim_500_bin_ister.users"
						+ "("
						+ "userName,"
						+ "userPassword"
						+ ") "
						+ "values("+" ' "+userName.getText()+" ' "+","+"'"+userPassword.getText()+"')";
				
				Statement statement;
				try {
					if(userName.getText().equals("") ||  userPassword.getText().equals(""))
					{
						feedBack.setForeground(Color.RED);
						feedBack.setText("Kullanıcı Adı Veya Şifre  Alanları Boş Bırakılamaz...");
						
						
						
					}
					
					else 
					{
						
					statement = connect.createStatement();
					int rs = statement.executeUpdate(SQL);
					
					feedBack.setForeground(Color.GREEN);
					feedBack.setText("Üyelik Başarıyla Oluşturuldu "
							+ "Devam Edebilmek İçin Lütfen Giriş Yapın"); 
					
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					feedBack.setForeground(Color.RED);
					feedBack.setText("Üyelik Oluşturulamadı...");
					e1.printStackTrace();
				}
			}
			
			}
			
			};
		
	goBack.addActionListener(al);
	create.addActionListener(al);
	}
	
	
	
	
	
	
	
	
	
	
	//id istediğim gibi gelmediği için ıd yi istediğim formata dönüştürecek methodu yazdım
	public int stringIDCreator(String userName)
	{
		
		
		int userID = 0;
		
		int i = 0;
		
		String SQL ="selecr userID from users where userName="+userName+";";
		
		
		Statement st;
		
		ResultSet rs;
		try {
			st = connect.createStatement();
			
			rs = st.executeQuery(SQL);
			
			while(rs.next())
			{
				
				userID = rs.getInt("userID");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userID;
		
	}
	

	protected JTextField textField;
	protected JPasswordField password;
	
	
	
	ArrayList  <String>  Datas = new ArrayList <> ();
	String userAdmin = "";
	String passwordAdmin = "" ;
	int idAdmin;

	int userID;
	
	
	
	
	
public boolean eme(String userName,String userPassword) {
	String SQL = "Select * From kim_500_bin_ister.users where UserName='admin';";
	String adminUser = "" ;
	String adminPassword= "" ;
	
		
			try {
		
			
			Statement statement= connect.createStatement();
			
			ResultSet rs = statement.executeQuery(SQL);
			
			while(rs.next())
			{
				
				adminUser = rs.getString("userName");
				
				adminPassword= rs.getString("userPassword");
				
		if(userName.equals(adminUser) && userPassword.equals(adminPassword)) 
			{
			
			return true;
			}
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			
			

			return false;
		
		
	
}
	
	
	
	public boolean Authentication(String userName , String password ) throws SQLException {
		
		Controller c = new Controller();
	
		String Sorgu = "Select userID,userName,userPassword from kim_500_bin_ister.users ;";
		
		String [] userNamee = new String [dataCount("users")] ;
		
		String [] passwordd = new String [dataCount("users")]; 
		
		
		
		int i = 0;
		
		Statement statement ;
		
		ResultSet rs = null;
		
		try { 
			
			 statement = connect.createStatement();
			
			
			
			 rs = (ResultSet) statement.executeQuery(Sorgu);
			
			
			
			
				
			
	
		}catch(SQLException hata) {
			
			hata.printStackTrace();
			
			
		}
		
		
		while(((ResultSet) rs).next()) {
			
			
			userNamee[i] = ((ResultSet) rs).getString("userName");
			
			passwordd[i] = ((ResultSet) rs ).getString("userPassword");
		
			
			sessionID  = ((ResultSet)rs).getInt("userID");
			
			
			if(adminAuthentication(userName, password)) return false;
			
			
			
			
			if(userName.equals(userNamee[i]) && password.equals(passwordd[i]) ) {
				
				
				
				return true ;
				
			}
			
		
			
			
		}
		
		
		return false ; 
		
		
		
		

		
}
	
	
public void adminPage(JPanel t) throws SQLException 
{
	
	Controller.statement=connect.createStatement();
	
	
	
	t.removeAll();
	
	t.setBackground(Color.CYAN);
	
	 String adminSql = "select userName,userPassword from kim_500_bin_ister.users where userID=1";
	
	ResultSet adminFetch = statement.executeQuery(adminSql);
	
	while(adminFetch.next()) 
	{
	
	userAdmin = ((ResultSet) adminFetch ).getString("userName").toString();
	
	passwordAdmin = ((ResultSet) adminFetch ).getString("userpassword").toString();

	}
	
	
	t.removeAll();
	
	t.repaint();
	
	
	
	
	JButton [] buttons = new JButton [5];
	
	JLabel []  labels = new JLabel [5];
	
	Image userAdd= new ImageIcon(this.getClass().getResource("/userAdd.png")).getImage();
	
	Image userRemove = new ImageIcon(this.getClass().getResource("/userRemove.png")).getImage();
	
	Image questionAdd = new ImageIcon(this.getClass().getResource("/questionAdd.jpg")).getImage();
	
	Image scoreView = new ImageIcon(this.getClass().getResource("/score.png")).getImage();

	this.Authentication(adminSql, adminSql);
	
	//grid yerleşim ile butonların oluşturulması ve konuçlandırılması
	
	for(int i = 0 ; i < 3 ;i ++) {
		
		buttons[i] = new JButton();
		
		buttons[i].setBounds(50+i*210+150, 200, 205, 200);
		
		
		if(i==0) buttons [0].setIcon(new ImageIcon(userAdd));
		
		if(i == 1) buttons [1].setIcon(new ImageIcon(userRemove));
		
		if(i == 2) buttons [2].setIcon(new ImageIcon(questionAdd));
		
		t.add(buttons[i]);
		
		for (int j = 0 ; j < 3 ; j++ ) {
			
			labels [j]= new JLabel();
			
			labels[j].setBounds(50+j*210+150, 330, 200, 200);
			
			labels[j].setForeground(Color.BLACK);
			
			labels[j].setHorizontalAlignment(SwingConstants.CENTER);
			
			labels[j].setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
			
			
			if (j == 0 ) 
			{ 
				labels[j].setText("YENİ KULLANICI EKLE");
				
			}
			
			if (j == 1 ) 
			{
				labels[j].setText("KULLANICI SİL");
			}
			
			if (j == 2 ) 
			{
				labels[j].setText("  SORU EKLE ");
			}
			
			t.add(labels[j]);
			
			
	
		}
	

	}
	
	
	
	ActionListener event = new ActionListener() {
		

		@Override
		public void actionPerformed(ActionEvent e) {
			if( e.getSource()==buttons[0]) 
			{
				
				t.removeAll();
			
				t.repaint();
				
				addPageCreate(t);
				
			}
			
			
			if(e.getSource()==buttons[1]) 
			{
				
				t.removeAll();
				
				t.repaint();
				
				removeUserPage(t);
				
			}
			
			
			if (e.getSource()==buttons[2])
			{
				t.removeAll();
				t.repaint();
				
				questionAdd(t);
				
				
				
				
			}
			
		}

		
	};
	
	buttons[0].addActionListener(event);
	buttons[1].addActionListener(event);
	buttons[2].addActionListener(event);
	
	
	

	
	
}
		
		
		
	

	
	
	
public void addPageCreate(JPanel t) 
	
	{
		
		JPanel panel = new JPanel();
		
		panel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), null));
		
		panel.setBounds(83, 30, 927, 512);
		
		t.add(panel);
		
		panel.setLayout(null);
		
		
		JPasswordField userPassword = new JPasswordField();
		
		userPassword.setBounds(300, 251, 300, 30);
		
		panel.add(userPassword);
		
		userPassword.setHorizontalAlignment(SwingConstants.CENTER);
		
		JTextField userName = new JTextField();
		
		userName.setHorizontalAlignment(SwingConstants.CENTER);
		
		userName.setFont(new Font("Yu Gothic UI",Font.BOLD,20));
		
		userName.setBounds(300, 194, 300, 30);
		
		panel.add(userName);
		
		
		JLabel user = new JLabel("Kullanıcı Adı : ");
		
		user.setBounds(165, 191, 140, 30);
		
		panel.add(user);
		
		user.setHorizontalAlignment(SwingConstants.CENTER);
		
		user.setForeground(Color.BLACK);
	
		user.setFont(new Font("Yu Gothic UI", Font.BOLD, 21));
		
		
		JLabel lblSifre = new JLabel("Şifre:");
		
		lblSifre.setBounds(172, 257, 140, 30);
		
		panel.add(lblSifre);
		
		lblSifre.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblSifre.setForeground(Color.BLACK);
		
		lblSifre.setFont(new Font("Yu Gothic UI", Font.BOLD, 21));
		
		
		JButton create = new JButton("KAYDET");

		Image image = new ImageIcon(this.getClass().getResource("/backspace.png")).getImage();
		
		
JButton goBack = new JButton();
		
		goBack.setIcon( new ImageIcon(image));
		
		goBack.setBounds(0,0,50,50);
		
		create.setBackground(Color.GREEN);
		
		create.setBounds(372, 342, 214, 41);
		
		panel.add(create);
		
		panel.add(goBack);
		
		create.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		
		lblNewLabel.setBounds(230, 130, 450, 28);
		
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		
		lblNewLabel_1.setBounds(165, 72, 595, 59);
		
		panel.add(lblNewLabel_1);
		
		
	
		ActionListener al = new ActionListener()
				{
				
					public void actionPerformed(ActionEvent e) {
						
						if(e.getSource()==create) {
							
							
					if(userName.getText().equals("")|| userPassword.getText().equals("")) {
						
						lblNewLabel.setForeground(new Color(255,0,0));
						lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel.setFont(new Font("Yu Gothic UI",Font.BOLD,15));
						lblNewLabel.setText("Kullanıcı adı ve Şifre Alanları Boş Bırakılamaz...");
						
						}
					
					else {
						
					String SQL = "Insert Into kim_500_bin_ister.users"
							+ "("
							+ "userName,"
							+ "userPassword"
							+ ") "
							+ "values("+" ' "+userName.getText()+" ' "+","+"'"+userPassword.getText()+"')";
					
					
					try {
						
						statement = connect.createStatement();
						int rs = statement.executeUpdate(SQL);
						
						lblNewLabel.setForeground(new Color(0,255,0));
						lblNewLabel.setFont(new Font("Yu Gothic UI",Font.BOLD,30));
						lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel.setText("Kayıt Başarılı...");
						
					} catch (SQLException e1) {
						lblNewLabel.setForeground(new Color(255,0,0));
						lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel.setFont(new Font("Yu Gothic UI",Font.BOLD,30));
						lblNewLabel.setText("Kayıt Oluşturulurken Hata...");
						System.out.println("sorgu çalıştırılırken hata");
						e1.printStackTrace();
					}
					
					
					
						
						
					}
					
					
					
				
		
					}
						
						if(e.getSource()==goBack) {
							t.removeAll();
							
							try {
								adminPage(t);
								t.repaint();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					
					}
					
					
					}
					
						
					
				};
				
		
		
				
				
				create.addActionListener(al);
				goBack.addActionListener(al);
		

				
				
	
		
	
	
	
	}







	public void removeUserPage(JPanel t) 
	{
		
		String UserNames[] = new String[dataCount("users")];
		
		
		
		Image img = new ImageIcon(this.getClass().getResource("/backspace.png")).getImage();
		
		String neww ;
		
		 JPanel panel = new JPanel();
		 
		 panel.setLayout(null);
		 
		 panel.setBounds(83, 30, 927, 512);
		 
		 panel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), null));

		JComboBox<String> users = new JComboBox<String>();
	
		
		users.setFont(new Font ("Yu Gothic UI",Font.BOLD,15));
		
		users.setBackground(Color.DARK_GRAY);
		
		users.setForeground(Color.WHITE);
		
		
		users.setBounds(320, 50, 300, 50);
		 
		panel.add(users);
		
		
		JLabel feedBack = new JLabel();
		
		feedBack.setBounds(320,300,300,50);
		
		feedBack.setHorizontalAlignment(SwingConstants.CENTER);
		
		feedBack.setFont(new Font("Yu Gothic UI",Font.BOLD,22));
		
		panel.add(feedBack);
		
		
		JButton deleteButton = new JButton("Sil");
		
		JButton backButton = new JButton();
		
		panel.add(backButton);
		
		
		deleteButton.setBounds(320,450,300,50);
		
		backButton.setBounds(0,0,50,50);
		
		backButton.setIcon(new ImageIcon(img));
		
		panel.add(deleteButton);
		
		String [] userss = new String [dataCount("users")];
		
		
	
		String SQL = "select * from users;"; 
		
		
		int i = 0 ;
		
		
		Statement st;
		
		ResultSet rs;
		
		Statement st2 ;
		
		
		
		try {
			st = connect.createStatement();
			
			rs = st.executeQuery(SQL);
		
			
			while(rs.next()) {
				
			userss[i]=rs.getString("userName");
			
			userID= rs.getInt("userID");
	
			users.addItem(userss[i].toString());
			
			i++;
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
				
	
	
			
		
		
	

			 
	
			
		
			 
			
			 	 
		
		
		
		 
		 
		 t.add(panel);
		 
		 
		 ActionListener al = new ActionListener() {
			
			 public void actionPerformed(ActionEvent e) {
				
			if(e.getSource()==deleteButton) {
				 
				int userid=stringIDCreator(users.getSelectedItem().toString());
				
				String SQL = "DELETE FROM kim_500_bin_ister.users where userID="+userID+";";
				 
			try {
				Statement Statement = (java.sql.Statement) connect.createStatement();
				
				int rs= Controller.statement.executeUpdate(SQL);
				
				feedBack.setForeground(Color.GREEN);
				
				feedBack.setText("Kullanıcı Başarıyla Silindi");
				
				users.removeItem(users.getSelectedItem());
				
				t.repaint();
			} catch (SQLException e1) {
				
				feedBack.setForeground(Color.RED);
				
				feedBack.setText("Kullanıcı Silinemedi");
			 System.out.println("silinemedi");
				e1.printStackTrace();
			}
				 
				 
				 
			 }
			
			if(e.getSource()==backButton) 
			
			{
		
				
				try {
					t.removeAll();
					adminPage(t);
					t.repaint();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
			
			}

			 
			 
			 }
			 
			 
			
			 
			 
		 };
		 
		 deleteButton.addActionListener(al);
		 backButton.addActionListener(al);
		
		
		
	}
	
	
	
	
	
	public  ArrayList<String> userFetcher() {
		
		ArrayList <String> users = new ArrayList <>(dataCount("users"));
		int i = 0;
		
		Statement st;
		
		ResultSet rs = null ;
		try {
			 st = connect.createStatement();
			rs= st.executeQuery("Select userName from users;");
			
			
		}catch(SQLException e)
		{
			
			e.printStackTrace();
		}
		
		
		try {
			while(rs.next())
			{
				
				users.add(rs.getString("userName"));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return users;
		
		
		
		
		
		
	}
	
	
	
	public void end(JPanel t,int dogru2,int point2) {
		
Image img = new ImageIcon(this.getClass().getResource("/milyoner.png")).getImage();
		

int dogru = dogru2;

int point = point2;




	t.setLayout(null);
		
		JPanel panel = new JPanel();
		
		panel.setBounds(0, 0, 1060, 630);
		
		panel.setOpaque(true);
		
		t.add(panel);
		
		panel.setLayout(null);
		
		JLabel feedBack = new JLabel("ELENDİNİZ... LÜTFEN TEKRAR DENEYİNİZ");
		
		feedBack.setBounds(290,560,475,50);
		
		feedBack.setBackground(Color.YELLOW);
		
		feedBack.setFont(new Font("Comic Sans MS",Font.BOLD, 20));
		
		feedBack.setOpaque(true);
		
		
		
		
		
JLabel feedBack2 = new JLabel();

		feedBack2.setText("Doğru Sayınız :" + dogru);
		
		feedBack2.setBounds(0,250,300,50);
		
		feedBack2.setHorizontalAlignment(SwingConstants.CENTER);
		
	
		
		feedBack2.setFont(new Font("Comic Sans MS",Font.BOLD, 28));
		
		feedBack2.setForeground(Color.BLACK);
		
		
		
		
		
		
		JLabel feedBack3 = new JLabel();

		feedBack3.setText("Puanınız:"+point);
		
		feedBack3.setBounds(0,300,300,50);
		
		feedBack3.setHorizontalAlignment(SwingConstants.CENTER);
		
	
		
		feedBack3.setFont(new Font("Comic Sans MS",Font.BOLD, 28));
		
		feedBack3.setForeground(Color.BLACK);
		
		
		
	
		
		
		panel.add(feedBack2);
		
		panel.add(feedBack3);
		
		
		
	JPanel startButtonPanel = new JPanel();
		
		startButtonPanel.setBounds(750, 300, 301, 65);
		
		startButtonPanel.setOpaque(true);
		
		startButtonPanel.setBackground(Color.black);
		
		startButtonPanel.setLayout(null);
		
		panel.add(startButtonPanel);
		
		
		
JButton tryButton = new JButton();
		
tryButton.setBounds(2,3, 298, 60);
		
tryButton.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLACK, null));
		
tryButton.setBackground(Color.YELLOW);
		
tryButton.setFont(new Font("Comic Sans MS",Font.BOLD, 30));
		
tryButton.setText("TEKRAR DENE");
		
tryButton.setForeground(Color.BLACK);
		
		startButtonPanel.add(tryButton);
		
	
		
		
		
JLabel backGround = new JLabel();
		
		backGround.setBackground(Color.BLACK);
		
		backGround.setOpaque(true);
		
		backGround.setBounds(0, 0, 1062, 630);
		
		backGround.setIcon(new ImageIcon(img));
		
		panel.add(backGround);
		
		
		
		
		ActionListener al = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				t.removeAll();
				
				try {
					start(t);
				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				
				t.repaint();
				
				
			}
		};
		
		tryButton.addActionListener(al);
		
		
		
	}

	
	



	
	
	
	
	
	public void start (JPanel t) throws SQLException
	{
		int dogru = 0;
		
		int yanlis= 0;
		
		int point = 0 ;
		
		i = 0;
		
		j=0;
		
		
		
		
		
		Image img = new ImageIcon(this.getClass().getResource("/questionScreen.png")).getImage();
		
		JPanel questionTextPanel = new JPanel();
		
		questionTextPanel.setBounds(170, 403, 735, 68);

		questionTextPanel.setBorder(new EmptyBorder(0,0,0,0));
		
		questionTextPanel.setLayout(null);
		
		questionTextPanel.setBackground(new Color(10,4,48));
		
		t.add(questionTextPanel);
		
		
		
		
		JPanel optionAPanel = new JPanel();
		
		optionAPanel.setBounds(160, 485, 350, 35);
		
		optionAPanel.setBorder(new EmptyBorder(0,0,0,0));
		
		optionAPanel.setLayout(null);
		
		optionAPanel.setBackground(new Color(10,4,48));
		
		t.add(optionAPanel);
		
		
		
		JPanel optionBPanel = new JPanel();
		
		optionBPanel.setBounds(160, 538, 350, 35);
		
		optionBPanel.setBorder(new EmptyBorder(0,0,0,0));
		
		optionBPanel.setLayout(null);
		
		optionBPanel.setBackground(new Color(10,4,48));
		
		t.add(optionBPanel);
		
		
		JPanel optionCPanel = new JPanel();
		
		optionCPanel.setBounds(570, 485, 350, 35);
		
		optionCPanel.setBorder(new EmptyBorder(0,0,0,0));
		
		optionCPanel.setLayout(null);
		
		optionCPanel.setBackground(new Color(10,4,48));
		
		t.add(optionCPanel);
		
		
		
		JPanel optionDPanel = new JPanel();
		
		optionDPanel.setBounds(570, 538, 350, 35);
		
		optionDPanel.setBorder(new EmptyBorder(0,0,0,0));
		
		optionDPanel.setLayout(null);
		
		optionDPanel.setBackground(new Color(10,4,48));
		
		t.add(optionDPanel);
		
		
		JButton optionAButton = new JButton();
		
		optionAButton.setText(" A - ");
		
		optionAButton.setBounds(0,0,430,45);
		
		optionAButton.setBorder(new EmptyBorder(0,0,0,0));
		
		optionAButton.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 15));
		
		optionAButton.setHorizontalAlignment(SwingConstants.LEFT);
		
		optionAButton.setForeground(Color.WHITE);
		
		optionAButton.setBackground(new Color(10,4,48));
		
		optionAPanel.add(optionAButton);
		
		
		
JButton optionCButton = new JButton();
		
		optionCButton.setText(" C - ");

		optionCButton.setBorder(new EmptyBorder(0,0,0,0));
		
		optionCButton.setBounds(0,0,430,45);
		
		optionCButton.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 15));
		
		optionCButton.setHorizontalAlignment(SwingConstants.LEFT);
		
		optionCButton.setForeground(Color.WHITE);
		
		optionCButton.setBackground(new Color(10,4,48));
		
		optionCPanel.add(optionCButton);
		
		
		
		
		
JButton optionBButton = new JButton();
		
		optionBButton.setText(" B - ");
		
		optionBButton.setBorder(new EmptyBorder(0,0,0,0));
		
		optionBButton.setBounds(0,0,430,45);
		
		optionBButton.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 15));
		
		optionBButton.setHorizontalAlignment(SwingConstants.LEFT);
		
		optionBButton.setForeground(Color.WHITE);
		
		optionBButton.setBackground(new Color(10,4,48));
		
		optionBPanel.add(optionBButton);
		
		
		
		
		
JButton optionDButton = new JButton();
		
		optionDButton.setText(" D - ");
		
		optionDButton.setBorder(new EmptyBorder(0,0,0,0));
		
		optionDButton.setBounds(0,0,430,45);
		
		optionDButton.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 15));
		
		optionDButton.setHorizontalAlignment(SwingConstants.LEFT);
		
		optionDButton.setForeground(Color.WHITE);
		
		optionDButton.setBackground(new Color(10,4,48));
		
		optionDPanel.add(optionDButton);	
		
		
		
		
		JLabel Question = new JLabel() ;
	
		
		Question.setBounds(0, 0, 733, 67);
		
		Question.setForeground(Color.WHITE);
		
		Question.setHorizontalAlignment(SwingConstants.CENTER);
		
		questionTextPanel.add(Question) ;
		
		Question.setFont(new Font("Yu Gothıc UI",Font.BOLD,15));
		
		
		for(int i = 0 ; i<dataCount("questions");i++ ) {
			
			sira.add(i);
		}
		
		
	i=0;
	j=0;
		
	Collections.shuffle(sira);
	
	
		Question.setText(questionFetch()[sira.get(i)].get(j).toString());
		
		
		optionAButton.setText(questionFetch()[sira.get(i)].get(j+1).toString());
		
		
		optionBButton.setText( questionFetch()[sira.get(i)].get(j+2).toString());
		
		
		optionCButton.setText(questionFetch()[sira.get(i)].get(j+3).toString());
		
	
		optionDButton.setText(questionFetch()[sira.get(i)].get(j+4).toString());
		
	
		
		System.out.println(optionDButton.getText().toString());
		
		
		
		ActionListener al= new ActionListener() {
			int i = 0 ;
			int j = 0;
			
	
			
			int point = 0;
			
			int dogru = 0;
			
			String cevap;
			
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==optionAButton) {
					
					
					j=0;
				
					i++;
					
					if(i>=(dataCount("questions"))) {
						
						t.removeAll();
						end(t,dogru,point);
						t.repaint();
						
						
					} else
						try {
							if(check(optionAButton.getText()).equals(optionAButton.getText())){
									
									point+=20;
									
									dogru++;
									
									

								
								try {
									
								
									
									

									Question.setText(questionFetch()[sira.get(i)].get(j).toString());
									
									
									optionAButton.setText(questionFetch()[sira.get(i)].get(j+1).toString());
									
									
									optionBButton.setText( questionFetch()[sira.get(i)].get(j+2).toString());
									
									
									optionCButton.setText(questionFetch()[sira.get(i)].get(j+3).toString());
									
								
									optionDButton.setText(questionFetch()[sira.get(i)].get(j+4).toString());
								
									
									

									
									
									
									
									
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								
								}
								
								else {
									
									t.removeAll();
									
									t.repaint();
									end(t,dogru,point);
								
									
									System.out.println("doğru sayınız : "+dogru+" \npuan:"+point);
								}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
					
					
						
				
					
					
					
					
				}
				
				else if(e.getSource()==optionBButton) {
					
		
					
					if(i>=(dataCount("questions"))) {
						
							t.removeAll();
							
							end(t,dogru,point);
							
							t.repaint();
						
						
					}
					
				
					 
					 try {
						if(check(optionBButton.getText()).equals(optionBButton.getText())) {
							 
							 point+=20;
							 
							 dogru++;
							 
							 try {
								 
								 
									j=0;
									
									i++;

									Question.setText(questionFetch()[sira.get(i)].get(j).toString());
									
									
									optionAButton.setText(questionFetch()[sira.get(i)].get(j+1).toString());
									
									
									optionBButton.setText(questionFetch()[sira.get(i)].get(j+2).toString());
									
									
									optionCButton.setText(questionFetch()[sira.get(i)].get(j+3).toString());
									
								
									optionDButton.setText(questionFetch()[sira.get(i)].get(j+4).toString());
									
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							 
							 
							 
							 
							 
							 
						 }
						 
						 
						 
						 else {
							 
							
								
								t.removeAll();
								end(t,dogru,point);
								t.repaint();
								
								System.out.println("doğru sayınız : "+dogru+"puan:"+point);
							}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
						
					
					
				}

				else if(e.getSource()==optionCButton) {
					
					if(i>=(dataCount("questions"))) {
						
						t.removeAll();
						end(t,dogru,point);
						t.repaint();
						
						
					}
					 
					 try {
						if(check(optionCButton.getText().toString()).equals(optionCButton.getText())) {
 
								point+=20;
								
								dogru++;
							 
								try {
									j=0;
									
									i++;
									

									Question.setText(questionFetch()[sira.get(i)].get(j).toString());
									
									
									optionAButton.setText(questionFetch()[sira.get(i)].get(j+1).toString());
									
									
									optionBButton.setText(questionFetch()[sira.get(i)].get(j+2).toString());
									
									
									optionCButton.setText(questionFetch()[sira.get(i)].get(j+3).toString());
									
								
									optionDButton.setText(questionFetch()[sira.get(i)].get(j+4).toString());
									
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							 
							 
							 
						 }
							
							else {
								
							
								
								t.removeAll();
								end(t,dogru,point);
								t.repaint();
								
								System.out.println("doğru sayınız : "+dogru+"puan:"+point);
							}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
						
	
					
				}


				if(e.getSource()==optionDButton) {	
					
					
					if(i>=(dataCount("questions"))) {
						
						t.removeAll();
						end(t,dogru,point);
						t.repaint();
						
						
					}
					
					 
					 try {
						if(check(optionDButton.getText().toString()).equals(optionDButton.getText())) {
 
							 
							 
							 point+=20;
							 dogru++;
							 
							 try {
									j=0;
									i++;
									

									Question.setText(questionFetch()[sira.get(i)].get(j).toString());
									
									
									optionAButton.setText(questionFetch()[sira.get(i)].get(j+1).toString());
									
									
									optionBButton.setText( questionFetch()[sira.get(i)].get(j+2).toString());
									
									
									optionCButton.setText(questionFetch()[sira.get(i)].get(j+3).toString());
									
								
									optionDButton.setText(questionFetch()[sira.get(i)].get(j+4).toString());
									
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							 
							 
							 
						 }
 
 else {
 


t.removeAll();

end(t,dogru,point);
t.repaint();

System.out.println("doğru sayınız : "+dogru+"puan:"+point);
}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
						
					
			
				}
				
			}
		};
		
		optionAButton.addActionListener(al);
		
		optionBButton.addActionListener(al);
		
		optionCButton.addActionListener(al);
		
		optionDButton.addActionListener(al);
		
	
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		JLabel backGround = new JLabel();
		backGround.setBounds(0,0,1062,620);
		backGround.setOpaque(true);
		backGround.setIcon(new ImageIcon(img));
		t.add(backGround);
	
		

		
		
		
	}
	
		



		
	




	}