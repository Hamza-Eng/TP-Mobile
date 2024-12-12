package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity  {

    private Button button;
    private EditText messageToSent;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textview_in_main);
        if (getIntent().getStringExtra("Text")!=null)
        {
            String message = getIntent().getStringExtra("Text").toString();
            textView.setText(message);
            System.out.println(message );
        }


//        /////////////////////////////////////////////////
        button=findViewById(R.id.send);
        messageToSent=findViewById(R.id.messageToSent);
        //String text=messageToSent.getText().toString();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textTobeSent=messageToSent.getText().toString();
     System.out.println("Hello from hamza ");

                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("Text",textTobeSent);
                startActivity(intent);


            }
        });
    }

}