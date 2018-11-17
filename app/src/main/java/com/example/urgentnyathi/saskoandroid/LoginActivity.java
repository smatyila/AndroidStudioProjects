package com.example.urgentnyathi.saskoandroid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Spinner Scities,Sprovinces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        AppCompatCheckBox checkBox = (AppCompatCheckBox)findViewById(R.id.scheckbox);
        final Button reg = (Button)findViewById(R.id.bReg);
        final Button cen = (Button)findViewById(R.id.Cancel);

         final EditText con = (EditText)findViewById(R.id.conPassword);
        final EditText pas = (EditText)findViewById(R.id.Password);

        cen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,LoginForm.class);
                startActivity(intent);
            }
        });

         checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                 if(!checked)
                 {
                     con.setTransformationMethod(PasswordTransformationMethod.getInstance());
                     pas.setTransformationMethod(PasswordTransformationMethod.getInstance());
                 }
                 else
                 {
                     con.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                     pas.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                 }
             }
         });

        final Spinner Scities,Sprovinces;
        Scities = (Spinner) findViewById(R.id.city);
        Sprovinces = (Spinner) findViewById(R.id.province);

        Scities.setEnabled(false);

        Sprovinces.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                if (pos!=0)
                {
                    Scities.setEnabled(true);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Successful registered";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

    }

    public void isOnItem(int poss)
    {
        switch (poss)
        {
            case 0:

                break;
            case 1:
                Scities.setEnabled(true);
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Eastern_Cape,android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Scities.setAdapter(adapter);
                break;
            case 2:
                Scities.setEnabled(true);
                ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.free_state,android.R.layout.simple_spinner_item);
                adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Scities.setAdapter(adapter1);
                break;
            case 3:
                Scities.setEnabled(true);
                ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.Guateng,android.R.layout.simple_spinner_item);
                adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Scities.setAdapter(adapter2);
                break;
            case 4:
                Scities.setEnabled(true);
                ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.KwaZulu_Natal,android.R.layout.simple_spinner_item);
                adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Scities.setAdapter(adapter3);
                break;
            case 5:
                Scities.setEnabled(true);
                ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.Limpopo,android.R.layout.simple_spinner_item);
                adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Scities.setAdapter(adapter4);
                break;
            case 6:
                Scities.setEnabled(true);
                ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,R.array.Mpumalanga,android.R.layout.simple_spinner_item);
                adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Scities.setAdapter(adapter5);
                break;
            case 7:
                Scities.setEnabled(true);
                ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,R.array.North_West,android.R.layout.simple_spinner_item);
                adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Scities.setAdapter(adapter6);
                break;
            case 8:
                Scities.setEnabled(true);
                ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this,R.array.Northern_Cape,android.R.layout.simple_spinner_item);
                adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Scities.setAdapter(adapter7);
                break;
            case 9:
                Scities.setEnabled(true);
                ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this,R.array.Western_Cape,android.R.layout.simple_spinner_item);
                adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Scities.setAdapter(adapter8);
                break;
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }


}
