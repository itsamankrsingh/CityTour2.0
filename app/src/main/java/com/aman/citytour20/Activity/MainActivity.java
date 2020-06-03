package com.aman.citytour20.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.aman.citytour20.Fragment.AboutFragment;
import com.aman.citytour20.Fragment.DemographyFragment;
import com.aman.citytour20.Fragment.DestinationFragment;
import com.aman.citytour20.Fragment.DevFragment;
import com.aman.citytour20.Fragment.HomeFragment;
import com.aman.citytour20.Fragment.InfoFragment;
import com.aman.citytour20.Fragment.ReachFragment;
import com.aman.citytour20.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    MenuItem previousMenuItem = null;

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

        openHome();

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if (previousMenuItem != null) {
            previousMenuItem.setChecked(false);
        }
        item.setChecked(true);
        item.setCheckable(true);
        previousMenuItem = item;

        if (item.getItemId() == R.id.menuHome) {
            openHome();
            drawerLayout.closeDrawers();
        }
        if (item.getItemId() == R.id.menuInfo) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame, new InfoFragment());
            fragmentTransaction.addToBackStack("Info");
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("General Info");
            drawerLayout.closeDrawers();
        }
        if (item.getItemId() == R.id.menuDemography) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame, new DemographyFragment());
            fragmentTransaction.addToBackStack("Demography");
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Demography");
            drawerLayout.closeDrawers();
        }
        if (item.getItemId() == R.id.menuDestination) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame, new DestinationFragment());
            fragmentTransaction.addToBackStack("Destination");
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Top Destination");
            drawerLayout.closeDrawers();
        }
        if (item.getItemId() == R.id.menuReach) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame, new ReachFragment());
            fragmentTransaction.addToBackStack("Reach");
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Ho To Reach");
            drawerLayout.closeDrawers();
        }
        if (item.getItemId() == R.id.menuAbout) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame, new AboutFragment());
            fragmentTransaction.addToBackStack("About");
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("About Bihar");
            drawerLayout.closeDrawers();
        }
        if (item.getItemId() == R.id.menuDeveloper) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame, new DevFragment());
            fragmentTransaction.addToBackStack("Developer");
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Meet our Developer");
            drawerLayout.closeDrawers();
        }
        return true;
    }


    public void openHome() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame, new HomeFragment());
        //fragmentTransaction.addToBackStack("Home");
        fragmentTransaction.commit();
        getSupportActionBar().setTitle("Home");
        navigationView.setCheckedItem(R.id.menuHome);
    }


}