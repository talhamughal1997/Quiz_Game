package com.example.talhamughal.k_b_c_game;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

      final TextView textView = findViewById(R.id.Questions);
      final Button btn1 = findViewById(R.id.BtnQuestion1);
      final LinearLayout linearLayout = findViewById(R.id.MainLinear);
       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               PlayActivityDesign.ViewAnimationsToggle(linearLayout,5000);

              }

       });

    }


}
