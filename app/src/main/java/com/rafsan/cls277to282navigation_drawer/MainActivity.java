package com.rafsan.cls277to282navigation_drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;

    MaterialToolbar materialToolBar;

    NavigationView navigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        materialToolBar = findViewById(R.id.materialToolBar);
        navigationView = findViewById(R.id.navigationView);

//====================================Material Tool Bar ======================
        materialToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if (item.getItemId() == R.id.share){
                    Toast.makeText(MainActivity.this, "SHARE me",Toast.LENGTH_LONG).show();
                } else if (item.getItemId() == R.id.like) {
                    Toast.makeText(MainActivity.this ,"LIKE me",Toast.LENGTH_LONG).show();
                }

                return false;
            }
        });

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout, new DarazFragment());
        fragmentTransaction.commit();



// ======================== Navigation Drawer (Toggle)==================
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                MainActivity.this, drawerLayout,materialToolBar,R.string.drawer_close,R.string.drawer_open
        );
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.daraz){
                    Toast.makeText(MainActivity.this,"Welcome To DARAZ",Toast.LENGTH_LONG).show();

                    FragmentManager fragmentManager = getSupportFragmentManager();

                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new DarazFragment());
                    fragmentTransaction.commit();

                    drawerLayout.closeDrawer(GravityCompat.START);
                } else if (item.getItemId() == R.id.iferi) {
                    Toast.makeText(MainActivity.this,"Welcome To IFERI",Toast.LENGTH_LONG).show();

                    FragmentManager fragmentManager = getSupportFragmentManager();

                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new IferiFragment());
                    fragmentTransaction.commit();

                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (item.getItemId() == R.id.inmedism) {
                    Toast.makeText(MainActivity.this,"Welcome To InMedism",Toast.LENGTH_LONG).show();

                    FragmentManager fragmentManager = getSupportFragmentManager();

                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new InmedismFragment());
                    fragmentTransaction.commit();

                    drawerLayout.closeDrawer(GravityCompat.START);
                }

                else if (item.getItemId() == R.id.setting) {
                    Toast.makeText(MainActivity.this,"Welcome To Setting",Toast.LENGTH_LONG).show();

                    drawerLayout.closeDrawer(GravityCompat.START);
                }

                return true;
            }
        });


    }
}