package lecture;




import java.sql.Connection;
import java.sql.DriverManager;

public class LecturerDB {

    static Connection con;
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/tecmis";
    static String uname = "root";
    static String pass = "";
   
    
    public static Connection getConnection() throws Exception{
        if(con == null){
            Class.forName(driver);
            con = DriverManager.getConnection(url,uname, pass);
        }
        return con;
    }

}