package com.android.dmaharjan.activitylifecycle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends BaseActivity {
    private int counter = 0;
    private static final String BUNDLE_COUNTER = "BUNDLE COUNTER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt(BUNDLE_COUNTER);
        }
        Button btnCounter = (Button) findViewById(R.id.btnCounter);
        final TextView tvCounter = (TextView) findViewById(R.id.tvCounter);
        btnCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                tvCounter.setText(Integer.toString(counter));
            }
        });
        tvCounter.setText(Integer.toString(counter));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(BUNDLE_COUNTER, counter);
    }
}
