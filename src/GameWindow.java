import javax.swing.*;
import java.awt.*;

  public class GameWindow extends JFrame {

private static final ImageIcon def = new ImageIcon("def.png");
private static final ImageIcon x = new ImageIcon("x.png");
private static final ImageIcon o = new ImageIcon("o.png");

private JButton [][] map;
        HW8 hw8 = new HW8();


public static void main(String[] args) {
        new GameWindow();
        }

public GameWindow() throws HeadlessException {
        setSize(360, 360);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        GridLayout layout = new GridLayout(3, 3);
        JPanel panel = new JPanel(layout);
        map = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        JButton button = new JButton();
        button.setIcon(def);
        int xCor = i;
        int yCor = j;
        button.addActionListener(action -> {
        if (hw8.validInput(xCor,yCor)) {
        button.setIcon(x);
        hw8.MAP[xCor][yCor] = 'X';
        }
        if (hw8.isWin('X')) {
        showWinnerDialog("Вы победили!");
        }
        // Проверка победы
        movePc();
        if (hw8.isWin('O')) {
        showWinnerDialog("Вы проиграли!");
        }
        //проверка ничьи и победы
        if (hw8.isTie() && !hw8.isWin('X') && !hw8.isWin('O')){
        showWinnerDialog("Ничья");
        }
        });
        panel.add(button);
        map [i][j] = button;
        }

        }
        add(panel);
        setVisible(true);
        setResizable(false);
        }

private void showWinnerDialog( String result) {
        new WinnerDialog(this, result);
        }

private void movePc() {
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        if (map[i][j].getIcon().equals(def)) {
        map [i][j].setIcon(o);
        hw8.MAP[i][j] = 'O';
        return;
                }
            }
            }
            }
  }
