import java.sql.*;
import java.util.Scanner;

public class MyJDBC {


    private static final String url = "jdbc:mysql://127.0.0.1:3306/bot";

    private static final String user = "root";

    private static final String password = "Access9567$";



    public static Connection getConnection() throws SQLException {
       return DriverManager.getConnection(url , user , password);

    }




}

