package com.example.mediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private Button play;
    private Button pause;
    private SeekBar seekBar;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mediaPlayer = MediaPlayer.create(this, R.raw.song);
        mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("http://penguinradio.dominican.edu/Sound%20FX%20Collection/Motorbike.mp3");
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                Toast.makeText(MainActivity.this, "Ready to Play", Toast.LENGTH_SHORT).show();
                mp.start();
            }
        });
        mediaPlayer.prepareAsync();
        mediaPlayer.start();

        seekBar = findViewById(R.id.seekBar);
        play = findViewById(R.id.play);
        pause = findViewById(R.id.pause);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });
    }
}