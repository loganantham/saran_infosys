package info.saran.studentportal.controller;

import info.saran.studentportal.entity.Student;
import info.saran.studentportal.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/students")
public class StudentController {

    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student savedStudent = studentService.createStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long studentId){
        Student student = studentService.getStudentById(studentId);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") Long userId,
                                           @RequestBody Student student){
        student.setId(userId);
        Student updatedStudent = studentService.updateStudent(student);
        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }
}
