package com.example.arusocse.mealplanthesis;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.solver.Goal;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.*;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.facebook.stetho.Stetho;
import com.facebook.stetho.okhttp3.StethoInterceptor;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* Stetho */
        Stetho.initializeWithDefaults(this);

        new OkHttpClient.Builder()
                .addNetworkInterceptor(new StethoInterceptor())
                .build();

        /* Database */
        DBAdapter db = new DBAdapter(this);
        db.open();
//COUNT ROWS IN FOOD */
        int numberRows = db.count("food");

        if (numberRows < 1) {

             /*INSERT DATA TO DATABASE */
            //Toast.makeText(this, "Loading setup.....", Toast.LENGTH_LONG).show();
            DBInsertFood insertFood = new DBInsertFood(this);
            insertFood.insertAllCategories();
            insertFood.insertAllFood();
            //Toast.makeText(this, "Setup Completed.....", Toast.LENGTH_LONG).show();

        }

        numberRows = db.count("users");


        /* Close database */
        db.close();


        if (numberRows < 1) {

            Intent i = new Intent(MainActivity.this, profiling_sign_up.class);
            startActivity(i);
        }
        else{
            Intent i = new Intent(MainActivity.this, FragmentActivity.class);
            startActivity(i);

        }

    }

}
