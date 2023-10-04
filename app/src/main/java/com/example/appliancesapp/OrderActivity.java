/*package com.example.shoponline;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Button button2 = findViewById(R.id.btn5);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if some condition is met (e.g., email and password are not empty)
                if (isConditionMet()) {
                    // Display a toast message
                    Toast.makeText(OrderActivity.this, "Condition is met", Toast.LENGTH_SHORT).show();

                    // Create an Intent to open the second activity
                    Intent intent = new Intent(  OrderActivity.this, AppliancesActivity.class);
                    startActivity(intent);
                } else {
                    // Condition is not met, display a different toast message
                    Toast.makeText(OrderActivity.this, "Condition is not met", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Replace this method with your actual condition check
    private boolean isConditionMet() {
        // You can add your condition check logic here
        // For example, checking if email and password are not empty
        return true; // Return true if the condition is met, otherwise return false
    }
}




public class OrderActivity extends AppCompatActivity {

    private int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view) {
        quantity++;
        displayQuantity(quantity);
    }

    public void decrement(View view) {
        if (quantity == 0) {
            return;
        }
        quantity--;
        displayQuantity(quantity);
    }

    public void submitOrder(View view) {
        EditText nameField = findViewById(R.id.name_field);
        String value = nameField.getText().toString();

        CheckBox whippedCreamCheckBox = findViewById(R.id.whipped_cream_checkbox);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();

        CheckBox chocolateCheckBox = findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = chocolateCheckBox.isChecked();

        int price = calculatePrice(hasWhippedCream, hasChocolate);
        String priceMessage = createOrderSummary(value, price, hasWhippedCream, hasChocolate);
        displayMessage(priceMessage);
    }

    private int calculatePrice(boolean addWhippedCream, boolean addChocolate) {
        int basePrice = 500;
        if (addWhippedCream) {
            basePrice = basePrice + 1;
        }
        if (addChocolate) {
            basePrice = basePrice + 2;
        }
        return quantity * basePrice;
    }

    private void displayQuantity(int numberOfCoffee) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText(String.valueOf(numberOfCoffee));
    }

    private String createOrderSummary(String name, int price, boolean addWhippedCream, boolean addChocolate) {
        String priceMessage = "Name: " + name;
        priceMessage += "\nAdd LG RErefrigerator? " + addWhippedCream;
        priceMessage += "\nAdd Samsung Refrigerator? " + addChocolate;
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nTotal: $" + price;
        priceMessage += "\nThank you!";
        return priceMessage;
    }

    private void displayMessage(String message) {
        TextView orderSummaryTextView = findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}*/

/*package com.example.appliancesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    private int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void increment(View view) {
        quantity++;
        displayQuantity(quantity);
    }

    public void decrement(View view) {
        if (quantity == 0) {
            return;
        }
        quantity--;
        displayQuantity(quantity);
    }

    public void submitOrder(View view) {
        EditText nameField = findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        CheckBox lgCheckBox = findViewById(R.id.lgrefrigerator_checkbox);
        boolean addLGRefrigerator = lgCheckBox.isChecked();

        CheckBox samsungCheckBox = findViewById(R.id.samsung_checkbox);
        boolean addSamsungRefrigerator = samsungCheckBox.isChecked();

        int price = calculatePrice(addLGRefrigerator, addSamsungRefrigerator);
        String orderSummary = createOrderSummary(name, price, addLGRefrigerator, addSamsungRefrigerator);
        displayOrderSummary(orderSummary);

    }

    private int calculatePrice(boolean addLGRefrigerator, boolean addSamsungRefrigerator) {
        int basePrice = 500;
        if (addLGRefrigerator) {
            basePrice += 100; // Example price for adding LG Refrigerator
        }
        if (addSamsungRefrigerator) {
            basePrice += 150; // Example price for adding Samsung Refrigerator
        }
        return quantity * basePrice;
    }

    private void displayQuantity(int numberOfAppliances) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("Quantity: " + numberOfAppliances);
    }

    private String createOrderSummary(String name, int price, boolean addLGRefrigerator, boolean addSamsungRefrigerator) {
        String summary = "Name: " + name;
        summary += "\nAdd LG Refrigerator? " + addLGRefrigerator;
        summary += "\nAdd Samsung Refrigerator? " + addSamsungRefrigerator;
        summary += "\nQuantity: " + quantity;
        summary += "\nTotal: $" + price;
        summary += "\nThank you!";
        return summary;
    }

    private void displayOrderSummary(String message) {
        TextView orderSummaryTextView = findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }


    // Replace this method with your actual condition check
    private boolean isConditionMet() {
        // You can add your condition check logic here
        // For example, checking if email and password are not empty
        return true; // Return true if the condition is met, otherwise return false
    }

}*/



package com.example.appliancesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    private int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        // Find the button view by its ID
        Button startButton = findViewById(R.id.btn10);

        // Set an OnClickListener on the button
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the target activity
                Intent intent = new Intent(OrderActivity.this, ThankYouActivity.class);
                startActivity(intent);
            }
        });

        // Rest of your onCreate code...
    }

    // Rest of your activity code...

    // Replace this method with your actual condition check
    private boolean isConditionMet() {
        // You can add your condition check logic here
        // For example, checking if email and password are not empty
        return true; // Return true if the condition is met, otherwise return false
    }

    public void increment(View view) {
        quantity++;
        displayQuantity(quantity);
    }

    public void decrement(View view) {
        if (quantity == 0) {
            return;
        }
        quantity--;
        displayQuantity(quantity);
    }

    public void submitOrder(View view) {
        EditText nameField = findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        CheckBox lgCheckBox = findViewById(R.id.lgrefrigerator_checkbox);
        boolean addLGRefrigerator = lgCheckBox.isChecked();

        CheckBox samsungCheckBox = findViewById(R.id.samsung_checkbox);
        boolean addSamsungRefrigerator = samsungCheckBox.isChecked();

        int price = calculatePrice(addLGRefrigerator, addSamsungRefrigerator);
        String orderSummary = createOrderSummary(name, price, addLGRefrigerator, addSamsungRefrigerator);
        displayOrderSummary(orderSummary);
    }

    private int calculatePrice(boolean addLGRefrigerator, boolean addSamsungRefrigerator) {
        int basePrice = 500;
        if (addLGRefrigerator) {
            basePrice += 100; // Example price for adding LG Refrigerator
        }
        if (addSamsungRefrigerator) {
            basePrice += 150; // Example price for adding Samsung Refrigerator
        }
        return quantity * basePrice;
    }

    private void displayQuantity(int numberOfAppliances) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("Quantity: " + numberOfAppliances);
    }

    private String createOrderSummary(String name, int price, boolean addLGRefrigerator, boolean addSamsungRefrigerator) {
        String summary = "Name: " + name;
        summary += "\nAdd LG Refrigerator? " + addLGRefrigerator;
        summary += "\nAdd Samsung Refrigerator? " + addSamsungRefrigerator;
        summary += "\nQuantity: " + quantity;
        summary += "\nTotal: $" + price;
        summary += "\nThank you!";
        return summary;
    }

    private void displayOrderSummary(String message) {
        TextView orderSummaryTextView = findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}

