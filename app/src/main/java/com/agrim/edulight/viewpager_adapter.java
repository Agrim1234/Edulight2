package com.agrim.edulight;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by agrim on 27/12/17.
 */

public class viewpager_adapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragment=new ArrayList<>();
    ArrayList<String> tabtitles=new ArrayList<>();
    public void addFragments(Fragment fragments,String titles){
        this.fragment.add(fragments);
        this.tabtitles.add(titles);
    }
    public viewpager_adapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        return fragment.get(position);
    }
    @Override
    public int getCount() {
        return fragment.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitles.get(position);
    }
}
