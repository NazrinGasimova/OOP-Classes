import java.util.Arrays;
import java.util.Objects;
public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(){
    }
    public Pet(Species species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }
    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel=trickLevel;
        this.habits = habits;
    }
    public Species getSpecies(){
        return species;
    }
    public void setSpecies(Species species){
        this.species = species;
    }
    public String getNickname(){
        return nickname;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getTrickLevel(){
        return trickLevel;
    }
    public void setTrickLevel(){
    }
    public String[] getHabits(){
        return habits;
    }
    public void setHabits(String[] habits){
        this.habits = habits;
    }
    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.println("Hello, owner. I am " + nickname + ". I miss you!");
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }
    @Override
    public String toString() {
        return species+"{nickname='"+nickname+"', age=" + age+", trickLevel="+trickLevel+", habits="+Arrays.toString(habits)+", canFly=" +species.canFly()+", numberOfLegs="+species.getNumberOfLegs()+", hasFur="+species.hasFur()+"}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && species==pet.species && Objects.equals(nickname, pet.nickname) && Arrays.equals(habits, pet.habits);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }
    @Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException();
    }
}