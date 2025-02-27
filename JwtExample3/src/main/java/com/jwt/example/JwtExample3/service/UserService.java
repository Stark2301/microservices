package com.jwt.example.JwtExample3.service;

import com.jwt.example.JwtExample3.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();

    public UserService() {
        userList.add(new User(UUID.randomUUID().toString(),"Arya Mishra","abc@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"Kunal Mishra","kunal@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"Shivam Mishra","shivam@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"Aman Mishra","aman@gmail.com"));
    }

    public List<User> getUserList(){
        return this.userList;
    }
}
