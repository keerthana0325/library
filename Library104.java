//book details
import java.sql.*;
class Library104 {
public static void main(String[] args) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection =
DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_Management_System1", "root", "");
Statement st = connection.createStatement();
String query = "SELECT * FROM Books_Details";
ResultSet rs = st.executeQuery(query);
while (rs.next()) {
String bookNumber = rs.getString("BookNumber");
String bookName = rs.getString("BookName");
String author = rs.getString("Author");
String bookCount = rs.getString("Book_Count");
System.out.println("Book Number: " + bookNumber);
System.out.println("Book Name: " + bookName);
System.out.println("Author: " + author);
System.out.println("Book Count: " + bookCount);
}
} catch (Exception e) {
e.printStackTrace();
}}}
