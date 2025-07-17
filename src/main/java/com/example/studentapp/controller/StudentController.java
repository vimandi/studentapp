package com.example.studentapp.controller;

import com.example.studentapp.model.Student;
import com.example.studentapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public String viewStudents(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "add";
    }
    

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        studentRepository.save(student);
        return "redirect:/";
    }
}
