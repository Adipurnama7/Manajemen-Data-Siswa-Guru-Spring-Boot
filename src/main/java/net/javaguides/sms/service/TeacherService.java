package net.javaguides.sms.service;

import net.javaguides.sms.entity.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> getAllTeachers();

    Teacher getTeacherById(Long id);

    Teacher saveTeacher(Teacher teacher);

    Teacher updateTeacher(Teacher teacher);

    void deleteTeacherById(Long id);

    void saveOrUpdate(Teacher teacher);
     long getTotalTeachers();
}
