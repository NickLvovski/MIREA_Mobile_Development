package ru.filatov.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextTextPersonName);
    }

    public void onClickShowLetters (View view){
        Toast toast = Toast.makeText(getApplicationContext(),
                "СТУДЕНТ No 28 ГРУППА БСБО-05-21 Количество символов - "+  editText.getText().length(),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}