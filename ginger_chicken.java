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

public class ginger_chicken extends AppCompatActivity {
    TextView gingerIng,gingerRecipe; Button videoButton7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ginger_chicken);
        gingerIng=(TextView) findViewById(R.id.gingerIng);
        gingerRecipe=(TextView)findViewById(R.id.gingerRecipe);
        setgingerText();
        videoButton7 = (Button) findViewById(R.id.videoButton7);
        videoButton7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=nfWN-T_SWfM")));
            }
        });
    }
    public void setgingerText(){
        gingerIng.setText("INGREDIENTS:\n\n" +
                "Cooked Chicken cooked and shredded 500 grams\n" +
                "Ginger chopped 1 tablespoon\n" +
                "Dried mushrooms 4\n" +
                "Soy sauce 2 tablespoons\n" +
                "Onion finely chopped 1\n" +
                "Garlic clove crushed 1\n" +
                "Vinegar 2 tablespoons\n" +
                "Sugar 1 teaspoon\n" +
                "Tomato puree 1 teaspoon\n" +
                "Salt to taste\n" +
                "Black pepper powder to taste\n" +
                "Chicken stock 1 1/2 cups\n" +
                "Oil 1 tablespoon\n" +
                "Corn flour 1 tablespoon\n" +
                "Sherry 1 tablespoon"
        );

        gingerRecipe.setText("\n\nRECIPE:\n\n" +
                "1. Soak dried mushrooms in warm water for thirty minutes. Drain and slice.\n\n" +
                "2. Add soy sauce, onion, ginger, garlic, vinegar, sugar, tomato puree, salt and pepper and chicken stock to a non stick pan.\n\n" +
                "3. Bring to a boil and simmer for two minutes.\n\n" +
                "4. Heat oil in another non stick pan.. Add chicken and sauté for three to four minutes.\n\n" +
                "5. Add the soy sauce mixture and mix well.\n\n"+
                "6. Dilute corn flour in sherry and add to the chicken.\n\n"+
                "7. Cook till sauce thickens.\n\n" +
                "8. Add mushrooms and mix well\n\n"+
                "9. Serve hot."

        );
    }
}
