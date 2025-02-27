package com.example.manualredis.service.impl;

import com.example.manualredis.model.Student;
import com.example.manualredis.service.IStudentDao;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class IStudentDaoImpl implements IStudentDao {

    //reference type,key type,value type
    private HashOperations<String,Integer,Student> hashOperations;

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void modifyStudent(Student student) {

    }

    @Override
    public Student getOneStudent(Integer id) {
        return null;
    }

    @Override
    public Map<Integer, Student> getAllStudent() {
        return Map.of();
    }

    @Override
    public void removeStudent(Integer id) {

    }
}
