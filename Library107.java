//members_details

import java.sql.*;
class Library107 {
public static void main(String[] args) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection =
DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_Management_System1", "root", "");
Statement st = connection.createStatement();
String query = "select *from Members_Details";
ResultSet rs = st.executeQuery(query);
while (rs.next()) {
String membid = rs.getString("Memb_Id");
String membname = rs.getString("Memb_Name");
String email = rs.getString("Email_Id");
System.out.println("Member_Id: " +membid );
System.out.println("Member_Name: " +membname );
System.out.println("Email_Id: " + email);
System.out.println("\n");
}} catch (Exception e) {
e.printStackTrace();
}}}