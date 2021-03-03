public class Dog extends Animal{
    private final runLimit;
    private final int swimLimit;
    public Dog(String name){
        super(name);
        runLimit = (int)(200 + Math.random() * 5000);
        swimLimit = (int) (50 + Math.random() * 200);

    public void swim(int distance)
        if(distance <= swimLimit){
            System.out.println("Пес " + getName() + "проплыл"+ distance + "метров" );
        } else {
            System.out.println("Пес \" + getName() + \" не может проплыть так много");
        }
    }



    public void run(int distance) {
        if(distance <= runLimit){
            System.out.println("Пес " + getName() + "пробежал"+ distance + "метров" );
        } else {
            System.out.println("Пес \" + getName() + \" не может пробежать так много");
        }
    }
}
