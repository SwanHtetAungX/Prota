package com.ProtaMusicStreamApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.HashSet;

public class NoteEditing extends AppCompatActivity {
   int noteID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editing);
        //Receiving  an intent
        EditText editText=findViewById(R.id.txtNoteTaking);
        Intent intent=getIntent();
        noteID=intent.getIntExtra("noteID",-1);
        //To prevent an error while calling the Note Editor Activity, some random number doesn’t get passed into the noteID variable of that activity
        if(noteID != -1)
        { editText.setText(NoteTaking.notes.get(noteID));}
        else
        {   NoteTaking.notes.add("");                // as initially, the note is empty
            noteID = NoteTaking.notes.size() - 1;
            NoteTaking.arrayAdapter.notifyDataSetChanged();
        }
        //Setting up a textWatcher()  to know when a note is edited
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {}
            @Override

            //when the text is changed, to update the items in arrayAdapter and store it permanently using sharepreferences
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                NoteTaking.notes.set(noteID,String.valueOf(charSequence));
                NoteTaking.arrayAdapter.notifyDataSetChanged();
                SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.ProtaMusicStreamApp;", Context.MODE_PRIVATE);
                HashSet<String> set = new HashSet<>(NoteTaking.notes);
                sharedPreferences.edit().putStringSet("notes", set).apply();}

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
    //save note
    public void saveNote(View view){
        Toast.makeText(this, "Note saved successfully", Toast.LENGTH_SHORT).show();
    }

}