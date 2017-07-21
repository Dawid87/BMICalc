package com.example.dawiddelimata.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//import java.util.Scanner;

public class BMICalculator extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);
        myButtonListenerMethod();

    }

    public void myButtonListenerMethod() {
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final EditText heightinput = (EditText) findViewById(R.id.heightinput);
                String heightStr = heightinput.getText().toString();
                double height = Double.parseDouble(heightStr);

                final EditText weightinput = (EditText) findViewById(R.id.weightinput);
                String weightStr = weightinput.getText().toString();
                double weight = Double.parseDouble(weightStr);

                double BMI = (weight) / (height * height);

                final EditText BMIResult = (EditText) findViewById(R.id.BMIResult);
                BMIResult.setText(Double.toString(BMI));

                String BMI_Cat;
                if (BMI < 15.0)
                    BMI_Cat = "very severly underweight";
                else if (BMI < 16)
                    BMI_Cat = "severly underweight";
                else if (BMI < 18.5)
                    BMI_Cat = "underweight";
                else if (BMI < 25)
                    BMI_Cat = "normal weight";
                else if (BMI < 30)
                    BMI_Cat = "overweight";
                else if (BMI < 35)
                    BMI_Cat = "moderately obese";
                else if (BMI < 40)
                    BMI_Cat = "severly obesity";
                else
                    BMI_Cat = "very severly/\"morbidly\" obese";

                final TextView BMICategory = (TextView) findViewById(R.id.bmicategory);

                BMICategory.setText(BMI_Cat);
            }
        });
    }
}
        
    /*}

    
            System.out.print( "BMI category: " );

            if ( bmi < 15.0 ) {
        System.out.println( "very severly underweight, your BMI is: " + bmi );
    }
            else if ( bmi <= 16.0 ) {
        System.out.println( "severly underweight, your BMI is: " + bmi );
    }
            else if ( bmi < 18.5 ) {
        System.out.println( "underweight, your BMI is: " + bmi );
    }
            else if ( bmi < 25.0 ) {
        System.out.println( "normal weight, your BMI is: " + bmi );
    }
            else if ( bmi < 30.0 ) {
        System.out.println( "overweight, your BMI is: " + bmi  );
    }
            else if ( bmi < 35.0 ) {
        System.out.println( "moderately obese, your BMI is: " + bmi );
    }
            else if ( bmi < 40.0 ) {
        System.out.println( "severly obesity your BMI is: " + bmi );
    }
            else {
        System.out.println( "very severly/\"morbidly\" obese, your BMI is: " + bmi );
    }
    //}
}
*/