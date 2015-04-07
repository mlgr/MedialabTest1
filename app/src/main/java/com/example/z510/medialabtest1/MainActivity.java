package com.example.z510.medialabtest1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Person p;
    private Button btnCreatePerson;
    private Button btnGetName;
    private Button btnGetAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreatePerson = (Button)findViewById(R.id.btn_create_person);
        btnCreatePerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p = new Person();
                // Hello
            }
        });

        btnGetAge = (Button)findViewById(R.id.btn_get_age);
        btnGetAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),String.valueOf(p.getAge()),Toast.LENGTH_SHORT).show();
            }
        });

        btnGetName = (Button)findViewById(R.id.btn_get_name);
        btnGetName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),String.valueOf(p.getName()),Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
