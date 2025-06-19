package com.java.hms.dao;

import java.util.List;

import com.java.hms.model.Doctor;

public interface IDoctorDao {

    void addDoctor(Doctor doctor);
    List<Doctor> getAllDoctors();
    void deleteDoctor(int doctorId);
}
