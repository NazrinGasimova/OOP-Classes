public class Main {
    public static void main(String[] args) {
        Pet pet=new Pet("cat","maya",2,54, new String[]{"meow", "eat", "sleep"});
        Human mother=new Human("Zehra","Kaya",1981);
        Human father=new Human("Yusuf","Kaya",1981);
        Human human=new Human("Hayat","Kaya",2005,90,pet,father,mother,null);

        human.greetPet();
        human.describePet();
        pet.eat();
        pet.foul();
        pet.respond();

        human.feedPet(false);
    }
}
