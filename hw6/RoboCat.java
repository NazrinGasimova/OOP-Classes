public class RoboCat extends Pet {
    public RoboCat() {
        super();
        this.species = Species.ROBO_CAT;
    }
    @Override
    public void respond () {
        System.out.println("Beep beep... I am a robotic cat.");
    }
}
