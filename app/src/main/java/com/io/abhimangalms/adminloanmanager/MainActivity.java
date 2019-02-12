package com.io.abhimangalms.adminloanmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mButtonLoanRequest, mButtonApprovedLoans, mButtonAccountHolders, mButtonLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonLoanRequest = findViewById(R.id.buttonLoanRequest);
        mButtonApprovedLoans = findViewById(R.id.buttonApprovedLoans);
        mButtonAccountHolders = findViewById(R.id.buttonAccountHolders);
        mButtonLogout = findViewById(R.id.buttonLogout);


        mButtonLoanRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), LoanRequests.class);
                startActivity(intent);
            }
        });

        mButtonApprovedLoans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), ApprovedLoans.class);
                startActivity(intent);
            }
        });

        mButtonAccountHolders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), AccountHolders.class);
                startActivity(intent);
            }
        });

        mButtonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
