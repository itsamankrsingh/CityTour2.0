package com.aman.citytour20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set actionbar as toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);


        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuHome) {
            Toast.makeText(this, "Home Menu CLicked", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawers();
        }
        if (item.getItemId() == R.id.menuInfo) {
            Toast.makeText(this, "General Info Menu CLicked", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawers();
        }
        if (item.getItemId() == R.id.menuDemography) {
            Toast.makeText(this, "Demography Menu CLicked", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawers();
        }
        if (item.getItemId() == R.id.menuDestination) {
            Toast.makeText(this, "Destination Menu CLicked", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawers();
        }
        if (item.getItemId() == R.id.menuReach) {
            Toast.makeText(this, "How To Reach Menu CLicked", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawers();
        }
        if (item.getItemId() == R.id.menuAbout) {
            Toast.makeText(this, "About Bihar Menu CLicked", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawers();
        }
        if (item.getItemId() == R.id.menuDeveloper) {
            Toast.makeText(this, "Developer Menu CLicked", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawers();
        }
        return true;
    }
}