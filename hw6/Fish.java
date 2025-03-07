public class Fish extends Pet {
    public Fish() {
        super();
        this.species = Species.FISH;
    }

    @Override
    public void respond() {
        System.out.println("The fish silently flicks its tail, gracefully swimming through the water.");
    }

}