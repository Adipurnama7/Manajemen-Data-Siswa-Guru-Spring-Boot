package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.service.StudentService;

@Controller
public class StudentController {
    
    private StudentService studentService;

    // Konstruktor untuk melakukan dependency injection dari StudentService
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    // Handler method untuk menampilkan daftar semua siswa
    @GetMapping("/students")
    public String listStudents(Model model) {
        // Menambahkan daftar semua siswa ke model untuk ditampilkan di halaman students.html
        model.addAttribute("students", studentService.getAllStudents());
        return "students"; // Nama view atau template yang akan ditampilkan
    }
    
    // Handler method untuk menampilkan form untuk menambahkan siswa baru
    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        // Membuat objek Student baru untuk menampung data form siswa
        Student student = new Student();
        model.addAttribute("student", student); // Menambahkan objek student ke model
        return "create_student"; // Nama view atau template untuk menampilkan form tambah siswa
    }
    
    // Handler method untuk menyimpan data siswa baru ke dalam database
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student); // Menyimpan data siswa menggunakan StudentService
        return "redirect:/students"; // Redirect ke halaman daftar siswa setelah menyimpan
    }
    
    // Handler method untuk menampilkan form untuk mengedit data siswa berdasarkan ID
    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        // Mengambil data siswa berdasarkan ID dan menambahkannya ke model
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student"; // Nama view atau template untuk menampilkan form edit siswa
    }

    // Handler method untuk menyimpan perubahan data siswa setelah proses edit
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
            @ModelAttribute("student") Student student,
            Model model) {
        
        // Mengambil siswa yang sudah ada dari database berdasarkan ID
        Student existingStudent = studentService.getStudentById(id);
        
        // Mengatur nilai-nilai yang diperbarui ke objek siswa yang sudah ada
        existingStudent.setName(student.getName());
        existingStudent.setNis(student.getNis());
        existingStudent.setAlamat(student.getAlamat());
        existingStudent.setNoTelephone(student.getNoTelephone());
        
        // Menyimpan objek siswa yang sudah diperbarui ke dalam database
        studentService.updateStudent(existingStudent);
        
        return "redirect:/students"; // Redirect ke halaman daftar siswa setelah mengupdate
    }
    
    // Handler method untuk menghapus data siswa dari database berdasarkan ID
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id); // Menghapus siswa berdasarkan ID
        return "redirect:/students"; // Redirect ke halaman daftar siswa setelah menghapus
    }
}
