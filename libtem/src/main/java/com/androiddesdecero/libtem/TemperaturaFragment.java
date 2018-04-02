package com.androiddesdecero.libtem;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class TemperaturaFragment extends Fragment {

    private Button mCalcular;
    private EditText mTemperatura;

    public TemperaturaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_temperatura, container, false);
        mCalcular = view.findViewById(R.id.resultado);
        mTemperatura = view.findViewById(R.id.temperatura);
        mCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double temperatura = Double.parseDouble(mTemperatura.getText().toString());
                mTemperatura.setText(Double.toString((temperatura*9/5)+32));
            }
        });
        return view;
    }
}
