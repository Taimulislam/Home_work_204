package com.tc.osman;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textViewResult;
    EditText editTextPurchasePrice, editTextProfitPercentage;
    Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.textViewResult);
        editTextPurchasePrice = findViewById(R.id.editTextPurchasePrice);
        editTextProfitPercentage = findViewById(R.id.editTextProfitPercentage);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        //....................................................................//

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextPurchasePrice.getText().toString().length() > 0 && editTextProfitPercentage.getText().toString().length() >0) {
                    double purchasePrice = Double.parseDouble(editTextPurchasePrice.getText().toString());
                    double profitPercentage = Double.parseDouble(editTextProfitPercentage.getText().toString());
                    double profit = purchasePrice * (profitPercentage / 100);
                    double totalProfit = purchasePrice + profit;
                    textViewResult.setText(totalProfit + " দামে বিক্রি করতে হবে");
                }else {
                    textViewResult.setText("কোনো তথ্য দিন");
                }

            }
        });

    }
}