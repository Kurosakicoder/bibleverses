package com.manipuribible.kurosaki.manipuribibleverse.Pitar_Two;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.design.widget.TabLayout;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.manipuribible.kurosaki.manipuribibleverse.R;
//import an.z.manipuribiblenewverse.Romiya.RomansMainActivity;
//import an.z.manipuribiblenewverse.Romiya.Romans_1;
//import an.z.manipuribiblenewverse.Romiya.Romans_10;
//import an.z.manipuribiblenewverse.Romiya.Romans_11;
//import an.z.manipuribiblenewverse.Romiya.Romans_12;
//import an.z.manipuribiblenewverse.Romiya.Romans_13;
//import an.z.manipuribiblenewverse.Romiya.Romans_14;
//import an.z.manipuribiblenewverse.Romiya.Romans_15;
//import an.z.manipuribiblenewverse.Romiya.Romans_16;
//import an.z.manipuribiblenewverse.Romiya.Romans_2;
//import an.z.manipuribiblenewverse.Romiya.Romans_3;
//import an.z.manipuribiblenewverse.Romiya.Romans_4;
//import an.z.manipuribiblenewverse.Romiya.Romans_5;
//import an.z.manipuribiblenewverse.Romiya.Romans_6;
//import an.z.manipuribiblenewverse.Romiya.Romans_7;
//import an.z.manipuribiblenewverse.Romiya.Romans_8;
//import an.z.manipuribiblenewverse.Romiya.Romans_9;

public class Peter2MainActivity extends AppCompatActivity {

    //private final String LOG_TAG = MainActivity.class.getSimpleName();

    // Titles of the individual pages (displayed in tabs)
    private final String[] PAGE_TITLES = new String[] {
            "1",
            "2",
            "3"
    };

    // The fragments that are used as the individual pages
    private final Fragment[] PAGES = new Fragment[] {
            new Peter_two_1(),
            new Peter_two_2(),
            new Peter_two_3()

    };

    // The ViewPager is responsible for sliding pages (fragments) in and out upon user input
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peter2_main);

        // Set the Toolbar as the activity's app bar (instead of the default ActionBar)
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        // Connect the ViewPager to our custom PagerAdapter. The PagerAdapter supplies the pages
        // (fragments) to the ViewPager, which the ViewPager needs to display.
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(new MyPagerAdapter(getFragmentManager()));

        // Connect the tabs with the ViewPager (the setupWithViewPager method does this for us in
        // both directions, i.e. when a new tab is selected, the ViewPager switches to this page,
        // and when the ViewPager switches to a new page, the corresponding tab is selected)
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(mViewPager);
    }


    /* PagerAdapter for supplying the ViewPager with the pages (fragments) to display. */
    public class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            return PAGES[position];
        }

        @Override
        public int getCount() {
            return PAGES.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return PAGE_TITLES[position];
        }

    }
}
