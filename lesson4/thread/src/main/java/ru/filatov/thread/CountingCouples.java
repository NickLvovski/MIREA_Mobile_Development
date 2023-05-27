package ru.filatov.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import ru.filatov.thread.databinding.ActivityCountingCouplesBinding;
import ru.filatov.thread.databinding.ActivityMainBinding;

public class CountingCouples extends AppCompatActivity {

    private ActivityCountingCouplesBinding binding;
    private String averageCouples;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCountingCouplesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        averageCouples = getIntent().getSerializableExtra("averageCouples")
                .toString();
        binding.averageCouples.setText("Cреднее количество пар в день за период одного " +
                "месяца " + averageCouples);

    }
}