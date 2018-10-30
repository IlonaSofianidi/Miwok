package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private final int COUNT_PAGES = 4;
    private final String[] tabs = {"Numbers", "Colors", "Family", "Phrases"};
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new ColorsFragment();
        } else if (position == 2) {
            return new FamilyFragment();
        } else if (position == 3) {
            return new PhrasesFragment();
        }
        return null;
    }


    @Override
    public int getCount() {
        return COUNT_PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
