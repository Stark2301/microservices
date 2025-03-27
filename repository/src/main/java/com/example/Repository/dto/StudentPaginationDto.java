package com.example.Repository.dto;

import com.example.Repository.model.Student;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentPaginationDto {
    private List<Student> studentList;
    private Integer pageNumber;
    private Integer pageSize;
    private Long totalElements;
    private boolean lastPage;
}
