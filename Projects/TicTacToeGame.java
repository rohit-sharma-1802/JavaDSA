import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeGame extends JFrame implements ActionListener {
    private JButton[] buttons;
    private String currentPlayer;
    private JLabel statusLabel;

    public TicTacToeGame() {
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));

        buttons = new JButton[9];
        currentPlayer = "X";

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        statusLabel = new JLabel("Player " + currentPlayer + "'s turn");
        add(panel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        if (clickedButton.getText().equals("")) {
            clickedButton.setText(currentPlayer);

            if (checkWin()) {
                statusLabel.setText("Player " + currentPlayer + " wins!");
                disableButtons();
            } else if (isBoardFull()) {
                statusLabel.setText("It's a tie!");
                disableButtons();
            } else {
                currentPlayer = currentPlayer.equals("X") ? "O" : "X";
                statusLabel.setText("Player " + currentPlayer + "'s turn");
            }
        }
    }

    private boolean checkWin() {
        String[] board = new String[9];
        for (int i = 0; i < 9; i++) {
            board[i] = buttons[i].getText();
        }

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i * 3].equals(board[i * 3 + 1]) && board[i * 3].equals(board[i * 3 + 2])
                    && !board[i * 3].equals("")) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[i].equals(board[i + 3]) && board[i].equals(board[i + 6]) && !board[i].equals("")) {
                return true;
            }
        }

        // Check diagonals
        if (board[0].equals(board[4]) && board[0].equals(board[8]) && !board[0].equals("")) {
            return true;
        }
        if (board[2].equals(board[4]) && board[2].equals(board[6]) && !board[2].equals("")) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (buttons[i].getText().equals("")) {
                return false;
            }
        }
        return true;
    }

    private void disableButtons() {
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TicTacToeGame();
        });
    }
}
