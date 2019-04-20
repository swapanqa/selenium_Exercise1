package example_selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDTestClass {
	
	
    public static void selectQuery() throws SQLException, ClassNotFoundException { 
String dbURL = "jdbc:db2://ipAddress:portNumber/dbName";
String username = "myUserName";
       String password = "myPassword";
       //Load DB2 JDBC Driver
       Class.forName("com.ibm.db2.jcc.DB2Driver");
       //Creating connection to the database
       Connection con = DriverManager.getConnection(dbURL,username,password);
       //Creating statement object
    Statement st = con.createStatement();
    String selectquery = "SELECT * FROM <tablename> WHERE <condition>";
       //Executing the SQL Query and store the results in ResultSet
    ResultSet rs = st.executeQuery(selectquery);
    //While loop to iterate through all data and print results
    while (rs.next()) {
    System.out.println(rs.getString("transaction_datetime"));
    }
       //Closing DB Connection
    con.close();
}

}
