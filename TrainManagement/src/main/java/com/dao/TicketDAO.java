package com.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Admin_Login;
import com.model.Train_Details;
import com.utility.ConnectionProvider;

public class TicketDAO implements TicketDAOInterface{
	
	Connection con;
	PreparedStatement ps;

	public TicketDAO() throws ClassNotFoundException, SQLException {
		
		con = ConnectionProvider.getConnection();
		
	}

	public void login(String unm,String psw) throws ClassNotFoundException
	{
		try {
			ps = con.prepareStatement("Select unm,pwd from Admin_Login where unm=?");
			ps.setString(1, unm);
	        ResultSet rs = ps.executeQuery();
	        String orgName = "";
	        String orgPass= "";
	        
	        while(rs.next())
	        {
	        	orgName = rs.getString("unm");
	        	orgPass = rs.getString("pwd");
	        	
	        			        	
	        }
	        if(unm.equals(orgName) && psw.equals(orgPass))
    		{
    			System.out.println("Login Successfully...");
    			TicketDAO tk= new TicketDAO();
    			tk.showTrains();
    			System.out.println("No more trains information are available");
    		}
	        else 
	        {
	        	System.out.println("Invalid Login Credentials");
	        }
	       

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void showTrains() throws SQLException
	{
		List<Train_Details> list = new ArrayList<Train_Details>();
		String query = "Select * from Train_Details";
		ps = con.prepareStatement(query);
		
		ResultSet rs =ps.executeQuery();
		
		while(rs.next())
		{
			/*String unm = rs.getString(1);
			String psw = rs.getString(2);
			Admin_Login adminlogin = new Admin_Login();
			adminlogin.setUnm(unm);
			adminlogin.setPsw(psw);
			list.add(adminlogin);*/
			int tNo = rs.getInt(1);
			String name = rs.getString(2);
			String source = rs.getString(3);
			String destination = rs.getString(4);
			int fare = rs.getInt(5);
			Train_Details traindetails = new Train_Details();
			traindetails.settNo(tNo);
			traindetails.setName(name);
			traindetails.setSource(source);
			traindetails.setDestination(destination);
			traindetails.setFare(fare);
			list.add(traindetails);
		}
		
		for (Train_Details t : list) {
			System.out.print("TNo: "+ t.gettNo() + ",");
			System.out.print("Name: " + t.getName() + ",");
			System.out.print("Source: "+ t.getSource() + ",");
			System.out.print("Destination: "+ t.getDestination()+ ",");
			System.out.print("Fare: " + t.getFare() + "\n");
		}
		//con.close();
		
	}
	
	public void bookTicket(int trainno)
	{
		
	}
	
	public void cancelTicket(int ticketno)
	{
		
	}

}
