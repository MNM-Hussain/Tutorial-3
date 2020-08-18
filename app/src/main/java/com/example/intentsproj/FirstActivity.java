package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {


    private static final String EXTRA_MESSAGE ="com.example.intentsproj" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
    }

    public void next (View v){

        Intent i=new Intent(this, SecondActivity.class);
        startActivity(i);

 int duration =Toast.LENGTH_SHORT;
 Toast toast=Toast.makeText(this," OK button is just clicked",duration);
 toast.show();
 toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);


        EditText editText=(EditText) findViewById(R.id.editTextNumber);
        String message= editText.getText().toString();
        i.putExtra(EXTRA_MESSAGE,message);



        EditText editText2=(EditText) findViewById(R.id.editTextNumber2);
        String message2= editText.getText().toString();
        i.putExtra(EXTRA_MESSAGE,message2);








    }


}