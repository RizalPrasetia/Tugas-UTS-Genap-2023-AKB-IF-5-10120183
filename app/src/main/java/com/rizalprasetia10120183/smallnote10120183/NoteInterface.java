package com.rizalprasetia10120183.smallnote10120183;
//10120183
//Rizal Prasetia Supriadi
//IF 5
import android.database.Cursor;

import com.rizalprasetia10120183.smallnote10120183.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

