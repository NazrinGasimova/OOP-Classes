import java.util.Random;

public class Human{
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;
    public Human(){
    }
    public Human(String name,String surname,int year){
        this.name=name;
        this.surname=surname;
        this.year=year;
    }
    public Human(String name,String surname,int year,Human father,Human mother){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.father=father;
        this.mother=mother;

    }
    public Human(String name, String surname, int year, int iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }
    public void greetPet(){
        if(pet!=null){
            System.out.println("Hello, "+pet.nickname);
        }
    }
    public void describePet(){
        if(pet!=null){
            if(pet.trickLevel>50){
                System.out.println("I have an "+pet.species+" is "+pet.age+" years old, he is very sly.");
            }else{
                System.out.println("I have an "+pet.species+" is "+pet.age+" years old, he is almost not sly.");
            }
        }

    }
    public void feedPet(boolean isittimeforfeeding) {
        if (pet == null) return;
        if (isittimeforfeeding) {
            System.out.printf("Hm... I will feed %s's %s", name, pet.species);
        } else {
            Random rand = new Random();
            int r = rand.nextInt(101);
            if (pet.trickLevel > r) {
                System.out.printf("Hm... I will feed %s's %s\n", name, pet.species);
            } else {
                System.out.printf("I think %s is not hungry", pet.species);
            }
        }

    }
    public String toString(){
        return "Human{name='"+name+"',surname='"+surname+"',year="+year+",iq="+iq+",mother="+mother.name+" "+mother.surname+",father="+father.name+" "+father.surname+",pet="+pet.toString()+"}";
    }
}
