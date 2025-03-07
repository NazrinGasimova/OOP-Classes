public abstract class Pet {
    protected Species species;

    public Pet() {
        this.species = Species.UNKNOWN;
    }

    public abstract void respond();

    public void eat() {
        System.out.println("Don't forget to feed me, I really don't enjoy being hungry!");
    }

}