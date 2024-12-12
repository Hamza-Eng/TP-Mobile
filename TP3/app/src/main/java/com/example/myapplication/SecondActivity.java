package com.example.myapplication;

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

public class SecondActivity extends AppCompatActivity {
     private Button button;
   private EditText messageToSent;

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        textView=findViewById(R.id.textview);

        String message = getIntent().getStringExtra("Text").toString();
        System.out.println(message );

        textView.setText(message);

//        ========send to main
        button=findViewById(R.id.sendToMain);
        messageToSent=findViewById(R.id.MessageToMain);
        //String text=messageToSent.getText().toString();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textTobeSent=messageToSent.getText().toString();
                System.out.println(textTobeSent);

                Intent intent=new Intent(SecondActivity.this , MainActivity.class);
                intent.putExtra("Text",textTobeSent);
                startActivity(intent);


            }
        });

    }
}