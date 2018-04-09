package com.ignacio.portfolio.Controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ignacio.portfolio.Ui.AboutFragment;
import com.ignacio.portfolio.Ui.ContactFragment;
import com.ignacio.portfolio.Ui.SkillFragment;
import com.ignacio.portfolio.Ui.WorkFragment;

/**
 * Created by Ignacio on 08/02/2018.
 */

public class DevPagerAdapter extends FragmentPagerAdapter {

    public DevPagerAdapter (FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new AboutFragment();
            case 1:
                return new ContactFragment();
            case 2:
                return new SkillFragment();
            case 3:
                return new WorkFragment();
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "ABOUT";
            case 1:
                return "CONTACT";
            case 2:
                return "SKILLS";
            case 3:
                return "WORK";
            case 4:
                break;
        }
        return super.getPageTitle(position);
    }
}
