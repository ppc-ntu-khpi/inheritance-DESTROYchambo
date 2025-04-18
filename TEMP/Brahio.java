package domain;

/**
 *
 * @author Oleksandr
 */
public class Brahio extends Dino {

    public Brahio(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Brahio() {
        this("HAPPY brahio :D", 14000);
    }

    public Brahio(String name) {
        this(name, 14000);
    }

    public void roar() {
        System.out.println("Im roaring");
    }

    @Override
    public void eat() {
        System.out.println("Im eating leaves :D");
    }

}
