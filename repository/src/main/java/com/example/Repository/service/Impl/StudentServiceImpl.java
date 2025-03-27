package com.example.Repository.service.Impl;

import com.example.Repository.dto.StudentDto;
import com.example.Repository.dto.StudentPaginationDto;
import com.example.Repository.model.Student;
import com.example.Repository.repository.StudentRepository;
import com.example.Repository.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentPaginationDto getAllStudent(Integer pageNumber, Integer pageSize, String sort) {
//        Pageable studentPage = PageRequest.of(pageNumber,pageSize);
        Pageable studentPage = PageRequest.of(pageNumber,pageSize,Sort.Direction.DESC,sort);
        Page<Student> students =  studentRepository.findAll(studentPage);

        StudentPaginationDto studentPaginationDto = new StudentPaginationDto();
        studentPaginationDto.setPageNumber(studentPage.getPageNumber());
        studentPaginationDto.setPageSize(studentPage.getPageSize());
        studentPaginationDto.setTotalElements(students.getTotalElements());
        studentPaginationDto.setLastPage(students.isLast());
        studentPaginationDto.setStudentList(students.getContent());
        return studentPaginationDto;
    }

    @Override
    public Long getStudentCount() {
        long countStudent = studentRepository.count();
        return countStudent;
    }

    @Override
    public Student createStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setName(studentDto.getName());
        student.setAge(studentDto.getAge());
        student.setAddress(studentDto.getAddress());
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Student student) {
        Optional<Student> s = studentRepository.findById(student.getId());

        if (!s.isPresent()){
            throw new RuntimeException("Student is not Present");
        }

        Student getStudent = s.get();
        studentRepository.delete(getStudent);
    }

    @Override
    public void deleteById(Integer id) {
        Optional<Student> deleteStudent = studentRepository.findById(id);

        if (!deleteStudent.isPresent()){
            throw new RuntimeException("Student is not present");
        }

        studentRepository.deleteById(id);
    }


}