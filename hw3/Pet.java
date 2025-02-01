import java.util.Arrays;

/*
_________________________
|          PET          |
-------------------------
| - species : String    |
| - nickname : String   |
| - age : int           |
| - tricklevel : int    |
| - habits : String[]   |
-------------------------
| + Pet()               |
| + public Pet(String species,String nickname,int age,int tricklevel,String[] habits)|
| + public Pet(String species,String nickname) |
| + eat                 |
| + respond             |
| + foul                |
-------------------------


*/
public class Pet{
    String species;
    String nickname;
    int age;
    int tricklevel;
    String[] habits;
    public Pet(String nickname){
        this.nickname=nickname;
    }
    public Pet() {
    }
    public Pet(String species,String nickname){
        this.species=species;
        this.nickname=nickname;

    }
    public Pet(String species,String nickname,int age,int tricklevel,String[] habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        this.habits=habits;
    }
    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.println("Hello, owner. I am "+nickname+". I miss you!");
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }

    public String toString(){
        return species+"{nickname='"+nickname+"',age="+age+",tricklevel="+tricklevel+",habits="+ Arrays.toString(habits) +"}";
    }
}
