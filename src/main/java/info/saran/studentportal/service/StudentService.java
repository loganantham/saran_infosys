package info.saran.studentportal.service;

import info.saran.studentportal.entity.Student;

public interface StudentService {
    Student createStudent(Student student);

    Student getStudentById(Long studentId);

    Student updateStudent(Student student);
}
