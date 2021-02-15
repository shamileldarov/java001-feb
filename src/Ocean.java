public class Ocean {
    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {
        System.out.println();

    }

    //Второе задание Создать переменные всех пройденных типов данных, и инициализировать их значения;
    static void two() {
        System.out.println("Задание 1.");
        boolean b = true;
        byte bt = 127;
        char c = '*';
        short s = 500;
        int i = 600;
        long l = 200000L;
        float f = 12.23f;
        double d = 123.123;
        System.out.println("Значение boolean = " + b);
        System.out.println("Значение byte = " + bt);
        System.out.println("Значение char = [" + c + "]");
        System.out.println("Значение short = " + s);
        System.out.println("Значение int = " + i);
        System.out.println("Значение long = " + l);
        System.out.println("Значение float = " + f);
        System.out.println("Значение double = " + d);
    }

    //Третье задание: Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – входные параметры этого метода;
    static double tree(double a, double b, double c, double d) {
        System.out.println("Задание3");
        return a * (b + (c / d));
    }

    //Четвертое задание: Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
    //в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean four(int a, int b) {
        System.out.println("Задание 4");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    //Пятое задание. Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
    //считаем положительным числом.
    static void five(int a) {
        System.out.println("Задание 5");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    // Шестое задание. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    // если число отрицательное, и вернуть false если положительное.

    static boolean six(int a) {
        System.out.println("Задание шестое");
        if (a < 0) return true;
        return false;
    //Седьмое задание: написать метод, которому в качестве параметра передается строка, обозначающая имя.
        // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

        public void methodName(String name){
            System.out.println("Привет, " + name + "!");
        }


        }
    }


