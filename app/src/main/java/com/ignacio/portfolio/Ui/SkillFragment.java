package com.ignacio.portfolio.Ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ignacio.portfolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SkillFragment extends Fragment {


    public SkillFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View skillView = inflater.inflate(R.layout.fragment_skill, container, false);
        return skillView;
    }

}
