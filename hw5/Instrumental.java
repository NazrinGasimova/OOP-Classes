class Instrumental extends Music{
    public Instrumental(String genre){
        super(genre);
    }
    // Overriding abstract method
    @Override
    public void performance(){
        System.out.println("Instrumental music can be performed using "+genre);
    }
    // Overriding the concrete method
    @Override
    public void displayMessage(){
        System.out.println("Welcome to the Instrumental Performance section.");
    }
    //Instrumental's concrete method
    public void play(){
        System.out.println("Instrumental music involves playing instruments.");
    }
}