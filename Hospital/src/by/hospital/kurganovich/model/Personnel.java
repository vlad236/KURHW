package by.hospital.kurganovich.model;

import by.hospital.kurganovich.model.interfaces.Entity;

public class Personnel implements Entity{
	private int idPersonnel;
	private String FIO;
	private String post;
	private String login;
	private String pass;
	
	public Personnel(){}
	
	public Personnel(int idPersonnel, String FIO, String post, String login, String pass) {
		this.idPersonnel = idPersonnel;
		this.FIO = FIO;
		this.post = post;
		this.login = login;
		this.pass = pass;
	}
	
	public int getIdPersonnel() {
		return idPersonnel;
	}
	public void setIdPersonnel(int idPersonnel) {
		this.idPersonnel = idPersonnel;
	}
	public String getFIO() {
		return FIO;
	}
	public void setFIO(String fIO) {
		FIO = fIO;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
