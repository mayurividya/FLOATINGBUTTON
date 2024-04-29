package com.example.floatingactionbutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<user> userArrayList=new ArrayList<>();
    RecyclerView recyclerView;
    MyAdapter myAdapter;

    EditText editTextUsername,editTextUserNumber;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setAdapter(myAdapter);
        editTextUsername=findViewById(R.id.editTextUsername);
        editTextUserNumber=findViewById(R.id.editTextUserNumber);
        buttonSubmit=findViewById(R.id.buttonSubmit);


        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<user> userArrayList=new ArrayList<>();
                String username = editTextUsername.getText().toString().trim();
                String userNumber = editTextUserNumber.getText().toString().trim();
                if (username.isEmpty() && userNumber.isEmpty()){
                    Toast.makeText(MainActivity.this, "username:"+username+ ",UserNumber:"+userNumber, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "please enter username and userNumber", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}