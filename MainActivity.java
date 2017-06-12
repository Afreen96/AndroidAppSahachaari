package com.example.aasia.sahachaari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.database.Cursor;

public class MainActivity extends AppCompatActivity {
    EditText searchText;
    Button ok;
    String[] ing = {null}, tokensVal = {null};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchText = (EditText) findViewById(R.id.searchText);
        ok = (Button) findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Intent obj = new Intent(getApplicationContext(),recipe_not_exist.class);
                //startActivity(obj);
                String str = searchText.getText().toString();
                tokensVal = str.split(",");
                /*for (String nstr : tokensVal) {
                    Toast msg = Toast.makeText(getBaseContext(), nstr, Toast.LENGTH_LONG);
                    msg.show();
                }*/
                //Intent obj = new Intent(getApplicationContext(),paneer_intent.class);
                //startActivity(obj);
                openIntent();
            }
        });
        insertRecipe();
    }
    public void openIntent(){
        Class nclass= null;
        DBAdapter db = new DBAdapter(this);
        int flag=0;
        db.open();
        for(int i=1;i<=10;i++) {
            Cursor c = db.getRecipe(i);
            String s= c.getString(2);
            String Classname= c.getString(3);
            ing= s.split(",");
            if(findSubset(ing, tokensVal)){
                try {
                    //Toast.makeText(this,"inside try", Toast.LENGTH_LONG).show();
                    nclass = Class.forName(Classname);
                } catch (ClassNotFoundException e) {
                    //Toast.makeText(this,"class not found", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
                if(nclass!= null) {
                    //Toast.makeText(this,"not null", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(), nclass);
                    startActivity(intent);
                }
                else{
                    //Toast.makeText(this,"is null", Toast.LENGTH_LONG).show();
                }
                flag=1;
                break;
            }
        }
        if(flag==0){
            Intent intent = new Intent(getApplicationContext(), recipe_not_exist.class);
            startActivity(intent);
        }
        db.close();
    }
    public boolean findSubset(String[] arr1, String[] arr2){
        int flag=0;
        int n2= arr2.length;
        int n1= arr1.length;
        for(int i=0;i<n1;i++){
            arr1[i]=arr1[i].trim();
            //System.out.println(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            arr2[i]= arr2[i].trim();
            //System.out.println(arr2[i]);
        }
        for(int i=0; i< n2; i++){
            for(int j=0;j<n1;j++){
                if(arr2[i].equalsIgnoreCase(arr1[j])){
                    //System.out.println("I am here");
                    flag++;
                    break;
                }
            }
        }
        if(flag==n2){
            return true;
        }
        else{
            return false;
        }
    }
    public void display(Cursor c)
    {
        Class nclass= null;
        /*Toast.makeText(this,
                "id: " + c.getString(0) + "\n" +
                        "Name: " + c.getString(1) + "\n" +
                        "Ingredients: " + c.getString(2) + "\n" + "Intent name: " + c.getString(3),
                Toast.LENGTH_LONG).show();*/
        String Classname=c.getString(3);
        ing=c.getString(2).split(",");
        /*for(String nstr:ing) {
            Toast msg = Toast.makeText(getBaseContext(), nstr, Toast.LENGTH_LONG);
            msg.show();
        }
        Toast.makeText(this,"here", Toast.LENGTH_LONG).show();*/
       /* try {
            Toast.makeText(this,"inside try", Toast.LENGTH_LONG).show();
            nclass = Class.forName(Classname);
        } catch (ClassNotFoundException e) {
            Toast.makeText(this,"class not found", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
        if(nclass!= null) {
            Toast.makeText(this,"not null", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(), nclass);
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"is null", Toast.LENGTH_LONG).show();
        }*/
    }

    public void insertRecipe()
    {
        DBAdapter db = new DBAdapter(this);
        //---add a contact---
        db.open();
        db.deleteTable();
        //db.deleteRecipe(1);
        long id = db.insertRecipe("1","Paneer Butter Masala", "paneer,butter,onion,methi", "com.example.aasia.sahachaari.paneer_intent");
        id= db.insertRecipe("2","Gobi Manchurian", "cauliflower,soya,chilli,flour", "com.example.aasia.sahachaari.gobi_intent");
        id= db.insertRecipe("3","Achaari Chicken","chicken,yogurt,lemon juice,onion","com.example.aasia.sahachaari.achaariChicken_intent");
        id= db.insertRecipe("4","Mutton Biryani","mutton,basmati rice,yogurt,cloves","com.example.aasia.sahachaari.muttonBiryani_intent");
        id= db.insertRecipe("5","Rajma Masala","kidney beans,tomato,garam masala,onion","com.example.aasia.sahachaari.rajmaMasala");
        id= db.insertRecipe("6","Mixed Veg Soup","carrot,potato,soup,bay leaves","com.example.aasia.sahachaari.mixed_veg_soup");
        id= db.insertRecipe("7","Ginger Chicken", "ginger,chicken,mushroom,garlic", "com.example.aasia.sahachaari.ginger_chicken");
        id= db.insertRecipe("8","Palak Paneer", "paneer,spinach,cream,cumin", "com.example.aasia.sahachaari.palak_paneer");
        id= db.insertRecipe("9","Chicken 65", "chicken,yogurt,turmeric,red chilli", "com.example.aasia.sahachaari.chicken_sixty");
        id= db.insertRecipe("10","vegetable Biryani","basmati rice,peas,carrot,tomato", "com.example.aasia.sahachaari.vegbiryani");
        /*if(id != 0)
            Toast.makeText(getApplicationContext(),"Data Inserted Successfully ",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(getApplicationContext(),"Data could not be inserted ",Toast.LENGTH_LONG).show();*/

        Cursor c = db.getRecipe(8);
        if (c.moveToFirst())
            display(c);
        else
            Toast.makeText(this, "No recipe found", Toast.LENGTH_LONG).show();

        db.close();

    }
}