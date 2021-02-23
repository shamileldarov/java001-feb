
import java.util.Random;
import java.util.Scanner;

public class H4 {
    private static final int SIZE_X = 4;
    private static final int SIZE_Y = 4;
    private static final char PLAYER_DOT = 'X';
    private static final char AI_DOT = 'O';
    private static final char EMPTY_DOT = '.';
    private static final int TO_WIN = 3;

    private static char[][] field = new char[SIZE_Y][SIZE_X];

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void initFields() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    public static void printField() {
        System.out.println("-------");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    public static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    public static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты: X (от 1 до " + SIZE_X + ") Y (от 1 до " + SIZE_Y + ")");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x));
        setSym(y, x, PLAYER_DOT);
    }

    //4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
    public static void aiStep() {
        //Ищкем выигрышный ход компьютера
        for (int i = 0; i < SIZE_Y; i++)
            for (int j = 0; j < SIZE_X; j++) {
                if (isCellValid(i, j)) {
                    setSym(i, j, AI_DOT);
                    if (checkWin(AI_DOT)) return;
                    setSym(i, j, EMPTY_DOT);
                }
            }
        //Проверим игрока: не окозалось ли у него следующего выйгрошного хода
        for (int i = 0; i < SIZE_Y; i++)
            for (int j = 0; j < SIZE_X; j++) {
                if (isCellValid(i, j)) {
                    setSym(i, j, PLAYER_DOT);
                    if (checkWin(PLAYER_DOT)) {
                        setSym(i, j, AI_DOT);
                        return;
                    }
                    setSym(i, j, EMPTY_DOT);
                }
            }
        //Если игра не привела к ничье, то исходим из этого
        int x;
        int y;
        do {
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        } while (!isCellValid(y, x));
        setSym(y, x, AI_DOT);
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            return false;
        }
        return field[y][x] == EMPTY_DOT;
    }

    public static boolean isFuelFull() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }


    // Второе и третье задание
    private static boolean checkWin(char sym) {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (checkLine(i, j, 0, 1, sym)) return true; // осуществим проверку линии по  х
                if (checkLine(i, j, 1, 1, sym)) return true; // осуществим проверку по диагонали х у
                if (checkLine(i, j, 1, 0, sym)) return true; // осуществим проверку линии по у
                if (checkLine(i, j, -1, 1, sym)) return true; // осущесвтим проверку по диагонали х -у
            }
        }
        return false;
    }
    // проверка линии
    private static boolean checkLine(int y, int x, int vy, int vx, char sym) {
        int wayX = x + (TO_WIN - 1) * vx;
        int wayY = y + (TO_WIN - 1) * vy;
        if (wayX < 0 || wayY < 0 || wayX > SIZE_X - 1 || wayY > SIZE_Y - 1) return false;
        for (int i = 0; i < TO_WIN; i++) {
            int itemY = y + i * vy;
            int itemX = x + i * vx;
            if (field[itemY][itemX] != sym) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        initFields();
        printField();

        while (true) {
            playerStep();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("PLAYER WIN!");
                break;
            }
            if (isFuelFull()) {
                System.out.println("DRAW!");
                break;
            }
            aiStep();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("SkyNet WIN!");
                break;
            }
            if (isFuelFull()) {
                System.out.println("DRAW!");
                break;
            }
        }

    }

}

