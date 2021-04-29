package com.example.baitap4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;

import com.example.baitap4.Fragment.FragmentPageAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    FragmentPageAdapter fragmentPageAdapter;
    ViewPager viewPager;
    BottomNavigationView bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.bottonavigation);
        viewPager = findViewById(R.id.viewpage);

        fragmentPageAdapter = new FragmentPageAdapter(getSupportFragmentManager(), FragmentPageAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(fragmentPageAdapter);

        bt.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.tinnhan:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.danhba:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.nhom:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.nhatky:
                        viewPager.setCurrentItem(3);
                        break;
                    case R.id.them:
                        viewPager.setCurrentItem(4);
                        break;


                }
                return true;
            }
        });

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bt.getMenu().findItem(R.id.tinnhan).setChecked(true);
                        break;
                    case 1:
                        bt.getMenu().findItem(R.id.danhba).setChecked(true);
                        break;
                    case 2:
                        bt.getMenu().findItem(R.id.nhom).setChecked(true);
                        break;
                    case 3:
                        bt.getMenu().findItem(R.id.nhatky).setChecked(true);
                        break;
                    case 4:
                        bt.getMenu().findItem(R.id.them).setChecked(true);
                        break;
                    default:
                        bt.getMenu().findItem(R.id.tinnhan).setChecked(true);


                }


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}