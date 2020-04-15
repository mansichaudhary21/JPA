package com.model;

public class Ticket_Details {

	/*ticketid number primary key,
	class varchar2(20),
	source varchar2(20), 
	destination varchar2(20),
	noOfPsg number,
	totalAmt number(8,2),
	tNo number not null,
	CONSTRAINT fk_train*/
	private int ticketid;
	private String className;
	private String source;
	private String destination;
	private int noOfPsg;
	private int totalAmt;
	private int tNo;
	private int fk_train;
	public Ticket_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket_Details(int ticketid, String className, String source, String destination, int noOfPsg, int totalAmt,
			int tNo, int fk_train) {
		super();
		this.ticketid = ticketid;
		this.className = className;
		this.source = source;
		this.destination = destination;
		this.noOfPsg = noOfPsg;
		this.totalAmt = totalAmt;
		this.tNo = tNo;
		this.fk_train = fk_train;
	}
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNoOfPsg() {
		return noOfPsg;
	}
	public void setNoOfPsg(int noOfPsg) {
		this.noOfPsg = noOfPsg;
	}
	public int getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(int totalAmt) {
		this.totalAmt = totalAmt;
	}
	public int gettNo() {
		return tNo;
	}
	public void settNo(int tNo) {
		this.tNo = tNo;
	}
	public int getFk_train() {
		return fk_train;
	}
	public void setFk_train(int fk_train) {
		this.fk_train = fk_train;
	}
	
	@Override
	public String toString() {
		return "Ticket_Details [ticketid=" + ticketid + ", className=" + className + ", source=" + source
				+ ", destination=" + destination + ", noOfPsg=" + noOfPsg + ", totalAmt=" + totalAmt + ", tNo=" + tNo
				+ ", fk_train=" + fk_train + "]";
	}
	
}
