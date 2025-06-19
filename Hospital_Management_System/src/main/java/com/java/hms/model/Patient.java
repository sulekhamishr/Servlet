package com.java.hms.model;

import java.sql.Date;

public class Patient {
	
	    private int patientId;
	    private String name;
	    private Date dateOfBirth;
	    private String gender;
	    private String address;
	    private long phoneNumber;
		private String email;
	    private String bloodGroup;
	    private String disease;
	    private Date admissionDate;
		public int getPatientId() {
			return patientId;
		}
		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getBloodGroup() {
			return bloodGroup;
		}
		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}
		public String getDisease() {
			return disease;
		}
		public void setDisease(String disease) {
			this.disease = disease;
		}
		public Date getAdmissionDate() {
			return admissionDate;
		}
		public void setAdmissionDate(Date admissionDate) {
			this.admissionDate = admissionDate;
		}
		public Patient(int patientId, String name, Date dateOfBirth, String gender, String address, long phoneNumber,
				String email, String bloodGroup, String disease, Date admissionDate) {
			super();
			this.patientId = patientId;
			this.name = name;
			this.dateOfBirth = dateOfBirth;
			this.gender = gender;
			this.address = address;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.bloodGroup = bloodGroup;
			this.disease = disease;
			this.admissionDate = admissionDate;
		}
		public Patient() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Patient [patientId=" + patientId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", gender="
					+ gender + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email
					+ ", bloodGroup=" + bloodGroup + ", disease=" + disease + ", admissionDate=" + admissionDate
					+ ", getPatientId()=" + getPatientId() + ", getName()=" + getName() + ", getDateOfBirth()="
					+ getDateOfBirth() + ", getGender()=" + getGender() + ", getAddress()=" + getAddress()
					+ ", getPhoneNumber()=" + getPhoneNumber() + ", getEmail()=" + getEmail() + ", getBloodGroup()="
					+ getBloodGroup() + ", getDisease()=" + getDisease() + ", getAdmissionDate()=" + getAdmissionDate()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
	    
	    
	    
	    
	    
}