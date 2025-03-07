public class Man extends Human {
    public Man(String name, String familyName, int iq) {
        super(name, familyName, iq);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello, pet! I'm your master.");
    }

    @Override
    public void uniqueMethod() {
        System.out.println("I'm all about cars, I'm there to fix it.");
    }
}