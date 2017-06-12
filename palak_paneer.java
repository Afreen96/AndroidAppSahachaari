package com.example.aasia.sahachaari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class palak_paneer extends AppCompatActivity {
    TextView ppIng,ppRecipe; Button videoButton8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palak_paneer);
        ppIng=(TextView) findViewById(R.id.ppIng);
        ppRecipe=(TextView)findViewById(R.id.ppRecipe);
        setppText();
        videoButton8 = (Button) findViewById(R.id.videoButton8);
        videoButton8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=gtS84etMrKA")));
            }
        });
    }
    public void setppText(){
        ppIng.setText("INGREDIENTS:\n\n" +
                "Spinach 900 grams\n" +
                "Paneer (cottage cheese) 200 grams\n" +
                "Green chillies 2-3\n" +
                "Garlic chopped 8-10 cloves\n" +
                "Oil 3 tablespoons\n" +
                "Cumin seeds 1/2 teaspoon\n" +
                "Salt to taste\n" +
                "Lemon juice 1 tablespoon\n" +
                "Fresh cream 4 tablespoons"
        );

        ppRecipe.setText("\n\nRECIPE:\n\n" +
                "1. Remove the stems and wash spinach thoroughly in running water. Blanch in salted boiling water for two minutes.\n\n" +
                "2. Refresh in chilled water. Squeeze out excess water. Grind into a fine paste along with green chillies.\n\n" +
                "3. Cut the paneer into one inch by one inch by half inch pieces. Heat oil in a pan.\n\n" +
                "4. Add cumin seeds. When they begin to change colour, add garlic and sauté for half a minute.\n\n" +
                "5. Add the spinach puree and stir. Check seasoning.\n\n"+
                "6. Add water if required. When the gravy comes to a boil, add the paneer and mix well. Stir in lemon juice.\n\n"+
                "7. Finally add fresh cream. Serve hot."

        );
    }
}
