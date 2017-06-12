package com.example.aasia.sahachaari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gobi_intent extends AppCompatActivity {
    TextView gobiIng,gobiRecipe; Button videoButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gobi_intent);
        gobiIng=(TextView) findViewById(R.id.gobiIng);
        gobiRecipe=(TextView)findViewById(R.id.gobiRecipe);
        setGobiText();
        videoButton2 = (Button) findViewById(R.id.videoButton2);
        videoButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=yzOUCOezbDs")));
            }
        });
    }

    public void setGobiText(){
        gobiIng.setText("INGREDIENTS:\n\n" +
                        "Cauliflower\n" +
                        "All Purpose Flour 1/2 cup\n" +
                        "Corn Flour 1/4 cup\n" +
                        "Red chilli powder 1 teaspoon\n" +
                        "Salt to taste\n" +
                        "Corn flour 1/2 tablespoon\n" +
                        "Oil 2 tablespoons + for deep-frying\n" +
                        "Cauliflower cut into large florets 1 medium-sized\n" +
                        "Onion finely chopped 1 medium\n" +
                        "Garlic finely chopped 1 tablespoon\n" +
                        "Ginger finely chopped 1 tablespoon\n" +
                        "Green chilli finely chopped 1 tablespoon\n" +
                        "White pepper powder 1/4 teaspoon\n" +
                        "Soya sauce 2 tablespoons\n" +
                        "Sweet chilli sauce 2 tablespoons\n" +
                        "Fresh coriander leaves finely chopped 2 tablespoons\n" +
                        "Green onion finely chopped for garnish 1"
                        );

        gobiRecipe.setText("\n\nRECIPE:\n\n" +
                        "1. Combine together refined flour, corn flour, red chili powder, salt and a little bit of water to form a thick batter.\n\n" +
                        "2. Dissolve ½ tablespoon cornflour in half cup water and keep aside.\n\n" +
                        "3. Heat the oil in a pan and deep fry florets coated with batter, till golden brown. " +
                        "Remove and drain on an absorbant paper and keep aside.\n\n" +
                        "4. Heat two tablespoon oil in a non stick pan. " +
                        "Add the chopped onions, ginger, garlic and green chilies saute for two minutes.\n\n" +
                        "5. Add white pepper powder, soy sauce, sweet chilli sauce and salt.\n\n"+
                        "6. Cook for a minute and add the corn flour and water mixture. " +
                        "Add a little water and let simmer till the sauce becomes thick. " +
                        "Add the fried cauliflower florets and cook for another 2-3 minutes.\n\n" +
                        "7. Garnish with chopped spring onions and coriander leaves."
                );
    }
}