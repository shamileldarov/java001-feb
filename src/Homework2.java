public class Homework2 {
    public static void main(String[] args) {
        System.out.println("\r\n Задание номер 1");
        int[] arrOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = arrOne[i] == 1 ? 0 : 1;
            System.out.print(arrOne[i] + " ");
        }


        System.out.println("\r\nЗадание номер 2");
        int[] arrTwo = new int[8];
        for (int i = 1, j = 0; i < arrTwo.length; i++) arrTwo[i] = j += 3;
        for (int x : arrTwo) System.out.print(x + " ");


        System.out.println("\r\nЗадание номер 3");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }


        System.out.println("\r\nЗадание номер 4");
        int[][] arrF = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, j2 = arrF[i].length; j < arrF[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arrF[i][j] = 1;
                System.out.print(arrF[i][j] + " ");
            }
            System.out.print("\r\n");
        }
    }
}
