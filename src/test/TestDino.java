package test;

import domain.*;

/**
 *
 * @author Oleksandr
 */
public class TestDino {

    public static void main(String[] args) {
        TRex trex = new TRex("MAD TREX >:[");
        System.out.println(trex);
        trex.roar();
        trex.hunt();
        System.out.println("--------------------------------");
        Brahio brahio = new Brahio("HAPPY Brahio :D");
        System.out.println(brahio);
        brahio.eat();
        brahio.roar();
    }

}
