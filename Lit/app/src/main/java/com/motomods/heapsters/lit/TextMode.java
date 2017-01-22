package com.motomods.heapsters.lit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TextMode extends AppCompatActivity {

    //Declare all private elements here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_mode);

        initializeComponents();

        setupListeners();
    }


    private void initializeComponents()
    {
        // Find all ui components here and assign to their private var
    }

    private void setupListeners()
    {
        //Attach all ui listeners here
    }

    //Add utility methods here
}
