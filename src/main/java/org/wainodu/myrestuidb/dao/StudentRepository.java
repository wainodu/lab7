package org.wainodu.myrestuidb.dao;

import org.wainodu.myrestuidb.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
