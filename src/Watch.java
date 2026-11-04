public class Watch extends WearableItem {

    @Override
    public void wear() {
        System.out.println("Wearing Watch");
    }

    @Override
    public void getlifespan() {
        System.out.println("Watch lifespan: 5 years");
    }
}
