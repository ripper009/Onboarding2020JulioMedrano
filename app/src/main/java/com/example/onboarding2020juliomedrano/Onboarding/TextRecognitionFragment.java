package com.example.onboarding2020juliomedrano.Onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.onboarding2020juliomedrano.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TextRecognitionFragment extends Fragment {
    private TextView textDoneIns, textPrevIns, textEntrada;
    private ViewPager viewPager;
    private View view;

    public TextRecognitionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        _initializeInflater(inflater, container);


        _inicialize();

        //add click event to text Next and prev text
        _addClickDoneAndPrev();

        //return
        return view;

    }

    public void _initializeInflater(LayoutInflater inflater, ViewGroup container){
            view = inflater.inflate(R.layout.fragment_text_recognition, container, false);
    }

    public void _inicialize(){
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textDoneIns = view.findViewById(R.id.textNextIns);
        textPrevIns =  view.findViewById(R.id.textPrevIns);
        textEntrada = view.findViewById(R.id.textEntrada);
    }

    public void _addClickDoneAndPrev(){
        textDoneIns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Finalizado el recorrido de la APP. Done!!!", Toast.LENGTH_LONG).show();
            }
        });

        textPrevIns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });

        textEntrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });
    }
}
