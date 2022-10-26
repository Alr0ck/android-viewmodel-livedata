package com.example.myviewmodelpraktek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    MahasiswaVIewModel mahasiswaViewModel;

//    private static final String KEY_NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        mahasiswaViewModel = new ViewModelProvider(this).get(MahasiswaVIewModel.class);
        mahasiswaViewModel.getName().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });
//        MahasiswaViewModel mhs = new MahasiswaVIewModel();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                textView.setText("Hallo bro....");
                Random random = new Random();
                int randValue = random.nextInt(200);
                mahasiswaViewModel.getName().setValue(String.valueOf(randValue));
            }
        });

//        if(savedInstanceState != null){
//            textView.setText(savedInstanceState.getString(KEY_NAME));
//        }
    }

//    @Override
//    protected void onSaveInstanceState(@NonNull Bundle outState) {
//        outState.putString(KEY_NAME, textView.getText().toString());
//        super.onSaveInstanceState(outState);
//    }
}