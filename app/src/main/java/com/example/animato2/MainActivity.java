package com.example.animato2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mainBtn(View view) {
        if(view == findViewById(R.id.windmillBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateWindmill(this);
        }

        if(view == findViewById(R.id.spinBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateSpin(this);
        }

        if(view == findViewById(R.id.diagonalBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateDiagonal(this);
        }

        if(view == findViewById(R.id.splitBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateSplit(this);
        }

        if(view == findViewById(R.id.shrinkBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateShrink(this);
        }

        if(view == findViewById(R.id.cardBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateCard(this);
        }

        if(view == findViewById(R.id.inandoutBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateInAndOut(this);
        }

        if(view == findViewById(R.id.swipeleftBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateSwipeLeft(this);
        }

        if(view == findViewById(R.id.swiperightBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateSwipeRight(this);
        }

        if(view == findViewById(R.id.sliderleftBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateSlideLeft(this);
        }

        if(view == findViewById(R.id.sliderightBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateSlideRight(this);
        }

        if(view == findViewById(R.id.slidedownBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateSlideDown(this);
        }

        if(view == findViewById(R.id.slideupBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateSlideUp(this);
        }

        if(view == findViewById(R.id.zoomBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateZoom(this);
        }

        if(view == findViewById(R.id.fadeBtn)){
            startActivity(new Intent(this, NewActivity.class));
            Animatoo.animateFade(this);
        }
    }
}