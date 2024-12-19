//insertion of values
import java.sql.*;
class Library103
{
public static void main(String[] args){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_Management_System1","root",
"");
System.out.println("Connection is SuccessFull");
Statement st=con.createStatement();
String query1="insert into Books_Details values('1','S123IO' , 'Clean Code', 'Robert C.Martin','50')";
String query2="insert into Books_Details values('2','S456IO' , ' The Pragmatic Programmer', 'David Thomas','45')";
String query3="insert into Books_Details values('3','S789IO' , 'Design Patterns', 'Erich Gamma','20')";
String query4="insert into Books_Details values('4','S101IO', 'Code Complete' , 'Steve McConnell','34')";
String query5="insert into Books_Details values('5','S112IO' , 'Refactoring', 'Martin Fowler','23')";
String query6="insert into Books_Details values('6','S131IO' , 'The Mythical Man-Month', 'Frederick P.Brooks Jr.','30')";
String query7="insert into Books_Details values('7','S415IO' , 'Introduction to Algorithms','Cormen','27')";
String query8="insert into Books_Details values('8','S161IO' , 'JavaScript: The Good Parts', 'Douglas Crockford','25')";
String query9="insert into Books_Details values('9','S718IO' , 'Head First Design Patterns', 'Freeman','24')";
String query10="insert into Books_Details values('10','S920IO' , 'Cracking the Coding Interview', 'Gayle Laakmann McDowell','33')";
st.executeUpdate(query1);
st.executeUpdate(query2);
st.executeUpdate(query3);
st.executeUpdate(query4);
st.executeUpdate(query5);
st.executeUpdate(query6);
st.executeUpdate(query7);
st.executeUpdate(query8);
st.executeUpdate(query9);
st.executeUpdate(query10);
String query11="insert into Issued_Books values('1','1509','Felix','26Dec2023','6Jan2024','S415IO' , 'Introduction to Algorithms','Cormen','26')";
String query12="insert into Issued_Books values('2','1102','Dino','26Dec2023','6Jan2024','S161IO' , 'JavaScript: The Good Parts', 'Douglas Crockford','24')";
String query13="insert into Issued_Books values('3','2612','Dan','26Dec2023','6Jan2024','S718IO' , 'Head First Design Patterns', 'Freeman','23')";
String query14="insert into Issued_Books values('4','2510','Lino','26Dec2023','6Jan2024','S718IO' , 'Clean Code', 'Robert C.Martin','49' )";
st.executeUpdate(query11);
st.executeUpdate(query12);
st.executeUpdate(query13);
st.executeUpdate(query14);
String query15="insert into Returned_Books values('1','0310','Chan','18Dec2023','26Dec2024','S415IO' ,'Code Complete' , 'Steve McConnell','35' )";
String query16="insert into Returned_Books values('2','1108','Cheol','20Dec2023','26Dec2024','S920IO' ,'Cracking the Coding Interview', 'Gayle Laakmann McDowell','34' )";
String query17="insert into Returned_Books values('3','0808','ChangBin','24Dec2023','26Dec2024','S415IO' , 'Introduction to Algorithms','Cormen','27' )";
String query18="insert into Returned_Books values('4','0410','Jeonghan','16Dec2023','26Dec2024','S131IO' , 'The Mythical Man-Month', 'Frederick P. Brooks Jr.','31' )";
st.executeUpdate(query15);
st.executeUpdate(query16);
st.executeUpdate(query17);
st.executeUpdate(query18);
String query19="insert into Members_Details values('1','1509','Felix','skz1@gmail.com')";
String query20="insert into Members_Details values('2','1102','Dino','seventeen1@gmail.com')";
String query21="insert into Members_Details values('3','2612','Dan','kimdan12@gmail.com')";
String query22="insert into Members_Details values('4','2510','Lino','Dori@gmail.com')";
String query23="insert into Members_Details values('5','0310','Chan','nahc@gmail.com')";
String query24="insert into Members_Details values('6','1108','Cheol','alpha@gmail.com')";
String query25="insert into Members_Details values('7','0808','ChangBin','gmn@gmail.com')";
String query26="insert into Members_Details values('8','0410','Jeonghan','hannie@gmail.com')";
st.executeUpdate(query19);
st.executeUpdate(query20);
st.executeUpdate(query21);
st.executeUpdate(query22);
st.executeUpdate(query23);
st.executeUpdate(query24);
st.executeUpdate(query25);
st.executeUpdate(query26);
System.out.println("the values are inserted Successfully");
}catch(Exception e){
e.printStackTrace();
}}}