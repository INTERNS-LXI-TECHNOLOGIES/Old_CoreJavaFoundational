package com.lxisoft.movieScript.movieScript;

import java.sql.*;
import java.util.*;

public class MovieScriptView{
	public void view(){
		//creating the conection.
		String url = "jdbc:mysql://localhost:3306/dialoges";
		String user = "root";
		String pass = "root";
		int i=0;
		try{
			//Entering the data.
		 Random r = new Random();
		 while(i<3){
			 i++;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the first participants of the conversation");
		 String part1 = System.console().readLine();
		 System.out.println("ENter the second participants of the conversation");
		 String part2 = System.console().readLine();
		 int n = r.nextInt(3);
		
		 String sql = "Select "+part1+".dialogue"+part1+","+part2+".dialogue"+part2+" from "+part1+" left join "+part2+" on "+part1+".id="+part2+".id";
		 Connection con=null;
            Class.forName("com.mysql.jdbc.Driver");
 
            //Reference to connection interface
            con = DriverManager.getConnection(url,user,pass);
 
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
			System.out.println("-------Script Starts Here-----------");
			System.out.println("####################################");
			System.out.println("\n Scene - "+i+" Conversation between "+part1+" AND "+part2);
			while(rs.next()){
			String dia1 = rs.getString("dialogue"+part1);
			String dia2 = rs.getString("dialogue"+part2);
			System.out.println("\n" +part1+":"+dia1);
			System.out.println("\n"+part2+":"+dia2);
			System.out.println("####################################");
			}
			con.close();
		 }
		  
		}
		 
        catch(Exception ex)
        {
            System.err.println(ex);
        }
	}
}