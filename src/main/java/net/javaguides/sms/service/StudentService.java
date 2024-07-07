package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Student;

public interface StudentService {
    // Mendapatkan daftar semua siswa
    List<Student> getAllStudents();
    
    // Menyimpan data siswa baru ke dalam database
    Student saveStudent(Student student);
    
    // Mendapatkan informasi siswa berdasarkan ID tertentu
    Student getStudentById(Long id);
    
    // Mengupdate data siswa yang sudah ada di database
    Student updateStudent(Student student);
    
    // Menghapus data siswa dari database berdasarkan ID
    void deleteStudentById(Long id);
    
    // Mendapatkan total jumlah siswa yang tersimpan di database
    long getTotalStudents();
}
