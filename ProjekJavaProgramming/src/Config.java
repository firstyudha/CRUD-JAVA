import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Config {
    public static Connection mysqlconfig;
    public static Statement stm;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/mahasiswa_java"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            stm = mysqlconfig.createStatement();            
        } catch (SQLException e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    } 
}
