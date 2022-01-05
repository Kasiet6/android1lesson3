package com.example.android1lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    ImageView imImage;
    Button btnImage1, btnImage2, btnImage3;
    Button btnOne, btnTwo, btnThree;
    boolean car1, car2, car3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initialization();
        listeners();
    }

    private void initialization() {
        imImage = findViewById(R.id.im_image);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_three);
    }

    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.btn_image1:
                imImage.setImageResource(R.drawable.bmw);
                car1 = true;
                car2 = false;
                car3 = false;
                break;
            case R.id.btn_image2:
                imImage.setImageResource(R.drawable.mersedes);
                car1 = false;
                car2 = true;
                car3 = false;
                break;
            case R.id.btn_image3:
                imImage.setImageResource(R.drawable.mazda);
                car1 = false;
                car2 = false;
                car3 = true;
                break;
        }

    }

    private void listeners() {
        btnOne.setOnClickListener(v -> {
            if (car1) {
                Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                btnOne.setAlpha(0f);
                btnOne.setTranslationY(50);
                btnOne.animate().alpha(1f).translationYBy(-50).setStartDelay(200).setDuration(1500);
            } else {
                Toast.makeText(GameActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
            }
        });
        btnTwo.setOnClickListener(v -> {
            if (car2) {
                Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                btnTwo.setAlpha(0f);
                btnTwo.setTranslationY(50);
                btnTwo.animate().alpha(1f).translationYBy(-50).setStartDelay(200).setDuration(1500);
            } else {
                Toast.makeText(GameActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
            }
        });
        btnThree.setOnClickListener(v -> {
            if (car3) {
                Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                btnThree.setAlpha(0f);
                btnThree.setTranslationY(50);
                btnThree.animate().alpha(1f).translationYBy(-50).setStartDelay(200).setDuration(1500);
            } else {
                Toast.makeText(GameActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
            }
        });

    }
}