package com.example.svetofor;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void onClickWhiteC(View view)
        {
            ConstraintLayout constraintLayout = findViewById(R.id.main);
            constraintLayout.setBackgroundColor(Color.WHITE);
        }
        public void onClickGreyC(View view)
        {
            ConstraintLayout constraintLayout = findViewById(R.id.main);
            constraintLayout.setBackgroundColor(Color.GRAY);
        }
        public void onClickBLackC(View view)
        {
            ConstraintLayout constraintLayout = findViewById(R.id.main);
            constraintLayout.setBackgroundColor(Color.BLACK);
        }
    }
