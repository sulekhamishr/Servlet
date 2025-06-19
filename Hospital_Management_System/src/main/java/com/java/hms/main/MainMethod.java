package com.java.hms.main;

import com.java.hms.dao.HospitalMangementImp;
import com.java.hms.model.Appointment;
import com.java.hms.model.Doctor;
import com.java.hms.model.Patient;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class MainMethod {

	
	
	
    static Scanner sc = new Scanner(System.in);
    static HospitalMangementImp hospitalDao = new HospitalMangementImp();
    
    
    

    public static void displayMenu() {
        System.out.println("\n=== Hospital Management System ===");
        System.out.println("1. Add Doctor");
        System.out.println("2. Add Patient");
        System.out.println("3. Add Appointment");
        System.out.println("4. Get Patient");
        System.out.println("5. Get Appointment");
        System.out.println("6. Get All Doctors");
        System.out.println("7. Get All Patients");
        System.out.println("8. Get All Appointments");
        System.out.println("9. Delete Appointment");
        System.out.println("10. Delete Doctor");
        System.out.println("11. Exit");
        System.out.print("Enter choice: ");
    }
    
    

    public static void addDoctor() {
        Doctor doctor = new Doctor();

        System.out.print("Enter Doctor Name: ");
        doctor.setName(sc.nextLine());
        System.out.print("Enter Specialization: ");
        doctor.setSpecialty(sc.nextLine());
        System.out.print("Enter Phone Number: ");
        doctor.setPhoneNumber(sc.nextLong());
        sc.nextLine();
        System.out.print("Enter Email: ");
        doctor.setEmail(sc.nextLine());

        hospitalDao.addDoctor(doctor);
        System.out.println("Doctor added successfully.");
    }

    public static void addPatient() {
        try {
            Patient patient = new Patient();

            System.out.print("Enter Patient Name: ");
            patient.setName(sc.nextLine());
            System.out.print("Enter Date of Birth (yyyy-mm-dd): ");
            String dobInput = sc.nextLine();
            Date dateOfBirth = Date.valueOf(dobInput);
            patient.setDateOfBirth(dateOfBirth);
            System.out.print("Enter Gender: ");
            patient.setGender(sc.nextLine());
            System.out.print("Enter Address: ");
            patient.setAddress(sc.nextLine());
            System.out.print("Enter Phone Number: ");
            patient.setPhoneNumber(sc.nextLong());
            
            sc.nextLine();

            System.out.print("Enter Email: ");
            patient.setEmail(sc.nextLine()); 
            System.out.print("Enter Blood Group: ");
            patient.setBloodGroup(sc.nextLine());

            System.out.print("Enter Disease: ");
            patient.setDisease(sc.nextLine());

            System.out.print("Enter Admission Date (yyyy-mm-dd): ");
            String admissionDateInput = sc.nextLine();
            Date admissionDate = Date.valueOf(admissionDateInput);
            patient.setAdmissionDate(admissionDate);

            hospitalDao.addPatient(patient);
            System.out.println("Patient added successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid date format. Please use yyyy-mm-dd.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void addAppointment() {
        try {
            System.out.print("Enter Appointment Date (yyyy-mm-dd): ");
            String dateInput = sc.nextLine();
            Date appointmentDate = Date.valueOf(dateInput);

            System.out.print("Enter Doctor ID: ");
            int doctorId = sc.nextInt();

            System.out.print("Enter Patient ID: ");
            int patientId = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Enter the reason for visit");
            String reasonForVisit=sc.nextLine();

            Appointment appointment = new Appointment();
            appointment.setAppointmentDate(appointmentDate);
            appointment.setDoctorId(doctorId);
            appointment.setPatientId(patientId);
            appointment.setReasonForVisit(reasonForVisit);

            hospitalDao.addAppointment(appointment);
            System.out.println("Appointment added successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid date format.");
        }
    }

    public static void getPatient() {

    	
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Patient patient = hospitalDao.getPatient(id);
        if (patient != null) {
            System.out.println("Name: " + patient.getName());
            int age = Period.between(patient.getDateOfBirth().toLocalDate(), LocalDate.now()).getYears();
            System.out.println("Age: " + age);
            System.out.println("Gender:"+patient.getGender());
            System.out.println("Addresss:"+patient.getAddress());
            System.out.println("Phone Number:"+patient.getPhoneNumber());
            System.out.println("Email: " + patient.getEmail());
            System.out.println("Blood Group: " + patient.getBloodGroup());
            System.out.println("Disease:"+patient.getDisease());
            System.out.println("Admmision date :"+patient.getAdmissionDate());

            System.out.println();
        } else {
            System.out.println("Patient not found.");
        }
    }

    public static void getAppointment() {
        System.out.print("Enter Appointment ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Appointment app = hospitalDao.getAppointment(id);
        if (app != null) {
            System.out.println("Date: " + app.getAppointmentDate());
            System.out.println("Doctor ID: " + app.getDoctorId());
            System.out.println("Patient ID: " + app.getPatientId());
            System.out.println("Appointmnet Id :"+app.getAppointmentDate());
            System.out.println("Doctor Id "+ app.getDoctorId());
            System.out.println("Patient Id"+app.getPatientId());
            System.out.println("reson for cisit"+app.getReasonForVisit());

        } else {
            System.out.println("Appointment not found.");
        }
    }

    public static void getAllDoctors() {
        List<Doctor> doctors = hospitalDao.getAllDoctors();
        for (Doctor doc : doctors) {
            System.out.println("ID: " + doc.getDoctorId());
            System.out.println("Name: " + doc.getName());
            System.out.println("Specialization: " + doc.getSpecialty());
            System.out.println("Phone Number:"+doc.getPhoneNumber());
            System.out.println("email :"+doc.getEmail());
            System.out.println("---");
        }
    }


    public static void getAllPatients() {
    	    List<Patient> patients = hospitalDao.getAllPatients();
    	    for (Patient pat : patients) {
    	        System.out.println("ID: " + pat.getPatientId());
    	        System.out.println("Name: " + pat.getName());
    	        int age = Period.between(pat.getDateOfBirth().toLocalDate(), LocalDate.now()).getYears();
    	        System.out.println("Age: " + age);
    	        System.out.println("Gender: " + pat.getGender());
    	        System.out.println("Address: " + pat.getAddress());
    	        System.out.println("Phone Number: " + pat.getPhoneNumber());
    	        System.out.println("Email: " + pat.getEmail());
    	        System.out.println("Blood Group: " + pat.getBloodGroup());
    	        System.out.println("Disease: " + pat.getDisease());
    	        System.out.println("Admission Date: " + pat.getAdmissionDate());
    	        System.out.println("---");
    	    }
    	}

        
   

    public static void getAllAppointments() {
        List<Appointment> appointments = hospitalDao.getAllAppointments();
        for (Appointment app : appointments) {
            System.out.println("ID: " + app.getAppointmentId());
            System.out.println("Date: " + app.getAppointmentDate());
            System.out.println("Doctor ID: " + app.getDoctorId());
            System.out.println("Patient ID: " + app.getPatientId());
            System.out.println("Reson for visit :"+app.getReasonForVisit());
            System.out.println("---");
        }
    }

    public static void deleteAppointment() {
        System.out.print("Enter Appointment ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();
        hospitalDao.deleteAppointment(id);
        System.out.println("Appointment deleted.");
    }

    public static void deleteDoctor() {
        System.out.print("Enter Doctor ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();
        hospitalDao.deleteDoctor(id);
        System.out.println("Doctor deleted.");
    }

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1: addDoctor(); break;
                case 2: addPatient(); break;
                case 3: addAppointment(); break;
                case 4: getPatient(); break;
                case 5: getAppointment(); break;
                case 6: getAllDoctors(); break;
                case 7: getAllPatients(); break;
                case 8: getAllAppointments(); break;
                case 9: deleteAppointment(); break;
                case 10: deleteDoctor(); break;
                case 11:
                    System.out.println("Exiting system...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
