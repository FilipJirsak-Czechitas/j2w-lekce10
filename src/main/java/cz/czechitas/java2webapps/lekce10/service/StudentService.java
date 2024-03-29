package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
  private final StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }
}
