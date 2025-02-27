package com.example.redis;

import com.example.redis.model.Note;
import com.example.redis.repository.NoteRepository;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;


    @CachePut(value = "notes",key = "#note.id")
    public Note createNote(Note note){
        note.setId(UUID.randomUUID().toString());
        return noteRepository.save(note);
    }

    @Cacheable(value = "notes", key = "'all_notes'")
    public List<Note> getAllNote(){
        return noteRepository.findAll();
    }

    @Cacheable(value = "notes",key = "#noteId")
    public Note findById(String noteId){
        return noteRepository.findById(noteId).orElseThrow(()->new RuntimeException("Note Not found"));
    }

//    public Note updateNote(Long noteId,Note note){
//        Note note1 = noteRepository.findById(noteId).orElseThrow(()->new RuntimeException("Note Not Present"));
//        note1.setName(note.getName());
//        note1.setLive(note.isLive());
//        note1.setContent(note.getContent());
//
//        return noteRepository.save(note1);
//    }

    @CacheEvict(value = "notes",key = "#noteId")
    public void deleteNoteById(String noteId){
        Note note = noteRepository.findById(noteId).orElseThrow(()-> new RuntimeException("Note not present"));
        noteRepository.delete(note);
    }

}
