package com.sar.user.petcare;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class Home extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView bottomNavigationView=findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemReselectedListener);
        bottomNavigationView.setSelectedItemId(R.id.homeFragment);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemReselectedListener=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selected=null;
            switch (menuItem.getItemId())
            {
                case R.id.homeFragment:
                     selected=new Profile();
                     break;
                case R.id.momentsFragment:
                    selected=new Profile();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment,selected).commit();
           return  true;
        }

    };
}
