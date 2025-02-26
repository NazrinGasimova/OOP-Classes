public class Main {
    public static void main(String[] args) {
        Instrumental instrumental = new Instrumental("guitar");
        instrumental.start();
        instrumental.displayMessage();
        instrumental.performance();
        instrumental.play();
        Vocal vocal = new Vocal("opera");
        vocal.start();
        vocal.displayMessage();
        vocal.performance();
        vocal.singing();
    }
}