package com.example.redis.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "stream_note")
@Data
public class Note implements Serializable {

    @Id
    private String id;
    private String name;
    private String content;
    private boolean live = false;
}
