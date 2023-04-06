import java.sql.*;
public class Sample
{
  static final String db_url="";
      static final String userid="";
      static final String password="";
      static final String query=""; 
  public static void main(
    String args[])
    {
     try(Connection conn=DriverManager.getConnection(db_url))
     {
      Statement stmt=conn.createStatement();
      ResultSet rs=stmt.executeQuery(query);
     } 
     catch(SQLException e)
     {
      e.printStackTrace();
     }
    }
}