package com.example;

import android.app.Fragment;
import android.app.FragmentManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v13.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ColorPagingFragment extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Instantiate a ViewPager and a PagerAdapter.
        ViewPager pager = (ViewPager) inflater.inflate(
                R.layout.color_pager, container, false);
        FragmentStatePagerAdapter pagerAdapter =
            new ColorPagerAdapter(getFragmentManager());
        pager.setAdapter(pagerAdapter);
        return pager;
    }

    /**
     * A simple pager adapter that represents 2 color view objects, in
     * sequence.
     */
    private class ColorPagerAdapter extends FragmentStatePagerAdapter {
        public ColorPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment frag = new ColorFragment();
            Bundle args = new Bundle();
            if (position == 0) {
                args.putInt("COLOR", Color.CYAN);
            } else {
                args.putInt("COLOR", Color.YELLOW);
            }
            frag.setArguments(args);
            return frag;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }

}
