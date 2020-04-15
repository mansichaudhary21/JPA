package com.dao;

public interface TicketDAOInterface {

	public void login(String unm,String psw) throws Exception;
	public void showTrains() throws Exception;
	public void bookTicket(int trainNo) throws Exception;
	public void cancelTicket(int ticketNo) throws Exception;
}
