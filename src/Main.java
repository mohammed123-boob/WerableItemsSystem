public class Main {

    public static void main(String[] args) {

        WearableItem item;

        item = new Clothes();
        item.wear();
        item.getlifespan();

        System.out.println("----------------");

        item = new Watch();
        item.wear();
        item.getlifespan();

        System.out.println("----------------");

        item = new Sweater();
        item.wear();
        item.getlifespan();

        System.out.println("----------------");

        Earphones earphones = new Earphones();
        earphones.wear();

        System.out.println("----------------");

        Car car = new Car();
        car.getlifespan();
    }
}
