public class Woman extends Human {
    public Woman(String name, String familyName, int iq) {
        super(name, familyName, iq);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello, sweetie! I'm so glad to spend time with you today.");
    }

    @Override
    public void uniqueMethod() {
        System.out.println("I adore makeup.");
    }
}