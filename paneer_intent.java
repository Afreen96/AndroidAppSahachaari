package com.example.aasia.sahachaari;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class paneer_intent extends AppCompatActivity {
    TextView paneerIng,paneerRecipe; Button videoButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paneer_intent);
        paneerIng=(TextView) findViewById(R.id.paneerIng);
        paneerRecipe=(TextView)findViewById(R.id.paneerRecipe);
        setPaneerText();
        videoButton = (Button) findViewById(R.id.videoButton);
        videoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=YcI9nWFO-PA")));
            }
        });
    }

    public void setPaneerText(){
        paneerIng.setText("INGREDIENTS:\n\n" +
                "Paneer (cottage cheese) cut into triangles 500 grams\n"+
                "Butter 5 tablespoons\n"+
                "Oil 1 teaspoon\n"+
                "Bay leaves 2\n"+
                "Cloves 2\n"+
                "Cinnamon 2 one-inch\n"+
                "Dried red chillies broken 2\n"+
                "Coriander seeds crushed 2 tablespoons\n"+
                "Onion sliced 1 medium\n"+
                "Ginger paste 2 teaspoons\n"+
                "Garlic paste 2 teaspoons\n"+
                "Coriander powder 1 teaspoon\n"+
                "Red chilli powder 1 teaspoon\n"+
                "Tomatoes chopped 5-6 medium\n"+
                "Salt to taste\n"+
                "Kasoori methi crushed 1/2 teaspoon\n"+
                "Fresh cream 2 tablespoons");

        paneerRecipe.setText("\n\nRECIPE:\n\n" +
                "1. Heat three tablespoons butter with one teaspoon oil in a kadai. " +
                "Add bay leaves, cloves, cinnamon, red chillies and half of the crushed coriander seeds. " +
                "Sauté for half a minute.\n\n" +
                "2. Add onion and stir-fry for thirty seconds and add ginger paste and garlic paste. " +
                "Cook for another thirty seconds. " +
                "Add coriander powder, red chilli powder and tomatoes. " +
                "Cook on high heat till oil leaves the masala. " +
                "Puree the mixture.\n\n" +
                "3. Heat the remaining butter in a non-stick, cook the pureed mixture for two minutes. " +
                "Add paneer pieces and salt. Add half a cup of water. " +
                "Cook covered on low heat for five minutes.\n\n" +
                "4. Sprinkle kasoori methi and mix in lightly. " +
                "Remove from heat and mix in cream. " +
                "Serve hot, garnished with remaining crushed coriander seeds.");
    }
}
