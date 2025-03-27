package com.example.Repository.repository;

import com.example.Repository.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}

/*public interface StudentRepository extends CrudRepository<Student,Integer> {

    long count();
}*/
