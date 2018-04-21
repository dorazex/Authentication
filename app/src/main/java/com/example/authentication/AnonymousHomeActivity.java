package com.example.authentication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AnonymousHomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anonymous_home);
        ((TextView) findViewById(R.id.AnonymousHomeEditText)).setText(R.string.anonymous_user_home_text);
    }
}
