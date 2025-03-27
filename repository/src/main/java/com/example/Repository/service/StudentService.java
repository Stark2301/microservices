package com.example.Repository.service;

import com.example.Repository.dto.StudentDto;
import com.example.Repository.dto.StudentPaginationDto;
import com.example.Repository.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface StudentService {

    StudentPaginationDto getAllStudent(Integer pageNumber,Integer pageSize,String sort);

    Long getStudentCount();

    Student createStudent(StudentDto studentDto);

    void deleteStudent(Student studentDto);

    void deleteById(Integer id);

//    List<Student> searchStudent(String name);
}
