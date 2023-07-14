package com.bean;

public class Catagory {

	int cid;
	String cname;
	
	
	public Catagory(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}


	public int getCid() {
		return cid;
	}




	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}
	
	
	
}
