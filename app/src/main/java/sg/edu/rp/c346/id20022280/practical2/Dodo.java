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

public class Dodo extends AppCompatActivity {

    TextView tvDescript;
    Button btnReturn;
    Button btnLink;

    private int currFontSize = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodo);

        tvDescript = findViewById(R.id.textViewDescription);
        btnReturn = findViewById(R.id.buttonReturn);
        btnLink = findViewById(R.id.buttonLink);

        registerForContextMenu(tvDescript);

        tvDescript.setText("First discovered in 1598 by European sailors, the large, flightless dodo has since " +
                "become a sort of byword for clumsiness and backwardness." +
                "But despite its reputation, the dodo bird adapted over millions of years of evolution for the tough " +
                "environment of Mauritius. If anything doomed the dodo, it was an unfortunate victim of circumstance. " +
                "After years of merciless hunting from humans and introduced species, the dodo went extinct by around 1688. " +
                "Most of what we know about the dodo comes from contemporary accounts and modern studies of its anatomy. " +
                "A few specimens were brought back to Europe, which inadvertently helped to preserve the bones and soft tissue for study.");

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReturn = new Intent(Dodo.this,MainActivity.class);
                startActivity(intentReturn);
            }
        });

        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLink = new Intent(Intent.ACTION_VIEW, Uri.parse("https://a-z-animals.com/animals/dodo/"));
                startActivity(intentLink);
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"Increase Font Size ("+ currFontSize + "sp)");
        menu.add(0,1,1,"Decrase Font Size (" +currFontSize+"sp)");
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