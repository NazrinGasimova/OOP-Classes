abstract class Music{
    protected String genre;
    public Music(String genre){
        this.genre = genre;
    }
    // Abstract method
    public abstract void performance();
    // Concrete methods
    public void start(){
        System.out.println("The music session is starting.");
    }
    public void displayMessage(){
        System.out.println("Welcome to the Music Festival! Enjoy the tunes.");
    }
}