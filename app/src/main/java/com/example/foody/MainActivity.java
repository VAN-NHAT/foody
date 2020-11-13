package com.example.foody;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager mViewPager;

    ViewPager viewPager;
    TextView thong_bao,logout;
    ImageButton btnsystem;
    Button btnsave,btnhome,btnlist,btnnotification,btnperson;
    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;
    ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tatca);
        initView();


        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        viewPager = (ViewPager)findViewById(R.id.viewpager1);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        //Listview
        lv = (ListView) findViewById(R.id.list_f);
        arr_bean = new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.ic_baseline_android_24, "[DN] CHỈ 1K vẫn phá cỗ xịn", "Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable", "1h"));
        arr_bean.add(new ListViewBean(R.drawable.ic_baseline_android_24, "[DN] Gợi ý món CHAY", "Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable", "30p"));
        arr_bean.add(new ListViewBean(R.drawable.ic_baseline_android_24, "[DN] MÓN NGON siêu RẺ", "Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable", "2h"));
        arr_bean.add(new ListViewBean(R.drawable.ic_baseline_android_24, "[DN] Highland Coffee tặng bạn ", "Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable", "3h"));
        arr_bean.add(new ListViewBean(R.drawable.ic_baseline_android_24, "[DN] CHỈ 1K vẫn phá cỗ xịn", "Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable", "2h"));
        arr_bean.add(new ListViewBean(R.drawable.ic_baseline_android_24, "[DN] Gợi ý món CHAY", "Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable", "2h"));
        arr_bean.add(new ListViewBean(R.drawable.ic_baseline_android_24, "[DN] MÓN NGON siêu RẺ", "Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable", "10p"));
        arr_bean.add(new ListViewBean(R.drawable.ic_baseline_android_24, "[DN] Highland Coffee tặng bạn", "Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable", "9h"));
        arr_bean.add(new ListViewBean(R.drawable.ic_baseline_android_24, "[DN] CHỈ 1K vẫn phá cỗ xịn", "Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable", "9h"));
        arr_bean.add(new ListViewBean(R.drawable.ic_baseline_android_24, "[DN] Gợi ý món CHAY", "Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable", "9h"));
        arr_bean.add(new ListViewBean(R.drawable.ic_baseline_android_24, "[DN] MÓN NGON siêu RẺ", "Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable", "9h"));
        arr_bean.add(new ListViewBean(R.drawable.ic_baseline_android_24, "[DN] Highland Coffee tặng bạn", "Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable", "9h"));

        adapter = new ListViewBaseAdapter(arr_bean, this);
        lv.setAdapter(adapter);

    }

    private void initView() {
    }


}