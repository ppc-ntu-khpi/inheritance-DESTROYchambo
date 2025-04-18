package domain;

/**
 *
 * @author Oleksandr
 */
public class Dino {

    protected String name;

    protected int weight;

    public Dino() {
        name = "normal dino";
        weight = 8000;
    }

    public void eat() {
        System.out.println("Dino eating...");
    }

    public void roar() {
        System.out.println("Dino roaring...");
    }

    @Override
    public String toString() {
        return "Dino: " + "\nName:\t" + name + "\nWeight:\t" + weight + " kg";
    }
}
