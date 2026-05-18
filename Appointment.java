package com.appointment.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointmentid;

    private String clientname;
    private String service;
    private LocalDate date;
    private LocalTime time;

    public int getAppointmentid() { return appointmentid; }
    public void setAppointmentid(int appointmentid) { this.appointmentid = appointmentid; }

    public String getClientname() { return clientname; }
    public void setClientname(String clientname) { this.clientname = clientname; }

    public String getService() { return service; }
    public void setService(String service) { this.service = service; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public LocalTime getTime() { return time; }
    public void setTime(LocalTime time) { this.time = time; }
}