package net.javaguides.sms.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;
import net.javaguides.sms.service.StudentService;

// Menandakan bahwa kelas ini adalah sebuah service dan akan dikelola oleh Spring
@Service
public class StudentServiceImpl implements StudentService {

    // Repositori untuk berinteraksi dengan entitas Student dalam database
    private final StudentRepository studentRepository;
    
    // Konstruktor untuk injeksi dependensi StudentRepository
    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    // Mengambil semua siswa dari database
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Menyimpan objek Student ke database
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Mengambil Student berdasarkan ID
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    // Memperbarui objek Student di database
    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    // Menghapus Student berdasarkan ID
    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);    
    }

    // Menghitung total jumlah siswa di database
    @Override
    public long getTotalStudents() {
        return studentRepository.count();
    }
}
