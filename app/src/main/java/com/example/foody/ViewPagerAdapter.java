package com.example.foody;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter{
    private String listTab[] = {"Tất cả", "Địa điểm", "Ảnh", "Bài viết"};
    private tatca Ftatca;
    private diadiem Fdiadiem;
    private anh Fanh;
    private baiviet Fbaiviets;

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        Ftatca = new tatca();
        Fdiadiem = new diadiem();
        Fanh = new anh();
        Fbaiviets = new baiviet();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0)
        {
            return Ftatca;
        } else if(position ==1){
            return Fdiadiem;
        }else  if (position ==2){
            return Fanh;
        }else if(position == 3){
            return Fbaiviets;
        }
        return null;
    }


    @Override
    public int getCount() {
        return listTab.length;

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTab[position];
    }
}

