package com.example.baitap4.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentPageAdapter extends FragmentStatePagerAdapter {
    private int number = 5;

    public FragmentPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TinnhanFragment();
            case 1:
                return new DanhbaFragment();
            case 2:
                return new NhomFragment();
            case 3:
                return new NhatKyFragment();
            case 4:
                return new ThemFragment();
            default: return new  DanhbaFragment();
        }

    }

    @Override
    public int getCount() {
        return number;
    }
}
