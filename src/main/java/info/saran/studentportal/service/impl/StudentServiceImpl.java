package info.saran.studentportal.service.impl;

import info.saran.studentportal.entity.Student;
import info.saran.studentportal.repository.StudentRepository;
import info.saran.studentportal.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long studentId) {
        Optional<Student> optionalStudent =  studentRepository.findById(studentId);
        return optionalStudent.get();
    }

    @Override
    public Student updateStudent(Student student) {
        Student existingStudent = studentRepository.findById(student.getId()).get();
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setDivision(student.getDivision());
        existingStudent.setAge(student.getAge());
        existingStudent.setStandard(student.getStandard());
        Student updatedUser = studentRepository.save(existingStudent);
        return updatedUser;
    }
}
