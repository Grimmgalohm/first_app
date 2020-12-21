package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendData (View view) {
        TextView fName = findViewById(R.id.fName);
        TextView lName = findViewById(R.id.lName);
        TextView eMail = findViewById(R.id.eMail);

        EditText edtxtfName = findViewById(R.id.setFirstName);
        EditText edtxtlName = findViewById(R.id.setLastName);
        EditText edtxtEmail = findViewById(R.id.setEmail);

        fName.setText(edtxtfName.getText().toString());
        lName.setText(edtxtlName.getText().toString());
        eMail.setText(edtxtEmail.getText().toString());

    }
}