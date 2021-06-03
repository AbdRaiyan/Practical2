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

public class Chameleon extends AppCompatActivity {

    TextView tvDescript;
    Button btnReturn;
    Button btnLink;

    private int currFontSize = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chameleon);

        tvDescript = findViewById(R.id.textViewDescription);
        btnReturn = findViewById(R.id.buttonReturn);
        btnLink = findViewById(R.id.buttonLink);

        registerForContextMenu(tvDescript);

        tvDescript.setText("Chameleons are animals that are found throughout jungle and desert alike, " +
                "in Africa, Asia, and parts of Southern Europe, and chameleons have also been introduced " +
                "to parts of North America. Most of these lizards live in trees or in bushes. " +
                "Only a few species live on the ground under piles of leaves.");

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReturn = new Intent(Chameleon.this,MainActivity.class);
                startActivity(intentReturn);
            }
        });

        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLink = new Intent(Intent.ACTION_VIEW, Uri.parse("https://a-z-animals.com/animals/catfish/"));
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

