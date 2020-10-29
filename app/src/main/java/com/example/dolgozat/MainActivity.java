package com.example.dolgozat;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private ImageView aicard, usrcard;
    private TextView playerscore, aiscore;
    private Button rock, paper, scisor;
    private int szam = 0;
    private int player = 0;
    private int korok = 0;
    private int aikor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView playerscore = findViewById(R.id.playerscore);
        TextView aiscore = findViewById(R.id.aiscore);
        Button rock = findViewById(R.id.rock);
        Button paper = findViewById(R.id.paper);
        Button scisor = findViewById(R.id.scisor);
        ImageView aicard = findViewById(R.id.aicard);
        final ImageView usrcard = findViewById(R.id.usrcard);


        szam = ((int) Math.random() * 3) + 1;
        if (szam == 1) {
            aicard.setImageResource(R.drawable.rock);
        }
        if (szam == 2) {
            aicard.setImageResource(R.drawable.paper);
        }
        if (szam == 3) {
            aicard.setImageResource(R.drawable.scissors);
        }


            rock.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    usrcard.setImageResource(R.drawable.rock);
                    korok++;

                }
            });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usrcard.setImageResource(R.drawable.paper);
                korok++;

            }
        });
        scisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usrcard.setImageResource(R.drawable.scissors);
                korok++;
            }
        });
    }
    }
