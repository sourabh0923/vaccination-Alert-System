package com.example.sourabh.dummy;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends ActionBarActivity {
        protected void onCreate(Bundle savedInstanceState)

        {
                 EditText fname, mname, con, address1, address2, cityvillage, stateprovince, email, country, postalcode, pan, alt_email, birthdate, pass;

                Button submit, cancel, reset;


                fname = (EditText) findViewById(R.id.f_name);
                mname = (EditText) findViewById(R.id.m_name);
                con = (EditText) findViewById(R.id.contact);
                address1 = (EditText) findViewById(R.id.address1);
                address2 = (EditText) findViewById(R.id.address2);
                cityvillage = (EditText) findViewById(R.id.cityvillage);
                stateprovince = (EditText) findViewById(R.id.stateprovince);
                email = (EditText) findViewById(R.id.e_email);
                country = (EditText) findViewById(R.id.country);
                postalcode = (EditText) findViewById(R.id.epostalcode);
                pan = (EditText) findViewById(R.id.epan);
                alt_email = (EditText) findViewById(R.id.e_altmail);
                birthdate = (EditText) findViewById(R.id.birthdate);
                pass = (EditText) findViewById(R.id.epass);

                submit = (Button) findViewById(R.id.submit);
                submit.setOnClickListener(this);
                reset = (Button) findViewById(R.id.reset);
                reset.setOnClickListener(this);
                cancel = (Button) findViewById(R.id.cancel);
                cancel.setOnClickListener(this);
        }

        public void onClick(View v)
        {

                switch(v.getId()){

                        case R.id.cancel:
                                Intent i = new Intent(getBaseContext(), LoginActivity.class);
                                startActivity(i);
                                //finish();
                                break;

                        case R.id.submit:


                                String fname =  fname.getText().toString();
                                String mname  = mname.toString();
                                String contact= contact.toString();
                                String address1=address1.toString();
                                String address2 =address2.toString();
                                String cityvillage =cityvillage.toString();
                                String stateprovince =stateprovince.toString();
                                String email = email.toString();
                                String country = country.toString();
                                String postalcode = postalcode.toString();
                                String pan = mname.toString();
                                String altemail = altemail.toString();
                                String birthdate = birthdate.toString();
                                String pass = pass.toString();



                                boolean invalid = false;

                                if(fname.equals(""))
                                {
                                        invalid = true;
                                        Toast.makeText(getApplicationContext(), "Enter your Firstname", Toast.LENGTH_SHORT).show();
                                }
                                else

                                if(lname.equals(""))
                                {
                                        invalid = true;
                                        Toast.makeText(getApplicationContext(), "Please enter your Lastname", Toast.LENGTH_SHORT).show();
                                }
                                else

                                if(uname.equals(""))
                                {
                                        invalid = true;
                                        Toast.makeText(getApplicationContext(), "Please enter your Username", Toast.LENGTH_SHORT).show();
                                }
                                else


                                if(pass.equals(""))
                                {
                                        invalid = true;
                                        Toast.makeText(getApplicationContext(), "Please enter your Password", Toast.LENGTH_SHORT).show();

                                }
                                else
                                if(email.equals(""))
                                {
                                        invalid = true;
                                        Toast.makeText(getApplicationContext(), "Please enter your Email ID", Toast.LENGTH_SHORT).show();
                                }
                                else
                                if(invalid == false)
                                {
                                        addEntry(fname, lname, Gen, uname, pass, email);
                                        Intent i_register = new Intent(Registration.this, LoginActivity.class);
                                        startActivity(i_register);
                                        //finish();
                                }

}
