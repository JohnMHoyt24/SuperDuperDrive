package com.udacity.jwdnd.course1.cloudstorage.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteListService {
    private List<String> notes;

    public NoteListService(){
        this.notes = new ArrayList<>();
    }

    public void addNotes(String note){
        notes.add(note); //A note is being added to the notes list, POST
    }

    public List<String> getNotes(){
        return new ArrayList<>(this.notes); //All the saved notes are retrieved, GET
    }
}
