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
public class FaceDetectionFragment extends Fragment {

    private TextView textNextAwards, textPrevAwards;
    private ViewPager viewPager;
    private View view;

    public FaceDetectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        _initializeInflater(inflater, container);

        _initialize();

        _addClickNextAndPrev();

        return view;
    }

    public void _initializeInflater(LayoutInflater inflater, ViewGroup container){
        view = inflater.inflate(R.layout.fragment_face_detection, container, false);
    }

    public void _initialize(){
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textNextAwards = view.findViewById(R.id.textNextTextRecognition);
        textPrevAwards = view.findViewById(R.id.textPrevTextRecognition);

    }

    public void _addClickNextAndPrev(){
        textNextAwards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        viewPager.setCurrentItem(2);
            }
        });

        textPrevAwards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });
    }


}
