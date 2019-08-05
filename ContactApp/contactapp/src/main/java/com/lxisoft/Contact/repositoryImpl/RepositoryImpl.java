package com.lxisoft.Contact.repositoryImpl;
import com.lxisoft.Contact.repository.Repository;
import com.lxisoft.Contact.model.ContactModel;
import java.util.*;
import java.sql.*;
public class RepositoryImpl {
Statement st,st1;
ResultSet rs,rs1;	
Connection con;
ArrayList<ContactModel> contacts=new ArrayList<ContactModel>();
	public RepositoryImpl(){
		try{  
			
        Class.forName("com.mysql.jdbc.Driver");  
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ContactApp","root","hrithika30");  
		//here sonoo is database name, root is username and password 
		}
		catch(Exception e){System.out.println(e);}
	}
	public void createContact(ContactModel c){
		try{
			st=con.createStatement();
			st.executeUpdate("insert into contactlist(Name,Email_id)values('"+c.getName()+"','"+c.getMailId()+"')");
			rs=st.executeQuery("select max(SI_NO)from contactlist");
			rs.next();
			st.executeUpdate("insert into contactnumber(PhoneNumber,SI_NO)values('"+c.getPhoneNumber()+"',"+rs.getInt(1)+")");
		    
		}
		catch(Exception e){System.out.println(e);}
	}
	
	public ArrayList<ContactModel> readContact(){
		try{  
			st=con.createStatement();
			st1=con.createStatement();
			ContactModel cont=new ContactModel();
			rs=st.executeQuery("select * from contactlist");  
			while(rs.next()) { 
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3));  
				rs1=st1.executeQuery("select * from contactnumber where SI_NO = "+rs.getInt(1));
				ArrayList<String> list=new ArrayList();
				while(rs1.next()){
					
					System.out.println(rs1.getString(3));
					list.add(rs1.getString(3));
				}
				cont.setName(rs.getString(2));
				cont.setMailId(rs.getString(3));
				cont.setPhoneNumber(list);
				contacts.add(cont);
			 }
		}catch(Exception e){ System.out.println(e);}  
		return contacts;
	}	

	public void deleteContact(String data){
		try{
			st=con.createStatement();
			rs=st.executeQuery("select SI_NO from contactlist where Name='"+data+"'");
			if(rs.next()){
			st1.executeUpdate("delete from contactlist where Name='"+data+"'");
				st.executeUpdate("delete from contactnumber where SI_NO='"+rs.getInt(1)+"'");
			}
			else
			{}
		
		}
		catch(Exception e){}
	}
	
	public void updateContact(String t,String d,String data,String data1){
		try{
			System.out.println(data+" "+data1);
			st=con.createStatement();
			rs=st.executeQuery("select SI_NO from "+t+" where "+d+"='"+data+"'");
			if(rs.next()){
				String query = "update "+t+" set "+d+" = '"+data1+"' where "+d+" = '"+data+"'";
             	PreparedStatement preparedStmt = con.prepareStatement(query);
      			preparedStmt.executeUpdate();
			}
			else
			{}
		
		}
		catch(Exception e){}
	}

	public void searchContact(String n,String no){
		try{
			st=con.createStatement();
			st1=con.createStatement();
			rs=st.executeQuery("select * from contactlist where Name='"+n+"'");
			if(rs.next()){
                st1.executeUpdate("insert into contactnumber(SI_NO,PhoneNumber)values("+rs.getInt(1)+",'"+no+"')");
            }
            else{}
		}
	catch(Exception e){}
	}

	public void closer()
	{
		try{
		con.close();
	}
	catch(Exception e){}
	}
}