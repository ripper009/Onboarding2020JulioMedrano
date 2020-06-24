package com.example.onboarding2020juliomedrano.Onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.onboarding2020juliomedrano.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {
    private TextView textNext;
    private ViewPager viewPager;
    private View view;

    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        _initializeInflater(inflater, container);

        _initialize();

        _addClickTextNext();

        return view;
    }


    public void _initializeInflater(LayoutInflater inflater, ViewGroup container){
        view = inflater.inflate(R.layout.fragment_welcome,container, false);
    }

    public void _initialize(){
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textNext = view.findViewById(R.id.textNextWelcome);
    }

    public void _addClickTextNext(){
        textNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                viewPager.setCurrentItem(1);
            }
        });
    }
}
