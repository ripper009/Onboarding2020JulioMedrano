package com.example.onboarding2020juliomedrano;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.mylibrary.MyView;
import com.example.onboarding2020juliomedrano.Adaprters.OnboardingAdapter;

public class MainActivity extends AppCompatActivity {
    MyView view;
    private ViewPager viewPagerContainer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inicializando componentes
        _inicializeComponents();
        //Inicicializando adaptador
        _initializeFragmentAdapter();

    }

    public void _inicializeComponents(){
        viewPagerContainer = findViewById(R.id.viewPagerContainer);
    }

    public void _initializeFragmentAdapter(){
        OnboardingAdapter adapter = new OnboardingAdapter(getSupportFragmentManager());
        viewPagerContainer.setAdapter(adapter);
    }
}