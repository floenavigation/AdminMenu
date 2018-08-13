package com.hfad.adminmenu;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    CardView options_1, options_2, options_3;
    Handler handler = new Handler();
    Runnable runnable_1 = new Runnable() {
        @Override
        public void run() {
            options_1.setVisibility(View.VISIBLE);
        }
    };
    Runnable runnable_2 = new Runnable() {
        @Override
        public void run() {
            options_2.setVisibility(View.VISIBLE);
        }
    };
    Runnable runnable_3 = new Runnable() {
        @Override
        public void run() {
            options_3.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        options_1 = (CardView) findViewById(R.id.cardView_1);
        handler.postDelayed(runnable_1, 100);
        options_2 = (CardView) findViewById(R.id.cardView_2);
        handler.postDelayed(runnable_2, 500);
        options_3 = (CardView) findViewById(R.id.cardView_3);
        handler.postDelayed(runnable_3, 1000);

    }

    public void onClickListener(View view) {
    }
}
