public class HW8 {

    private static final char DEFAULT = '_';
    public static char[] [] MAP = new char[3][3];



    public HW8() {
        fillMap();
    }

    private static void fillMap() {
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                MAP[i][j] = DEFAULT;
            }
        }
    }

    public boolean isWin(char x) {
        // Сделать эффективную проверку на победу
        boolean isWin = false;

        for (int i = 0; i < 3; i++) {
            isWin = MAP[i][0] == x && MAP[i][1] == x && MAP[i][2] == x
                    || MAP[0][i] == x && MAP[1][i] == x && MAP[2][i] == x;
            if (isWin) {
                return true;
            }
        }
        return MAP[0][0] == x && MAP[1][1] == x && MAP[2][2] == x || MAP[0][2] == x && MAP[1][1] == x && MAP[2][0] == x;
    }

    public boolean validInput(int x, int y) {
        boolean inMap = x >= 0 && y >= 0 && x < MAP.length && y < MAP.length;
        return inMap && MAP[x][y] == DEFAULT;
    }

    public boolean isTie(){
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                if (MAP[i][j] == DEFAULT){
                    return false;
                }
            }
        }
        return true;
    }
}


