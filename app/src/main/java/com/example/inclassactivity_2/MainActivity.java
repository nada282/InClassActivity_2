package com.example.inclassactivity_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Salary;
    private Spinner spinner;
    private Button button;
    private ListView listview;
    private TextView textView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();
    }

    private void setup() {
        Name = findViewById(R.id.Name);
        Salary = findViewById(R.id.Salary);
        spinner=findViewById(R.id.spinner);
       ArrayList<String>  job = new ArrayList<>();
       job .add("Full Text");
       job.add("Part time");
    //   spinner.add(job);
        button= findViewById(R.id.button);
        listview=findViewById(R.id.listview);
        textView3=findViewById(R.id.textView3);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Name.getText().toString();
                Editable salary =Salary.getText();
                String sp = spinner.getTransitionName().toString();
                String [] data = {name, String.valueOf(salary),sp};
                textView3.setText(name);
                textView3.setText(salary);
                textView3.setText(sp);

            }
        });
    }
}