package net.javaguides.sms.controller;

import net.javaguides.sms.service.StudentService;
import net.javaguides.sms.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    private final TeacherService teacherService;
    private final StudentService studentService;

    // Konstruktor untuk melakukan dependency injection terhadap TeacherService dan StudentService
    public DashboardController(TeacherService teacherService, StudentService studentService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
    }

    // Metode untuk menangani permintaan GET ke URL /dashboard
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        // Mengambil jumlah total guru dari service TeacherService
        long totalTeachers = teacherService.getTotalTeachers();
        
        // Mengambil jumlah total siswa dari service StudentService
        long totalStudents = studentService.getTotalStudents();
        
        // Menambahkan atribut totalTeachers dan totalStudents ke model
        model.addAttribute("totalTeachers", totalTeachers);
        model.addAttribute("totalStudents", totalStudents);
        
        // Mengembalikan nama view yang akan ditampilkan oleh browser
        return "dashboard";
    }
}
