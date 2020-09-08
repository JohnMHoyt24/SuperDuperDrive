package com.udacity.jwdnd.course1.cloudstorage.model;

public class NoteForm {
    private String text;

    public NoteForm(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }
}
