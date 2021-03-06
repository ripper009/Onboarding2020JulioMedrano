package com.example.onboarding2020juliomedrano.Onboarding;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.onboarding2020juliomedrano.App.App;
import com.example.onboarding2020juliomedrano.App.CalculadoraCientifica;
import com.example.onboarding2020juliomedrano.CalculadoraBasica;
import com.example.onboarding2020juliomedrano.R;

import java.util.zip.Inflater;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment implements  View.OnClickListener{

    private TextView textPrev;
    private ViewPager viewPager;
    private View view;
    private Button btLogin, btRegister;
    private EditText etUsername,etPassword;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        _initializeInflater(inflater, container);

        _initializeVariables();

        return  view;

    }

    private void  _initializeInflater(LayoutInflater inflater, ViewGroup container){
        view = inflater.inflate(R.layout.fragment_login, container, false);
    }

    private void _initializeVariables(){
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textPrev = view.findViewById(R.id.textPrevLogin);
        textPrev.setOnClickListener(this);
        btLogin = view.findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);
        btRegister = view.findViewById(R.id.btRegis);
        btRegister.setOnClickListener(this);
        etUsername=view.findViewById(R.id.et1);
        etPassword=view.findViewById(R.id.et2);
    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textPrevLogin:
                viewPager.setCurrentItem(2);
                break;
            case R.id.btLogin:
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                if(username.equals("") || password.equals("")){
                    Toast.makeText(getActivity(),"Please add username/password", Toast.LENGTH_SHORT).show();

                }else {
                    Intent intent  = new Intent(getActivity(), CalculadoraCientifica.class);
                    intent.putExtra("USERNAME",username);
                    intent.putExtra("PASSWORD",password);
                    startActivity(intent);
                    getActivity().finish();
                }

                break;
            case R.id.btRegis:
                break;
        }

    }
}
