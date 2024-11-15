package com.myapp.newapp;

import static com.myapp.newapp.R.id.clear;
import static com.myapp.newapp.R.id.decimal;
import static com.myapp.newapp.R.id.inputTextView;
import static com.myapp.newapp.R.id.resultTextView;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double x, y, equals;
    String option = null, calcPanel = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button button1 = findViewById(R.id.button1),
                button2 = findViewById(R.id.button2),
                button3 = findViewById(R.id.button3),
                button4 = findViewById(R.id.button4),
                button5 = findViewById(R.id.button5),
                button6 = findViewById(R.id.button6),
                button7 = findViewById(R.id.button7),
                button8 = findViewById(R.id.button8),
                button9 = findViewById(R.id.button9),
                button0 = findViewById(R.id.button0),
                decimal = findViewById(R.id.decimal),

                clear = findViewById(R.id.clear),

                mulBtn = findViewById(R.id.mulBtn),
                divBtn = findViewById(R.id.divBtn),
                addBtn = findViewById(R.id.addBtn),
                subBtn = findViewById(R.id.subBtn),

                equalTo = findViewById(R.id.equalTo);

        TextView result = findViewById(R.id.resultTextView),
                input = findViewById(R.id.inputTextView),
                inputPanel =findViewById(R.id.inputTextView2);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().equals("0")) {
                    input.setText("0");
                    inputPanel.setText("0");
                }
                else {
                    input.setText(input.getText().toString() + button0.getText().toString());
                    inputPanel.setText(inputPanel.getText().toString() + button0.getText().toString());
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("0")) {
                    input.setText(button1.getText().toString());
                    inputPanel.setText(button1.getText().toString());
                } else {
                    input.setText(input.getText().toString() + button1.getText().toString());
                    inputPanel.setText(inputPanel.getText().toString() + button1.getText().toString());
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("0")) {
                    input.setText(button2.getText().toString());
                    inputPanel.setText(button2.getText().toString());
                } else {
                    input.setText(input.getText().toString() + button2.getText().toString());
                    inputPanel.setText(inputPanel.getText().toString() + button2.getText().toString());
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("0")) {
                    input.setText(button3.getText().toString());
                    inputPanel.setText(button3.getText().toString());
                } else {
                    input.setText(input.getText().toString() + button3.getText().toString());
                    inputPanel.setText(inputPanel.getText().toString() + button3.getText().toString());
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("0")) {
                    input.setText(button4.getText().toString());
                    inputPanel.setText(button4.getText().toString());
                } else {
                    input.setText(input.getText().toString() + button4.getText().toString());
                    inputPanel.setText(inputPanel.getText().toString() + button4.getText().toString());
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("0")) {
                    input.setText(button5.getText().toString());
                    inputPanel.setText(button5.getText().toString());
                } else {
                    input.setText(input.getText().toString() + button5.getText().toString());
                    inputPanel.setText(inputPanel.getText().toString() + button5.getText().toString());
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("0")) {
                    input.setText(button6.getText().toString());
                    inputPanel.setText(button6.getText().toString());
                } else {
                    input.setText(input.getText().toString() + button6.getText().toString());
                    inputPanel.setText(inputPanel.getText().toString() + button6.getText().toString());
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("0")) {
                    input.setText(button7.getText().toString());
                    inputPanel.setText(button7.getText().toString());
                } else {
                    input.setText(input.getText().toString() + button7.getText().toString());
                    inputPanel.setText(inputPanel.getText().toString() + button7.getText().toString());
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("0")) {
                    input.setText(button8.getText().toString());
                    inputPanel.setText(button8.getText().toString());
                } else {
                    input.setText(input.getText().toString() + button8.getText().toString());
                    inputPanel.setText(inputPanel.getText().toString() + button8.getText().toString());
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.getText().toString().equals("0")) {
                    input.setText(button9.getText().toString());
                    inputPanel.setText(button9.getText().toString());
                } else {
                    input.setText(input.getText().toString() + button9.getText().toString());
                    inputPanel.setText(inputPanel.getText().toString() + button9.getText().toString());

                }
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("0");
                x = y = equals = 0;
                option = null;
                inputPanel.setText("0");
                result.setText("");
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option != null) {
                    if (!option.equals("=")) {
                        equalTo.performClick();
                    }
                    input.setText(calcPanel);
                    inputPanel.setText(calcPanel);
                }
                calcPanel = input.getText().toString();
                if (!calcPanel.isEmpty()) {
                    x = Double.parseDouble(calcPanel);
                    option = "+";
                    input.setText(""); // Clear the input for the next number
                    inputPanel.setText(inputPanel.getText().toString() + addBtn.getText().toString());
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a number first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option != null) {
                    if (!option.equals("=")) {
                        equalTo.performClick();
                    }
                    input.setText(calcPanel);
                    inputPanel.setText(calcPanel);
                }
                calcPanel = input.getText().toString();
                if (!calcPanel.isEmpty()) {
                    x = Double.parseDouble(calcPanel);
                    option = "-";
                    input.setText(""); // Clear the input for the next number
                    inputPanel.setText(inputPanel.getText().toString() + subBtn.getText().toString());
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a number first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option != null) {
                    if (!option.equals("=")) {
                        equalTo.performClick();
                    }
                    input.setText(calcPanel);
                    inputPanel.setText(calcPanel);
                }
                calcPanel = input.getText().toString();
                if (!calcPanel.isEmpty()) {
                    x = Double.parseDouble(calcPanel);
                    option = "×";
                    input.setText(""); // Clear the input for the next number
                    inputPanel.setText(inputPanel.getText().toString() + mulBtn.getText().toString());
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a number first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option != null) {
                    if (!option.equals("=")) {
                    equalTo.performClick();
                    }
                    input.setText(calcPanel);
                    inputPanel.setText(calcPanel);
                }
                calcPanel = input.getText().toString();
                if (!calcPanel.isEmpty()) {
                    x = Double.parseDouble(calcPanel);
                    option = "÷";
                    input.setText(""); // Clear the input for the next number
                    inputPanel.setText(inputPanel.getText().toString() + divBtn.getText().toString());
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a number first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString() + decimal.getText().toString());
                inputPanel.setText(inputPanel.getText().toString() + decimal.getText().toString());
            }
        });

        equalTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    calcPanel = input.getText().toString().trim();

                    // Check if input is empty
                    if (calcPanel.isEmpty()) {
                        Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    // Attempt to parse the input to a double
                    y = Double.parseDouble(calcPanel);

                    // Check if an operation was selected
                    if (option == null) {
                        Toast.makeText(MainActivity.this, "Select an operation", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    // Perform calculation based on the selected operation
                    switch (option) {
                        case "+":
                            equals = x + y;
                            break;
                        case "-":
                            equals = x - y;
                            break;
                        case "×":
                            equals = x * y;
                            break;
                        case "÷":
                            if (y == 0) {
                                Toast.makeText(MainActivity.this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                                return;
                            }
                            equals = x / y;
                            break;
                        default:
                            Toast.makeText(MainActivity.this, "Unknown operation", Toast.LENGTH_SHORT).show();
                            return; // Exit if the operation is unknown
                    }

                    result.setText(String.valueOf(equals)); // Display the result
                    option = null; // Reset the operation for the next calculation
                    calcPanel = String.valueOf(equals); // Store the result for the next calculation

                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Invalid number format. Please enter a valid number.", Toast.LENGTH_SHORT).show();
                    input.setText("0"); // Reset the input field
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Operation error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                option = "=";
            }
        });

    }
}