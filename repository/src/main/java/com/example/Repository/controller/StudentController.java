package com.example.Repository.controller;

import com.example.Repository.dto.StudentDto;
import com.example.Repository.dto.StudentPaginationDto;
import com.example.Repository.model.Student;
import com.example.Repository.service.StudentService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody StudentDto student){
        Student student1 = studentService.createStudent(student);
        return new ResponseEntity<>(student1, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllStudent(@RequestParam(defaultValue = "10" , required = false) Integer pageNumber ,
                                           @RequestParam(defaultValue = "2" , required = false) Integer pageSize,
                                           @RequestParam(defaultValue = "name",required = false) String sortBy){
        StudentPaginationDto studentList = studentService.getAllStudent(pageNumber,pageSize,sortBy);
        return new ResponseEntity<>(studentList,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id){
        studentService.deleteById(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/count")
    public ResponseEntity<?> getCount(){
        long countStudent=studentService.getStudentCount();
        return new ResponseEntity<>(countStudent,HttpStatus.OK);
    }

 /*   @GetMapping("/search")
    public ResponseEntity<?> searchStudent(@RequestParam(defaultValue = "abc",required = false) String name){
        List<Student> studentList = studentService.searchStudent(name);
        return new ResponseEntity<>(studentList,HttpStatus.OK);
    }*/
 }