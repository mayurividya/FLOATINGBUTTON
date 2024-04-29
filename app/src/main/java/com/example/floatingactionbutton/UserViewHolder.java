package com.example.floatingactionbutton;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    EditText editTextUsername,editTextUserNumber;

   Button buttonSubmit ;


    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        editTextUsername=itemView.findViewById(R.id.editTextUsername);
        editTextUserNumber=itemView.findViewById(R.id.editTextUserNumber);
        buttonSubmit=itemView.findViewById(R.id.buttonSubmit);

    }
}
