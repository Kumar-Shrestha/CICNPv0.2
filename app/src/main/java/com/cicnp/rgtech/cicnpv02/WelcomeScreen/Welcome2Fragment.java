package com.cicnp.rgtech.cicnpv02.WelcomeScreen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cicnp.rgtech.cicnpv02.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Welcome2Fragment extends Fragment {


    public Welcome2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome2, container, false);
    }

}
