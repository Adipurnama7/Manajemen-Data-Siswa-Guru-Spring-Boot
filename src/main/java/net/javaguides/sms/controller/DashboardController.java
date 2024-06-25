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

    public DashboardController(TeacherService teacherService, StudentService studentService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        long totalTeachers = teacherService.getTotalTeachers();
        long totalStudents = studentService.getTotalStudents();
        model.addAttribute("totalTeachers", totalTeachers);
        model.addAttribute("totalStudents", totalStudents);
        
        return "dashboard";
    }
}
