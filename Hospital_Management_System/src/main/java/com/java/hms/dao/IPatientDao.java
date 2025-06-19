package com.java.hms.dao;

import java.util.List;

import com.java.hms.model.Patient;

public interface IPatientDao {
	
	
      void addPatient(Patient patient) ;
      Patient getPatient(int patientId) ;
      public List<Patient> getAllPatients() ;

}
