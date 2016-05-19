package com.mny.neeraja.email;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity
{
    EditText edittextEmailAddress;
    EditText edittextEmailSubject;
    EditText edittextEmailText;
    TextView textImagePath;
    Button buttonSelectImage;
    Button buttonSendEmail_intent;

    final int RQS_LOADIMAGE = 0;
    final int RQS_SENDEMAIL = 1;

    Uri imageUri = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittextEmailAddress = (EditText)findViewById(R.id.email_address);
        edittextEmailSubject = (EditText)findViewById(R.id.email_subject);
        edittextEmailText = (EditText)findViewById(R.id.email_text);
        textImagePath = (TextView)findViewById(R.id.imagepath);
        buttonSelectImage = (Button)findViewById(R.id.selectimage);
        buttonSendEmail_intent = (Button)findViewById(R.id.sendemail_intent);

        buttonSelectImage.setOnClickListener(buttonSelectImageOnClickListener);
        buttonSendEmail_intent.setOnClickListener(buttonSendEmail_intentOnClickListener);
    }

