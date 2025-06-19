package com.java.hms.model;

public class Doctor {
	
	    private int doctorId;
	    private String name;
	    private String specialty;
	    private long phoneNumber;
	    private String email;
		public int getDoctorId() {
			return doctorId;
		}
		public void setDoctorId(int doctorId) {
			this.doctorId = doctorId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSpecialty() {
			return specialty;
		}
		public void setSpecialty(String specialty) {
			this.specialty = specialty;
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
		public Doctor(int doctorId, String name, String specialty, long phoneNumber, String email) {
			super();
			this.doctorId = doctorId;
			this.name = name;
			this.specialty = specialty;
			this.phoneNumber = phoneNumber;
			this.email = email;
		}
		public Doctor() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Doctor [doctorId=" + doctorId + ", name=" + name + ", specialty=" + specialty + ", phoneNumber="
					+ phoneNumber + ", email=" + email + ", getDoctorId()=" + getDoctorId() + ", getName()=" + getName()
					+ ", getSpecialty()=" + getSpecialty() + ", getPhoneNumber()=" + getPhoneNumber() + ", getEmail()="
					+ getEmail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
	    
}
		