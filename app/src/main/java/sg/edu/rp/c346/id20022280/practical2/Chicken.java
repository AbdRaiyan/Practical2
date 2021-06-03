package sg.edu.rp.c346.id20022280.practical2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Chicken extends AppCompatActivity {

    TextView tvDescript;
    Button btnReturn;
    Button btnLink;

    private int currFontSize = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);

        tvDescript = findViewById(R.id.textViewDescription);
        btnReturn = findViewById(R.id.buttonReturn);
        btnLink = findViewById(R.id.buttonLink);

        registerForContextMenu(tvDescript);

        tvDescript.setText("There are hundreds of different chicken breeds and classifications. " +
                "They are distinguished from each other by many characteristics, including the following: " +
                "the place of origin, skin color, plumage color, size, comb type, number of toes, " +
                "egg coloring, and amount of feathering. In general, however, the chicken is a squat bird with a rounded " +
                "appearance. Typically, they stand no more than 27.6 inches tall, and they weigh around 5.7 pounds on average.");

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReturn = new Intent(Chicken.this,MainActivity.class);
                startActivity(intentReturn);
            }
        });

        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLink = new Intent(Intent.ACTION_VIEW, Uri.parse("https://a-z-animals.com/animals/chicken/"));
                startActivity(intentLink);
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, 0, 0, "Increase Font Size (" + currFontSize + "sp)");
        menu.add(0, 1, 1, "Decrease Font Size (" + currFontSize + "sp)");

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case 0:
                currFontSize+= 4;
                break;
            case 1:
                currFontSize-= 4;
                break;
        }

        tvDescript.setTextSize(currFontSize);

        return super.onContextItemSelected(item);
    }
}