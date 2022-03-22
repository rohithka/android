package com.example.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText t1,t2;
    String user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.txt1);
        t2=findViewById(R.id.txt2);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                user=t1.getText().toString();
                pass=t2.getText().toString();
                if(user.equals("admin") && (pass.equals("admin")))
                {
                    Toast.makeText(getApplicationContext(),"login ok", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(getApplicationContext(), "login not OK", Toast.LENGTH_LONG).show();
                }

            }

            //protected void OnClick(View v){

            //}
        });
        {
        }
    }
}


