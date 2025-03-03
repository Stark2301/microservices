package com.example.manualredis;

import com.example.manualredis.model.Student;
import com.example.manualredis.service.IStudentDao;
import com.example.redis.RedisApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManualRedisApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }
    @Autowired
    private IStudentDao studentDao;
    @Override
    public void run(String... args) throws Exception {



            studentDao.addStudent(new Student(101,"Arya Mishra",300.20));
            studentDao.addStudent(new Student(102,"Kunal Mishra",300.20));
            studentDao.addStudent(new Student(103,"Love Mishra",300.20));
            studentDao.addStudent(new Student(104,"Avika Mishra",300.20));

            studentDao.getAllStudent().forEach((k,v)-> System.out.println(k+ "--" +v));
        }
    }