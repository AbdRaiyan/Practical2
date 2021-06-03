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

public class Cheetah extends AppCompatActivity {

    TextView tvDescript;
    Button btnReturn;
    Button btnLink;

    private int currFontSize = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheetah);

        tvDescript = findViewById(R.id.textViewDescription);
        btnReturn = findViewById(R.id.buttonReturn);
        btnLink = findViewById(R.id.buttonLink);

        registerForContextMenu(tvDescript);

        tvDescript.setText("The Cheetah is a large and powerful feline that was once found throughout " +
                "Africa and Asia and even in parts of Europe. Today however, it is found in only a few " +
                "remote regions of its once vast natural range, primarily due to growing Human settlements " +
                "and the hunting of them for their fur. There are widely considered to be five different " +
                "subspecies of Cheetah that vary only very slightly in colouration and are most easily " +
                "distinguished by their geographic location. Although they are not considered to be part " +
                "of the ‘big cat’ family as they cannot roar, Cheetahs are one of Africa‘s most powerful " +
                "predators and are most renowned for their immense speed when in a chase. " +
                "Capable of reaching speeds of more than 60mph for short periods of time, the Cheetah is the " +
                "fastest land mammal in the world.");

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReturn = new Intent(Cheetah.this,MainActivity.class);
                startActivity(intentReturn);
            }
        });

        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLink = new Intent(Intent.ACTION_VIEW, Uri.parse("https://a-z-animals.com/animals/cheetah/"));
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