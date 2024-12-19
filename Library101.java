//creation of database
import java.sql.*;
class Library101{
public static void main(String[] args){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
System.out.println("Connection is SuccessFull");
Statement st=con.createStatement();
String query="create database Library_Management_System1";
st.executeUpdate(query);
System.out.println("the database is created Successfully");
}catch(Exception e){
e.printStackTrace();
}}}