package com.example.baitap4.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.baitap4.R;
import com.example.baitap4.danhbaFragment.FragmentDanhBaPageAdapter;
import com.google.android.material.tabs.TabLayout;

public class DanhbaFragment extends Fragment {
    FragmentDanhBaPageAdapter fragmentDanhBaPageAdapter;
    TabLayout tabLayout;
    ViewPager viewPager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_danhba,container,false);
        tabLayout = view.findViewById(R.id.tablayout12);
        viewPager = view.findViewById(R.id.viewpagedanhba);

        fragmentDanhBaPageAdapter = new FragmentDanhBaPageAdapter(getChildFragmentManager(), FragmentDanhBaPageAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(fragmentDanhBaPageAdapter);
        tabLayout.setupWithViewPager(viewPager);
        return  view;
    }
}
