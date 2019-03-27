package com.dariogabriellsilva.navigationdrawerdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerLayout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.navView);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_item_um: {
                Toast.makeText(this, getString(R.string.menu_1), Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.nav_item_dois: {
                Toast.makeText(this, getString(R.string.menu_2), Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.nav_item_tres: {
                Toast.makeText(this, getString(R.string.menu_3), Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.nav_item_quatro: {
                Toast.makeText(this, getString(R.string.menu_4), Toast.LENGTH_SHORT).show();
                break;
            }
            default: {
                Toast.makeText(this, getString(R.string.menu_default), Toast.LENGTH_SHORT).show();
                break;
            }
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
