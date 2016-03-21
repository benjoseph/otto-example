package com.josephben.android.ottoexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment{

    private TextView mMessageTextView;
    private Bus bus=OttoExample.getBus();

    public BottomFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_bottom, container, false);
        mMessageTextView=(TextView)view.findViewById(R.id.display_msg_text_view);
        bus.register(this);

        return view;
    }

    @Subscribe
    public void getMessage(String s) {
        displayMessage(s);
    }

    private void displayMessage(String s){
        mMessageTextView.setText(s);
    }
}
