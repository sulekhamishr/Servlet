package com.java.hib;

public class Agent {
	int AgentID;
	String Name;
	String City;
	String Gender;
	int   MaritalStatus;
	long  Premium;
	public int getAgentID() {
		return AgentID;
	}
	public void setAgentID(int agentID) {
		AgentID = agentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public long getPremium() {
		return Premium;
	}
	public void setPremium(long premium) {
		Premium = premium;
	}
	
	public Agent(int agentID, String name, String city, String gender, int maritalStatus, long premium) {
		super();
		AgentID = agentID;
		Name = name;
		City = city;
		Gender = gender;
		MaritalStatus = maritalStatus;
		Premium = premium;
	}
	
	
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Agent [AgentID=" + AgentID + ", Name=" + Name + ", City=" + City + ", Gender=" + Gender
				+ ", MaritalStatus=" + MaritalStatus + ", Premium=" + Premium + "]";
	}
	
	
	
	

}
