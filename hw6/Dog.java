public class Dog extends Pet implements Foulable {
    public Dog() {
        super();
        this.species = Species.DOG;
    }

    @Override
    public void respond() {
        System.out.println("I am ready to be your loyal companion.");
    }

    @Override
    public void foul() {
        System.out.println("The dog digs a hole.");
    }
}