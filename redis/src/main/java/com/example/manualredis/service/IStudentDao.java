package com.example.manualredis.service;

import com.example.manualredis.model.Student;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Map;

public interface IStudentDao {

    void  addStudent(Student student);
    void  modifyStudent(Student student);
    Student getOneStudent(Integer id);
    Map<Integer,Student> getAllStudent();
    void removeStudent(Integer id);
}
