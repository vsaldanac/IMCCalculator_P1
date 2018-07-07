package cl.vero.imccalculator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return ResultFragment.newInstance();
            case 1:
                return InformationFragment.newInstance();
            default:
                return ResultFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
