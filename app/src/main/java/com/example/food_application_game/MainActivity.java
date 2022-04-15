package com.example.food_application_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView swiggy_img,deseret_img,hamburger_btn,pizzacafe_btn,penguin_btn,Cooking_btn,Squid_btn,ninja,yummy_btn,zomato_btn;
    private ImageView mcdonal_btn,pizzahub_btn,domina_btn,Uber_btn,fresh_btn,burger_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blinding();

        ninja.setImageResource(R.drawable.ic_launcher_foreground);
        Glide.with(MainActivity.this)
                .load("https://uploads-cdn.kiloo.com/uploads/game/542/1610355131-1556533993-pizza-ninja-220x220.jpg")
                .placeholder(R.drawable.flase_screen)
                .into(ninja);
//apps
        swiggy_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://www.swiggy.com/");
                startActivity(intent);
            }
        });
        zomato_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://www.zomato.com/surat/restaurants?utm_source=google&utm_medium=cpc&utm_campaign=Gsearch_P-MWeb_O-NA_C-Brand_A-NewUser_SC-Generic_L-PanIndia&utm_term=zomato&gclid=CjwKCAjwur-SBhB6EiwA5sKtjgSXJCkRFYhpWMIAzHeliU6VEttBJzZHEAw9NbOabT3Wwbk0Y0a7bRoCoiQQAvD_BwE");
                startActivity(intent);
            }
        });
        pizzahub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://www.pizzahut.co.in/menu/pizzas");
                startActivity(intent);
            }
        });
        domina_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://pizzaonline.dominos.co.in/");
                startActivity(intent);
            }
        });
        mcdonal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://www.mcdonalds.com/us/en-us/mcdelivery.html");
                startActivity(intent);
            }
        });
        Uber_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://www.ubereats.com/");
                startActivity(intent);
            }
        });
        fresh_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://www.freshmenu.com/");
                startActivity(intent);
            }
        });
        burger_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://www.burgerking.in//");
                startActivity(intent);
            }
        });



//   game
        deseret_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://hoopgame.net/play/Summer-Dessert-Party");
                startActivity(intent);
            }
        });
        hamburger_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://www.kiloo.com/en/hamburger-2020/");
                startActivity(intent);
            }
        });
        pizzacafe_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1", "https://www.kiloo.com/en/pizza-cafe/");
                startActivity(intent);
            }
        });
        penguin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://www.kiloo.com/en/penguin-diner/");
                startActivity(intent);
            }
        });
        Cooking_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://hoopgame.net/game/World-Best-Cooking-Recipes");
                startActivity(intent);
            }
        });
        Squid_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://hoopgame.net/game/Squid-Game");
                startActivity(intent);
            }
        });
        ninja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://www.kiloo.com/en/pizza-ninja/");
                startActivity(intent);
            }
        });
        yummy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third_Activity.class);
                intent.putExtra("n1","https://poki.com/en/g/yummy-toast");
                startActivity(intent);
            }
        });



    }

    private void blinding() {

//        apps
        swiggy_img = findViewById(R.id.swiggy_img);
        zomato_btn = findViewById(R.id.zomato_btn);
        pizzahub_btn = findViewById(R.id.pizzahub_btn);
        domina_btn = findViewById(R.id.domina_btn);
        mcdonal_btn = findViewById(R.id.mcdonal_btn);
        Uber_btn = findViewById(R.id.Uber_btn);
        fresh_btn = findViewById(R.id.fresh_btn);
        burger_btn= findViewById(R.id.burger_btn);

//                game
        deseret_img = findViewById(R.id.deseret_img);
        hamburger_btn = findViewById(R.id.hamburger_btn);
        pizzacafe_btn = findViewById(R.id.pizzacafe_btn);
        penguin_btn = findViewById(R.id.penguin_btn);
        Cooking_btn = findViewById(R.id.Cooking_btn);
        Squid_btn= findViewById(R.id.Squid_btn);
        yummy_btn= findViewById(R.id.yummy_btn);



        ninja = findViewById(R.id.ninja);

    }

}