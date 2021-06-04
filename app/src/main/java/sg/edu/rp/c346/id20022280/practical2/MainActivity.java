package sg.edu.rp.c346.id20022280.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCamel;
    Button btnCatFish;
    Button btnChmln;
    Button btnCheth;
    Button btnChick;
    Button btnDachs;
    Button btnDalm;
    Button btnDeer;
    Button btnDingo;
    Button btnDodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCamel = findViewById(R.id.buttonChange1);
        btnCatFish = findViewById(R.id.buttonChange2);
        btnChmln = findViewById(R.id.buttonChange3);
        btnCheth = findViewById(R.id.buttonChange4);
        btnChick = findViewById(R.id.buttonChange5);
        btnDachs = findViewById(R.id.buttonChange6);
        btnDalm  = findViewById(R.id.buttonChange7);
        btnDeer = findViewById(R.id.buttonChange8);
        btnDingo = findViewById(R.id.buttonChange9);
        btnDodo = findViewById(R.id.buttonChange10);


        btnCamel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Camel.class);
                startActivity(intent);
            }
        });

        btnCatFish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Catfish.class);
                startActivity(intent);
            }
        });

        btnChmln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Chameleon.class);
                startActivity(intent);
            }

        });

        btnCheth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Cheetah.class);
                startActivity(intent);

            }
        });

        btnChick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Chicken.class);
                startActivity(intent);

            }
        });

        btnDachs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Dachshund.class);
                startActivity(intent);

            }
        });

        btnDalm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Dalmation.class);
                startActivity(intent);

            }
        });

        btnDeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Deer.class);
                startActivity(intent);

            }
        });

        btnDingo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Dingo.class);
                startActivity(intent);

            }
        });

        btnDodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Dodo.class);
                startActivity(intent);
            }
        });
    }
}