package com.example.singlanguage;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    int mNumOfTabs; //tab 갯수

    public MyPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.mNumOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) { //탭 화면 전환

        switch (position) {
            case 0:
                Fragment1 tab1 = new Fragment1();   //숫자
                return tab1;
            case 1:
                Fragment2 tab2 = new Fragment2();   //자모음
                return tab2;
            case 2:
                Fragment3 tab3 = new Fragment3();   //사물
                return tab3;
            case 3:
                Fragment4 tab4 = new Fragment4();   //사람
                return tab4;
            case 4:
                Fragment5 tab5 = new Fragment5();   //음식
                return tab5;
            case 5:
                Fragment6 tab6 = new Fragment6();   //기타
                return tab6;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}