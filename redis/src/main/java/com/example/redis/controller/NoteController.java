package com.example.redis.controller;

import com.example.redis.NoteService;
import com.example.redis.model.Note;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class NoteController {

    @Autowired
    private NoteService noteService;

    //create
    @PostMapping("/note/create")
    public ResponseEntity<Note> createNote(@RequestBody Note note){
        return ResponseEntity.status(HttpStatus.CREATED).body(noteService.createNote(note));
    }

    @GetMapping("/notes")
    public ResponseEntity<List<Note>> getAll(){
        return ResponseEntity.status(HttpStatus.CREATED).body(noteService.getAllNote());
    }

    @GetMapping({"/{noteId}"})
    public ResponseEntity<Note> getSingleNote(@PathVariable String noteId){
        return ResponseEntity.status(HttpStatus.OK).body(noteService.findById(noteId));
    }



}
