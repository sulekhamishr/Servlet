package com.java.hms.model;

import java.sql.Date;

public class Appointment {

	
	    private int appointmentId;
	    private int patientId;
	    private int doctorId;
	    private Date appointmentDate;
	    private String reasonForVisit;
		public int getAppointmentId() {
			return appointmentId;
		}
		public void setAppointmentId(int appointmentId) {
			this.appointmentId = appointmentId;
		}
		public int getPatientId() {
			return patientId;
		}
		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}
		public int getDoctorId() {
			return doctorId;
		}
		public void setDoctorId(int doctorId) {
			this.doctorId = doctorId;
		}
		public Date getAppointmentDate() {
			return appointmentDate;
		}
		public void setAppointmentDate(Date appointmentDate) {
			this.appointmentDate = appointmentDate;
		}
		public String getReasonForVisit() {
			return reasonForVisit;
		}
		public void setReasonForVisit(String reasonForVisit) {
			this.reasonForVisit = reasonForVisit;
		}
		public Appointment() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Appointment(int appointmentId, int patientId, int doctorId, Date appointmentDate,
				String reasonForVisit) {
			super();
			this.appointmentId = appointmentId;
			this.patientId = patientId;
			this.doctorId = doctorId;
			this.appointmentDate = appointmentDate;
			this.reasonForVisit = reasonForVisit;
		}
		@Override
		public String toString() {
			return "IAppointment [appointmentId=" + appointmentId + ", patientId=" + patientId + ", doctorId="
					+ doctorId + ", appointmentDate=" + appointmentDate + ", reasonForVisit=" + reasonForVisit
					+ ", getAppointmentId()=" + getAppointmentId() + ", getPatientId()=" + getPatientId()
					+ ", getDoctorId()=" + getDoctorId() + ", getAppointmentDate()=" + getAppointmentDate()
					+ ", getReasonForVisit()=" + getReasonForVisit() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
	    

}

