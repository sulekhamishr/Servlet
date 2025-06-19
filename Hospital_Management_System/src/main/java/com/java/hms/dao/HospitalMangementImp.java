package com.java.hms.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

import com.java.hms.model.Appointment;
import com.java.hms.model.Doctor;
import com.java.hms.model.Patient;

public class HospitalMangementImp implements IAppointmentDao , IDoctorDao, IPatientDao{

	
	SessionFactory sessionFactory;
	Session session;
	


	
	@Override
	public void addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		sessionFactory =new AnnotationConfiguration().configure().buildSessionFactory();

		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		session.save(appointment);
		trans.commit();
	    session.close();
		
		
	}
	
	@Override
	public Appointment getAppointment(int appointmentId) {
		// TODO Auto-generated method stub
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Appointment.class);
		cr.add(Restrictions.eq("appointmentId", appointmentId));
		Appointment appointment = (Appointment)cr.uniqueResult();
		return appointment;
	}


	@Override
	public List<Appointment> getAllAppointments() {
		// TODO Auto-generated method stub
		sessionFactory =new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Appointment.class);
        return cr.list();
	}



	@Override
	public List<Appointment> getAppointmentsByPatient(int patientId) {
		// TODO Auto-generated method stub
		sessionFactory= new AnnotationConfiguration().configure().buildSessionFactory();
		
		Criteria cr=session.createCriteria(Patient.class);
		return cr.list();
	}


	
	@Override
	public void updateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		
		sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction trans= session.beginTransaction();
		session.update(appointment);
		
	}

	

	@Override
	public void deleteAppointment(int appointmentId) {
		// TODO Auto-generated method stub
		sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Appointment.class);
		cr.add(Restrictions.eq("appointmentId", appointmentId));
		Appointment appointment = (Appointment)cr.uniqueResult();
		
		Transaction tx = session.beginTransaction();
		session.delete(appointment);
		tx.commit();
		session.close();
		
	}

	@Override
	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		
		sessionFactory= new AnnotationConfiguration().configure().buildSessionFactory();
	    session= sessionFactory.openSession();
		Transaction trans= session.beginTransaction();
		session.save(patient);
		trans.commit();
		session.close();
	}

	@Override
	public Patient getPatient(int patientId) {
		// TODO Auto-generated method stub
		
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Patient.class);
		cr.add(Restrictions.eq("patientId", patientId));
		Patient patient = (Patient)cr.uniqueResult();
		return patient;

	}

	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		
		sessionFactory= new AnnotationConfiguration().configure().buildSessionFactory();
		session=sessionFactory.openSession();
		Criteria cr= session.createCriteria(Patient.class);
		return cr.list();
	}

	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
	    sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction trans= session.beginTransaction();
		session.save(doctor);
		trans.commit();
		session.close();
		
		
	}

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		
		sessionFactory =new AnnotationConfiguration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		Criteria cr= session.createCriteria(Doctor.class);
		return cr.list();
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		
		
		sessionFactory= new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Criteria cr = session.createCriteria(Doctor.class);
		cr.add(Restrictions.eq("doctorId", doctorId));
		Doctor doc = (Doctor)cr.uniqueResult();
		Transaction tx = session.beginTransaction();
		session.delete(doc);
		tx.commit();

		session.close();
		
	}


}