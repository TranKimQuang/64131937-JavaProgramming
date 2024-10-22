package com.example.caro4x4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private boolean playerXTurn = true;  // X sẽ đi trước
    private String[][] board = new String[4][4];  // Bảng caro 4x4

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khởi tạo bảng 4x4 trống
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = "";
            }
        }
    }

    // Xử lý khi người chơi bấm vào một ô
    public void onGridButtonClick(View view) {
        Button button = (Button) view;
        String tag = (String) button.getTag();
        int row = Integer.parseInt(tag.split(",")[0]);
        int col = Integer.parseInt(tag.split(",")[1]);

        if (board[row][col].equals("")) {
            board[row][col] = playerXTurn ? "X" : "O";
            button.setText(board[row][col]);
            if (checkWin()) {
                Toast.makeText(this, (playerXTurn ? "X" : "O") + " wins!", Toast.LENGTH_SHORT).show();
                resetBoard();
            } else {
                playerXTurn = !playerXTurn;
            }
        }
    }

    // Kiểm tra xem có người thắng hay chưa
    private boolean checkWin() {
        // Kiểm tra các hàng
        for (int i = 0; i < 4; i++) {
            if (!board[i][0].equals("") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && board[i][2].equals(board[i][3])) {
                return true;
            }
        }

        // Kiểm tra các cột
        for (int i = 0; i < 4; i++) {
            if (!board[0][i].equals("") && board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && board[2][i].equals(board[3][i])) {
                return true;
            }
        }

        // Kiểm tra đường chéo
        if (!board[0][0].equals("") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && board[2][2].equals(board[3][3])) {
            return true;
        }
        if (!board[0][3].equals("") && board[0][3].equals(board[1][2]) && board[1][2].equals(board[2][1]) && board[2][1].equals(board[3][0])) {
            return true;
        }

        return false;
    }

    // Đặt lại bảng
    private void resetBoard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = "";
                int buttonId = getResources().getIdentifier("button_" + i + j, "id", getPackageName());
                Button button = findViewById(buttonId);
                button.setText("");
            }
        }
        playerXTurn = true;  // X sẽ đi trước
    }
}
