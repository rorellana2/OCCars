package edu.orangecoastcollege.cs273.rorellana2.occars;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoanSummaryActivity extends AppCompatActivity {

    private TextView monthlyPaymentTextView;
    private TextView loanReportTextView;
    private Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_summary);

        // Associating
        monthlyPaymentTextView = (TextView) findViewById(R.id.monthlyPaymentTextView);
        loanReportTextView = (TextView) findViewById(R.id.loanReportTextView);
        returnButton = (Button) findViewById(R.id.returnButton);


        Intent intentFromPurchaseActivity = getIntent();
        String monthlyPaymentText = intentFromPurchaseActivity.getStringExtra("MonthlyPayment");
        monthlyPaymentTextView.setText(monthlyPaymentText);
    }

    public void returnToDataEntry(View view)
    {
        this.finish();
    }
}
