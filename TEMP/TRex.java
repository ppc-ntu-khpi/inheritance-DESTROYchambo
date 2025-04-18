package domain;

/**
 *
 * @author Oleksandr
 */
public class TRex extends Hunter {

    public TRex(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public TRex() {
        this("MAD TRex >:[", 10000);
    }

    public TRex(String name) {
        this(name, 10000);
    }

    public void roar() {
        System.out.println("Im roaring");
    }

    @Override
    public void hunt() {
        System.out.println("Im hunting for a brahio...");
    }

   
}
