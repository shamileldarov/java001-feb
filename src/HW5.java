public class HW5 {// Первое задание
    String name;
    String position;
    String phone_number;
    String email;
    int salary;
    int age;

    public HW5 (String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    // Метод

    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone_number, salary, age);}

    // Метод, выводящий на консоль
    public void print(){
        System.out.println(this);
    }


    public static void main(String[] args)  {

        HomeWork5[] persArray = new HomeWork5[5];
        persArray[0] = new HomeWork5 ("Николай Петрович", "Генеральный директор", "24234@inbox.ru", "+79625665544", 250000, 40);
        persArray[1] = new HomeWork5("Петр Николаевич", "Тестировщик", "2552@inbox.ru", "+792452534455", 13456354, 38);
        persArray[2] = new HomeWork5("Андрей Андреевич", "Старший тестировщик", "25352@inbox.ru", "+7235977715", 1935666, 22);
        persArray[3] = new HomeWork5("Вячеслав Иванов ", "Разработчик", "2552234@inbox.ru", "+725654634", 134565, 19);
        persArray[4] = new HomeWork5("Евгений Сидоров", "HR", "2423554@inbox.ru", "+79365345653546", 134634, 20);

        //  Последнее задание
        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();

    }
}

