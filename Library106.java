//Returned Books
import java.sql.*;
class Library106 {
public static void main(String[] args) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection =
DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_Management_System1", "root", "");
Statement st = connection.createStatement();
String query = "select *from Returned_Books";
ResultSet rs = st.executeQuery(query);
while (rs.next()) {
String membid = rs.getString("Memb_Id");
String membname = rs.getString("Memb_Name");
String issuedate = rs.getString("Issue_Date");
String tobereturnedon = rs.getString("ReturnedOn");
String bookNumber = rs.getString("BookNumber");
String bookName = rs.getString("BookName");
String author = rs.getString("Author");
String bookCountafterreturn = rs.getString("Book_Count_after_Return");
System.out.println("Member_Id: " +membid );
System.out.println("Member_Name: " +membname );
System.out.println("Issued_On: " + issuedate);
System.out.println("Returned_On: " + tobereturnedon);
System.out.println("Book Number: " + bookNumber);
System.out.println("Book Name: " + bookName);
System.out.println("Author: " + author);
System.out.println("Book Count: " + bookCountafterreturn);
System.out.println("\n");
}} catch (Exception e)
{
e.printStackTrace();
}
}
}