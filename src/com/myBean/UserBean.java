package com.myBean;

public class UserBean {
	
	private int ID;
	private String content;
	private String name;
	
	private String telephone;

	public UserBean() {
		super();
	}

	public UserBean(int iD, String content, String name, String telephone) {
		super();
		ID = iD;
		this.content = content;
		this.name = name;
		this.telephone = telephone;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
	

}
