package com.appointment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.appointment.model.Appointment;
import com.appointment.repository.AppointmentRepository;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository repo;

    public Appointment saveAppointment(Appointment a) {
        return repo.save(a);
    }

    public List<Appointment> getAllAppointments() {
        return repo.findAll();
    }

    public void deleteAppointment(int id) {
        repo.deleteById(id);
    }

    public Appointment getAppointmentById(int id) {
        return repo.findById(id).orElse(null);
    }
}