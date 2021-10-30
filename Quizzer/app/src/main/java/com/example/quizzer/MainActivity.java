package com.example.quizzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String[] questions = {"Java is a person?", "Java was introduced in 1233?", "Java was created in using Python?",
            "Java has abstract classes?", "Java supports interfaces"};
    private final boolean[] answers = {false, false, false, true, true};
    private int score = 0;
    private int index = 0;
    Button yes;
    Button no;
    TextView question;
    TextView scores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.question);
        scores = findViewById(R.id.score);
        question.setText(questions[index]);
        scores.setText(""+score);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index>questions.length-1){
                    scores.setText(""+score);
                    Toast.makeText(MainActivity.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                }
                else{
                    if (answers[index]){
                        score ++;
                    }
                    else{
                        score--;
                    }
                    index++;
                    if (index>questions.length-1){
                        scores.setText(""+score);
                        Toast.makeText(MainActivity.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                    }
                    else{
                        question.setText(questions[index]);
                        scores.setText(""+score);
                    }
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index>questions.length-1){
                    scores.setText(""+score);
                    Toast.makeText(MainActivity.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                }
                else{
                    if (!answers[index]){
                        score++;
                    }
                    else{
                        score--;
                    }
                    index++;
                    if (index > questions.length-1){
                        scores.setText(""+score);
                        Toast.makeText(MainActivity.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                    }
                    else{
                        question.setText(questions[index]);
                        scores.setText(""+score);
                    }
                }
            }
        });
    }
}