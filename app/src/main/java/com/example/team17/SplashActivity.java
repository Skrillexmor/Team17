package com.example.team17;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {
    //variables
    ImageView img1, img2;
    TextView logoName, logoDesc;
    //Animation
    Animation sideAnim, bottomAnim, rightAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        //hooks
        img1 = findViewById(R.id.shapeableImageView);
        img2 = findViewById(R.id.shapeableImageView2);
        /*logoName = findViewById(R.id.textView);
        logoDesc = findViewById(R.id.textView2);*/

        //Animation hooks
        sideAnim = AnimationUtils.loadAnimation(this, R.anim.side_anim);
        rightAnim = AnimationUtils.loadAnimation(this, R.anim.align);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_anim);

        //set animations to elements
        img1.setAnimation(sideAnim);
        img2.setAnimation(rightAnim);
        /*logoName.setAnimation(bottomAnim);
        logoDesc.setAnimation(bottomAnim);*/

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, GetstartedActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2500);
    }
}