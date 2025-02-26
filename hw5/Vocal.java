class Vocal extends Music{
    public Vocal(String genre){
        super(genre);
    }
    // Overriding abstract method
    @Override
    public void performance(){
        System.out.println("Vocal music can be performed in the style of " + genre);
    }
    //Vocal's concrete method
    public void singing(){
        System.out.println("Vocal music involves singing.");
    }
}