package com.example.aasia.sahachaari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mixed_veg_soup extends AppCompatActivity {
    TextView vegSoupIng,vegSoupRecipe; Button videoButton6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mixed_veg_soup);
        vegSoupIng=(TextView) findViewById(R.id.vegSoupIng);
        vegSoupRecipe=(TextView)findViewById(R.id.vegSoupRecipe);
        setsoupText();
        videoButton6 = (Button) findViewById(R.id.videoButton6);
        videoButton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=CgePJY732us")));
            }
        });
    }

    public void setsoupText(){
        vegSoupIng.setText("INGREDIENTS:\n\n" +
                "Potato finely chopped 1 medium\n" +
                "Carrot finely chopped 1 medium\n" +
                "Button mushrooms finely chopped 6-8\n" +
                "Green capsicum seeded and chopped finely 1 medium\n" +
                "Onion finely chopped 1 medium\n" +
                "Cabbage finely chopped 1/4 medium\n" +
                "French beans finely chopped 6-8\n" +
                "Cauliflower grated 1 small\n" +
                "Oil 1 tablespoon\n" +
                "Bay leaves 2\n" +
                "Whole wheat flour (atta) 2 teaspoons\n" +
                "Salt to taste\n" +
                "White pepper powder to taste\n" +
                "Vegetable stock 2 cups\n" +
                "Skimmed milk 2 cups"
        );

        vegSoupRecipe.setText("\n\nRECIPE:\n\n" +
                "1. Heat oil in a thick-bottomed saucepan, add bay leaves and onion and sauté for two minutes over medium heat." +
                " Drain the potato and add. Add carrot, mushroom, cabbage, French beans and cauliflower.\n\n" +
                "2. Stir and cook on high heat for three to four minutes. medium heat or till flour emits a nice aroma. " +
                "Add salt and white pepper powder. Stir in the vegetable stock and bring to boil.\n\n" +
                "3. Add capsicum. Reduce heat and simmer till the vegetables are cooked and the soup reaches a fairly thick consistency. " +
                "Gradually stir in the skimmed milk and simmer for three to four minutes or till it reaches soup consistency.\n\n" +
                "4. Remove the bay leaves, adjust the seasoning and serve piping hot."
        );
    }
}
