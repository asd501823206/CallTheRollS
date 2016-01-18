package com.dream_art.dianming;

/**
 * Created by lenovo on 2016/1/18.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class LogInActivity extends Activity{
    private EditText userId;
    private EditText userPwd;
    private Button logInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        userId = (EditText)findViewById(R.id.userId);
        userPwd = (EditText)findViewById(R.id.userPwd);
        logInButton = (Button)findViewById(R.id.logInButton);

        logInButton.setOnClickListener(new LogInButtonListener());

    }

    public class LogInButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            String mUserId = userId.getText().toString();
            String mUserPwd = userPwd.getText().toString();

            Person p = new Person()
        }
    }

}