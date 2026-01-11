import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//this file is only for database connectivity and how to query to the database
//----------------------------------------------------------------------------------------

//how to connect to the data base 
//--------------------------------------
/*
     String url = "jdbc:mysql://localhost:3306/AnimeData";      --> the last 1 is the name of your database
     String dbUser = "root";                                                           --> your MsSQL database username 
     String dbPassword = "1234";                                                 --> your MySQL password

     Connection conn = DriverManager.getConnection(url, dbUser, dbPassword);  --> the actual connection
*/


//how to query to the database 
//----------------------------------
/*
    -->use PreparedStatement objects for querying to prevent sql injections for secure apps

    -inserting data
    PreparedStatement st = conn.prepareStatement("insert into Table_name(column1, column2, column3, column4)values(?,?,?,?)");

    -checking through data if something exist 
    PreparedStatement checkStmt = conn.prepareStatement("SELECT COUNT(*) FROM anime WHERE names = ?");

    -basic search
    PreparedStatement st = conn.prepareStatement("select * from Anime where names LIKE ? OR Genre LIKE ? ");


*/