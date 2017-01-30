package com.android.dmaharjan.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SelectContactActivity extends BaseActivity {
    public static final String BUNDLE_EXTRA_TITLE = "BUNDLE_EXTRA_TITLE";
    public static final String RESULT_CONTACT_NAME = "RESULT_CONTACT_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_contact);
        TextView tvTitle = (TextView) findViewById(R.id.activity_title);
        String title = getIntent().getStringExtra(BUNDLE_EXTRA_TITLE);
        tvTitle.setText(title);
        findViewById(R.id.contactOne).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectContact("Contact 1");
            }
        });
        findViewById(R.id.contactTwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectContact("Contact 2");
            }
        });
        findViewById(R.id.contactThree).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectContact("Contact 3");
            }
        });
    }

    private void selectContact(String contactName) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(RESULT_CONTACT_NAME, contactName);
        setResult(RESULT_OK, intent);
        finish();
    }
}
