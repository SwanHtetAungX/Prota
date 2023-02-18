package com.ProtaMusicStreamApp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashSet;

public class NoteTaking extends AppCompatActivity {
    static ArrayList<String> notes=new ArrayList<String>();
    static ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_taking);
        ListView listView = findViewById(R.id.listView);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,notes);
        listView.setAdapter(arrayAdapter);

        // create callback method to be invoked when an item in this AdapterView has been clicked.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), NoteEditing.class);
                intent.putExtra("noteID",position);
                startActivity(intent);}});

        // create callback method to be invoked when an item in this AdapterView has been clicked for a long time
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id)
            { new AlertDialog.Builder(NoteTaking.this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Delete?")
                        .setMessage("Are you sure you want to delete this note?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override

                            //When clicking the dialog interface, the selected note will be removed and update the arrayAdapter code
                            public void onClick(DialogInterface dialog, int which)
                            {
                                notes.remove(position);
                                arrayAdapter.notifyDataSetChanged();
                                SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.ProtaMusicStreamApp;", Context.MODE_PRIVATE);
                                HashSet<String> set = new HashSet<>(NoteTaking.notes);
                                sharedPreferences.edit().putStringSet("notes", set).apply();}})

                        .setNegativeButton("No", null)
                        .show();

                return true;
            }
        });


    }
    @Override
    //adding a menu to add the app for adding new song
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);}

    @Override
    //to create a jump to the Note Editing Activity whenever the Add Note option is clicked
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        super.onOptionsItemSelected(item);
        if(item.getItemId() == R.id.add_note)
        {
            Intent intent = new Intent(getApplicationContext(), NoteEditing.class);
            startActivity(intent);
            return true;}
        return false;
    }


}