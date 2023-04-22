package ru.filatov.lesson2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName().toString();
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a = 3;
        int b = 0;
        int sum = a + b;
        Log.d(TAG,"on create:" + Integer.toString(sum));
        editText=findViewById(R.id.editTextTextPersonName);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"on start:");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String text = savedInstanceState.getString("data_value");
        Log.d(TAG,"Saved text: " + text);
        editText.setText(text);
    }



    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"on restart:");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"on resume:");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"on pause:");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG,"on save instance:");
        outState.putString("data_value", editText.getText().toString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"on stop:");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"on destroy:");
    }

    public void invokeSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", editText.getText().toString());
        startActivity(intent);
    }
}