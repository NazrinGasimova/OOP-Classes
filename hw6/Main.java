public class Main {
    public static void main(String[] args) {
        Pet fish = new Fish();
        Pet dog = new Dog();
        Pet domesticCat = new DomesticCat();
        Pet roboCat = new RoboCat();

        Man father = new Man("Oliver", "Greenwood", 120);
        Woman mother = new Woman("Sophia", "Greenwood", 110);
        Family family = new Family("Greenwood", father, mother);

        System.out.println("Fish response:");
        fish.respond();
        System.out.println("\nDog response:");
        dog.respond();
        System.out.println("\nDomestic Cat response:");
        domesticCat.respond();
        System.out.println("\nRobo Cat response:");
        roboCat.respond();

        if (domesticCat instanceof Foulable) {
            ((Foulable) domesticCat).foul();
        }
        if (dog instanceof Foulable) {
            ((Foulable) dog).foul();
        }

        System.out.println("\nOliver (father) greets the pet with enthusiasm:");
        father.greetPet();
        father.uniqueMethod();

        System.out.println("\nSophia (mother) gives her pet a warm greeting:");
        mother.greetPet();
        mother.uniqueMethod();

        Human child = family.bornChild();
        System.out.println("\nA new family member has joined us:");
        child.greetPet();
        child.uniqueMethod();

        System.out.println("Introducing the newest member of the family: " + child.name);
    }
}