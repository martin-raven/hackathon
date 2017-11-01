package com.trackin.iodroid.trackin;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;
import java.util.Locale;

public class AddressActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private String latt,longi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
    }
    public void Retrieve(View view) {
        editText1 = (EditText) findViewById(R.id.editText2);
        latt = editText1.getText().toString();
        editText2 = (EditText) findViewById(R.id.editText);
        longi = editText2.getText().toString();
        if (latt.isEmpty() || longi.isEmpty()) {
            Toast.makeText(AddressActivity.this, "Invalid Data given!", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent1 = new Intent(AddressActivity.this, cordmap.class);
        Bundle bundle=new Bundle();
        bundle.putDouble("lattitude",Double.parseDouble(latt));
        bundle.putDouble("longitude",Double.parseDouble(longi));
        intent1.putExtras(bundle);
        startActivity(intent1);
    }
}

