import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.cj.protocol.Resultset;

public class databaseConnect {
	public static Connection connect = null;
	
	protected static java.sql.Statement statement = null ; 
	
	protected static java.sql.ResultSet Result = null ;
	
	public String host = "localhost" ;
	
	public int port = 3307 ; 
	
	public String dbName = "kim_500_bin_ister" ;
	
	public String dbuserName = "root";
	
	public String dbpassword = "Emir123." ;
	
	
	public String url="jdbc:mysql://"+host+":"+port+"/"+dbName;
	
	
	
	public databaseConnect () 
	{
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Driver Çağrısı Başarılı");
		}catch(ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			
			connect = DriverManager.getConnection(url,dbuserName,dbpassword);
			
			
			
			System.out.println("DataBase Connection Succesfull");
			
			
			
		}catch (SQLException ex) {
			
			
			System.out.println("Database Connection Error");
			ex.printStackTrace();
		}
		
		
	}
	
	//Authentication işlemi admin ile kullanıcıyı ayırt edebilir şekilde ayrıştırılacak
	
	
		
		
		
	
	
	

	
}
