package com.example.coffehouse.DatHang;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coffehouse.DatHang.Adapter.SectionPagerAdapter;
import com.example.coffehouse.DatHang.TabDatHang.DoAnFragment;
import com.example.coffehouse.DatHang.TabDatHang.ThucUongFragment;
import com.example.coffehouse.DatHang.TabDatHang.PhoBienFragment;
import com.example.coffehouse.R;
import com.google.android.material.tabs.TabLayout;

public class DatHangFragment extends Fragment {

    View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;


    public DatHangFragment() {
        // Required empty public constructor
    }

    public static DatHangFragment getInstance() {
        return new DatHangFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragment = inflater.inflate(R.layout.fragment_dat_hang, container, false);
        viewPager = myFragment.findViewById(R.id.viewPager);
        tabLayout = myFragment.findViewById(R.id.tabLayout);
        return myFragment;
    }
    //Call onActivity Create method

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new PhoBienFragment(), "Phổ biến");
        adapter.addFragment(new ThucUongFragment(), "Thức uống");
        adapter.addFragment(new DoAnFragment(), "Đồ ăn");
        viewPager.setAdapter(adapter);
    }
}