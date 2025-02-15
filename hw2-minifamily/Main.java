public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("cat", "maya", 2, 54, new String[]{"meow", "eat", "sleep"});
        Human mother = new Human("Zehra", "Kaya", 1981);
        Human father = new Human("Yusuf", "Kaya", 1981);
        Family family = new Family(mother, father);
        family.setPet(pet);

        Human child = new Human("Hayat", "Kaya", 2005, 90, null);
        family.addChild(child);

        System.out.println(family);
        System.out.println("Family member count: " + family.countFamily());

        child.getFamily().getPet().eat();
        child.getFamily().getPet().foul();
        child.getFamily().getPet().respond();

        family.deleteChild(0);
        System.out.println("After removing child: "+family);
    }
}