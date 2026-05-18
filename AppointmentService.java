package com.appointment.service;

import java.util.List;
import com.appointment.model.Appointment;

public interface AppointmentService {

    Appointment saveAppointment(Appointment a);
    List<Appointment> getAllAppointments();
    void deleteAppointment(int id);
    Appointment getAppointmentById(int id);
}