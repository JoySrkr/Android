package com.example.animation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView myImageView;
    private AnimationDrawable frameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageView = findViewById(R.id.myImageView);
        myImageView.setBackgroundResource(R.drawable.frame_animation);
        frameAnimation = (AnimationDrawable) myImageView.getBackground();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (frameAnimation != null && !frameAnimation.isRunning()) {
            frameAnimation.start();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (frameAnimation != null && frameAnimation.isRunning()) {
            frameAnimation.stop();
        }
    }
}