package com.example.aasia.sahachaari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class achaariChicken_intent extends AppCompatActivity {
    TextView achaariIng,achaariRecipe; Button videoButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achaari_chicken_intent);
        achaariIng=(TextView) findViewById(R.id.achaariIng);
        achaariRecipe=(TextView)findViewById(R.id.achaariRecipe);
        setAchaariText();
        videoButton3 = (Button) findViewById(R.id.videoButton3);
        videoButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Z_qmEPJb7HI")));
            }
        });
    }

    public void setAchaariText(){
        achaariIng.setText("INGREDIENTS:\n\n" +
                "Boneless chicken cut into 1 inch pieces 400 grams\n" +
                "Lemon juice 1 tablespoon\n" +
                "Salt to taste\n" +
                "Ginger-garlic paste 1 tablespoon\n" +
                "Red chilli powder 2 teaspoons\n" +
                "Butter 2 tablespoons\n" +
                "Gram flour (besan) 1 tablespoon\n" +
                "Hung yogurt 1 cup\n" +
                "Mustard oil 2 tablespoons\n" +
                "Oil for shallow frying\n" +
                "Chaat masala to sprinkle\n" +
                "Fresh mint sprigs for garnishing\n" +
                "Onion rings to serve\n" +
                "Lemon wedges to serve\n" +
                "Spice mix\n" +
                "Mustard seeds 1 teaspoon\n" +
                "Fennel seeds (saunf) 1 teaspoon\n" +
                "Onion seeds (kalonji) 1 teaspoon\n" +
                "Fenugreek seeds (methi dana) ½ teaspoon\n" +
                "Black salt (kala namak) ½ teaspoon");

        achaariRecipe.setText("\n\nRECIPE:\n\n" +
                "1. Take chicken pieces in a bowl. " +
                "Add lemon juice, salt, ginger-garlic paste and chilli powder and mix well. " +
                "Set aside for 15-20 minutes.\n\n" +
                "2. Heat butter in a non-stick pan. " +
                "Add gram flour and sauté till fragrant. " +
                "Remove from heat and set aside.\n\n" +
                "3. To make spice mix, dry roast mustard seeds, fennel seeds, onion seeds and fenugreek seeds for a minute. " +
                "Transfer into a mortar, add black salt and crush coarsely with a pestle.\n\n" +
                "4. Take yogurt in another bowl. " +
                "Add roasted gram flour, mustard oil, crushed spice mix and salt and whisk well.\n\n"+
                "5. Add chicken pieces and mix well. Refrigerate to marinate for 1-2 hours.\n\n" +
                "6. Heat some oil in a non-stick pan. " +
                "Add marinated chicken pieces and shallow-fry till golden and fully cooked.\n\n"+
                "7. Sprinkle chaat masala on top, garnish with mint sprig and serve hot with onion rings and lemon wedges.");
    }
}
