package com.example.chaptersix;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button bttn1,bttn2;
    MediaPlayer mediaPlayer1,mediaPlayer2;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bttn1 = (Button) findViewById(R.id.bttn);
        bttn2 = (Button) findViewById(R.id.bttn2);
        bttn1.setOnClickListener(bttn1L);
        bttn2.setOnClickListener(bttn2L);

        mediaPlayer1 = MediaPlayer.create(this, R.raw.track1);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.track2);
        playing=0;

    }
    Button.OnClickListener bttn1L = new Button.OnClickListener(){
        @Override
        public void onClick(View view){
            switch(playing) {
                case 0:
                    mediaPlayer1.start();
                    playing = 1;
                    bttn1.setText("Pause Music");
                    bttn2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mediaPlayer1.pause();
                    playing = 0;
                    bttn1.setText("Play Music");
                    bttn2.setVisibility(View.VISIBLE);

                    break;
            }
        }
    };
    Button.OnClickListener bttn2L = new Button.OnClickListener(){
        @Override
        public void onClick(View view){
            switch(playing) {
                case 0:
                    mediaPlayer2.start();
                    playing = 1;
                    bttn2.setText("Pause Music");
                    bttn1.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mediaPlayer2.pause();
                    playing = 0;
                    bttn2.setText("Play Music");
                    bttn1.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}