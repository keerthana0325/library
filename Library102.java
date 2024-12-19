//creation of tables
import java.sql.*;
class Library102{
public static void main(String[] args){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_Management_System1","root",
"");
System.out.println("Connection is SuccessFull");
Statement st=con.createStatement();
String query1="create table Books_Details(S_No varchar(50),BookNumber varchar(50),BookName varchar(100),Author varchar(100),Book_Count varchar(100))";
String query2="create table Issued_Books(S_No varchar(50),Memb_Id varchar(100),Memb_Name varchar(100),Issue_Date varchar(100),TobeReturnedOn varchar(100),BookNumber varchar(50),BookName varchar(100),Author varchar(100),Book_Count_after_Issue varchar(100))";
String query3="create table Returned_Books(S_No varchar(50),Memb_Id varchar(100),Memb_Name varchar(100),Issue_Date varchar(100),Returnedon varchar(100),BookNumber varchar(50),BookName varchar(100),Author varchar(100),Book_Count_after_Return varchar(100))";
String query4="create table Members_Details(S_No varchar(50),Memb_Id varchar(100),Memb_Name varchar(100),Email_Id varchar(100))";
st.executeUpdate(query1);
st.executeUpdate(query2);
st.executeUpdate(query3);
st.executeUpdate(query4);
System.out.println("the tables are created Successfully");
}catch(Exception e){
e.printStackTrace();
}}}