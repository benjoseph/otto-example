package com.josephben.android.ottoexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.squareup.otto.Bus;


public class TopFragment extends Fragment {


    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_top, container, false);

        final EditText messageEditText=(EditText)view.findViewById(R.id.message_edit_text);
        Button sendButton=(Button)view.findViewById(R.id.send_button);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postStringToBus(messageEditText.getText().toString());
            }
        });
        return view;
    }

    private void postStringToBus(String text){
        Bus bus=OttoExample.getBus();
        bus.post(text);
    }

}
