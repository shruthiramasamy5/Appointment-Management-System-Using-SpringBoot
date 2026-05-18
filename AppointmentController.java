package com.appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.appointment.model.Appointment;
import com.appointment.service.AppointmentService;

@Controller
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("appointment", new Appointment());
        return "add_appointment";
    }

    @PostMapping("/save")
    public String save(Appointment a) {
        service.saveAppointment(a);
        return "redirect:/view";
    }

    @GetMapping("/view")
    public String viewAppointments(Model model) {
        model.addAttribute("appointments", service.getAllAppointments());
        return "view_appointments";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.deleteAppointment(id);
        return "redirect:/view";
    }
}