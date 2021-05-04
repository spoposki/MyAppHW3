package com.example.myapphw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1, btn2, resetBtn;
    TextView tv;
    Random r;

    View.OnClickListener ml;
    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       init();


    }

    private void init() {

        score  = 0;

        r = new Random() ;

        btn1 = findViewById(R.id.button);

        btn1.setOnClickListener( this );

        btn2 =  findViewById(R.id.button2);

        btn2.setOnClickListener( this );

        tv = findViewById( R.id.textView);

        tv.setText( " Your score is " + score );
        btn1.setText( String.valueOf(r.nextInt(100)+1) );
        btn2.setText( String.valueOf(r.nextInt(100)+1) );

    }

    @Override
    public void onClick(View v) {

    int p = Integer.parseInt( ( (String) btn1.getText() ));
    int q = Integer.parseInt( ( (String) btn2.getText() ));



        if ( v.getId()  == R.id.button )
        {
            if ( p  > q )
            {
                score++;
                tv.setText( " Great Job " + " Your score is " + score);

            }
            else if ( p < q )
            {
                score--;
                tv.setText( " Try again - Lost a Point" + " Your score is " + score);
            }
            else{
                tv.setText( " Equal Numbers - New Round "+ " Your score is " + score);
            }

            btn1.setText( String.valueOf(r.nextInt(100)+1) );
            btn2.setText( String.valueOf(r.nextInt(100)+1) );

        }
        else if(  v.getId()  == R.id.button2  )
        {
            if ( p  < q )
            {
                tv.setText( " Great Job " + " Your score is " + score);

            }
            else if ( p > q )
            {
                tv.setText( " Try again - Lost a Point " + " Your score is " + score);
            }
            else{
                tv.setText( " Equal Numbers - New Round " + " Your score is " + score);
            }

            btn1.setText( String.valueOf(r.nextInt(100)+1) );
            btn2.setText( String.valueOf(r.nextInt(100)+1) );

        }



    }
}


