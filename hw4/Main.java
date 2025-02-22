public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet(Species.CAT, "Maya", 2, 54, new String[]{"meow", "eat", "sleep"});

        Human mother = new Human("Zehra", "Kaya", 1981);
        Human father = new Human("Yusuf", "Kaya", 1981);

        Family family = new Family(mother, father);
        family.setPet(pet);

        Human child = new Human("Hayat", "Kaya", 2005, 90, null);
        family.addChild(child);

        System.out.println(family);

        for (int i = 0; i < 100000; i++) {
            new Human("test","testtt",2006);
        }
        System.gc();

        pet.eat();
        pet.respond();
        pet.foul();

        System.out.println("Pet Species: " + pet.getSpecies());
        System.out.println("Can the pet fly? " + pet.getSpecies().canFly());
        System.out.println("Number of legs: " + pet.getSpecies().getNumberOfLegs());
        System.out.println("Does it have fur? " + pet.getSpecies().hasFur());
    }
}
