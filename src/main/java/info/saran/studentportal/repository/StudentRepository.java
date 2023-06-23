package info.saran.studentportal.repository;

import info.saran.studentportal.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
