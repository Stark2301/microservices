package com.example.manualredis.service.impl;

import com.example.manualredis.model.Student;
import com.example.manualredis.service.IStudentDao;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class IStudentDaoImpl implements IStudentDao {

    private final String KEY="STUDENT";
    //reference type,key type,value type
    @Resource(name="rt")
    private HashOperations<String,Integer,Student> hashOperations;

    @Override
    public void addStudent(Student student) {

        hashOperations.putIfAbsent(KEY,student.getStId(),student);
    }

    @Override
    public void modifyStudent(Student student) {
         hashOperations.put(KEY,student.getStId(),student);
    }

    @Override
    public Student getOneStudent(Integer id) {

        return hashOperations.get(KEY,id);
    }

    @Override
    public Map<Integer, Student> getAllStudent() {
        return hashOperations.entries(KEY);
    }

    @Override
    public void removeStudent(Integer id) {

        //hash ref,key
            hashOperations.delete(KEY,id);
    }
}
