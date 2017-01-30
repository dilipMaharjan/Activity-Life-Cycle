package com.android.dmaharjan.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private static int REQUEST_CODE = 1;
    private Button btnCounter;
    private TextView tvCounter;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCounter = (Button) findViewById(R.id.btnCounter);
        tvCounter = (TextView) findViewById(R.id.tvCounter);
        editText = (EditText) findViewById(R.id.editText);
        btnCounter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btnCounter) {
            Intent intent = new Intent(this, SelectContactActivity.class);
            intent.putExtra(SelectContactActivity.BUNDLE_EXTRA_TITLE, editText.getText().toString());
            startActivityForResult(intent, REQUEST_CODE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                tvCounter.setText("You Selected : " + data.getStringExtra(SelectContactActivity.RESULT_CONTACT_NAME));
            } else {
                tvCounter.setText("Error");
            }
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
