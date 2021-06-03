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

public class Dalmation extends AppCompatActivity {

    TextView tvDescript;
    Button btnReturn;
    Button btnLink;

    private int currFontSize = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalmation);

        tvDescript = findViewById(R.id.textViewDescription);
        btnReturn = findViewById(R.id.buttonReturn);
        btnLink = findViewById(R.id.buttonLink);

        registerForContextMenu(tvDescript);

        tvDescript.setText("A Dalmatian’s white coat with black spots makes it immediately recognizable. " +
                "This breed is known for its sensitive temperament and high energy level. It belongs to the non-sporting group." +
                "One of the lesser-known facts about this dog breed is it got its name from a coastal area in Austria called Dalmatia. " +
                "Descended from pointers, Dalmatians were used as coach dogs in 19th century Europe. " +
                "Coach dogs moved alongside horse-drawn carriages occupied by members of British noble families. " +
                "Fortunately, Dalmatians were known to get along well with horses!");

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReturn = new Intent(Dalmation.this,MainActivity.class);
                startActivity(intentReturn);
            }
        });

        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLink = new Intent(Intent.ACTION_VIEW, Uri.parse("https://a-z-animals.com/animals/dalmatian/"));
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