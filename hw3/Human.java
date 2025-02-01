public class Human{
    String name;
    String surname;
    int year;
    int IQ;
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
    public Human(String name,String surname,int year,Human father,Human mother,Pet pet){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.father=father;
        this.mother=mother;
    }

    public void greetPet(){
        if(pet!=null){
            System.out.println("Hello, "+pet.nickname);
        }
    }
    public void describePet(){
        if(pet!=null){
            if(pet.tricklevel>50){
                System.out.println("I have an "+pet.species+" is "+pet.age+" years old, he is very sly.");
            }else{
                System.out.println("I have an "+pet.species+" is "+pet.age+" years old, he is almost not sly.");
            }
        }

    }
    public String toString(){
        return "Human{name='"+name+"',surname='"+surname+"',year="+year+",iq="+IQ+",mother="+mother.name+" "+mother.surname+",father="+father.name+" "+father.surname+",pet="+pet.toString()+"}";
    }
}