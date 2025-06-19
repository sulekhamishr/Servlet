package com.java.hms.dao;

import java.util.List;

import com.java.hms.model.Appointment;

public interface IAppointmentDao {

    void addAppointment(Appointment appointment);
    Appointment getAppointment(int appointmentId);
    List<Appointment> getAllAppointments();
    List<Appointment> getAppointmentsByPatient(int patientId);
    void updateAppointment(Appointment appointment);
    void deleteAppointment(int appointmentId);
	
}
