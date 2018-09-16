package com.example.juan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //"Change Text Color" button changes the color of the text on the screen.
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.white));
            }
        });

        //"Change Background Color" button changes the color of the background.
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.seriousBlue));
            }
        });

        //Edits the strng of text show on the screen.
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Grab text inputted by user.
                String newText = ((TextView)findViewById(R.id.editText)).getText().toString();

                if(TextUtils.isEmpty(newText)){
                    //Default text.
                    ((TextView)findViewById(R.id.textView)).setText("Hello from Juan");

                }else{
                    //Put grabbed text and have the button change the text already on the screen to the new text.
                    ((TextView)findViewById(R.id.textView)).setText(newText);
                }

            }
        });

        //Reverts all changes back to their default.
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Reset text color back to the original.
                ((TextView)findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.black));

                //Reset the background back to the original.
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                //Reset the string back to the original.
                ((TextView)findViewById(R.id.textView)).setText("Hello from Juan");
            }
        });

    }
}
