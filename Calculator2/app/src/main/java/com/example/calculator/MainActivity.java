package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    TextView result;
    Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liên kết các thành phần giao diện với mã Java
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        result = findViewById(R.id.result);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);

        // Xử lý sự kiện khi nhấn nút cộng
        buttonAdd.setOnClickListener(v -> {
            if (validateInputs()) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double sum = num1 + num2;
                result.setText("Kết quả: " + sum);
            }
        });

        // Xử lý sự kiện khi nhấn nút trừ
        buttonSubtract.setOnClickListener(v -> {
            if (validateInputs()) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double difference = num1 - num2;
                result.setText("Kết quả: " + difference);
            }
        });

        // Xử lý sự kiện khi nhấn nút nhân
        buttonMultiply.setOnClickListener(v -> {
            if (validateInputs()) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double product = num1 * num2;
                result.setText("Kết quả: " + product);
            }
        });

        // Xử lý sự kiện khi nhấn nút chia
        buttonDivide.setOnClickListener(v -> {
            if (validateInputs()) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                if (num2 != 0) {
                    double quotient = num1 / num2;
                    result.setText("Kết quả: " + quotient);
                } else {
                    Toast.makeText(MainActivity.this, "Không thể chia cho 0", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Hàm kiểm tra đầu vào hợp lệ
    private boolean validateInputs() {
        if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Vui lòng nhập đủ 2 số", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
