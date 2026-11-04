public class Clothes extends WearableItem {

    @Override
    public void wear() {
        System.out.println("Wearing Clothes");
    }

    @Override
    public void getlifespan() {
        System.out.println("Clothes lifespan: 3 years");
    }
}
