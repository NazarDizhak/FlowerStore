package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;

    private Flower rose;
    private Flower tulip;
    private Flower chamomile;

    @BeforeEach
    public void init() {
        rose = new Rose();
        tulip = new Tulip();
        chamomile = new Chamomile();
    }

    @Test
    public void testRosePrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        rose.setPrice(price);
        Assertions.assertEquals(price, rose.getPrice());
    }

    @Test
    public void testTulipPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        tulip.setPrice(price);
        Assertions.assertEquals(price, tulip.getPrice());
    }

    @Test
    public void testChamomilePrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        chamomile.setPrice(price);
        Assertions.assertEquals(price, chamomile.getPrice());
    }

    @Test
    public void testRoseColor() {
        FlowerColor color = FlowerColor.RED;
        rose.setColor(color);
        Assertions.assertEquals("RED", rose.getColor());
    }

    @Test
    public void testTulipColor() {
        FlowerColor color = FlowerColor.BLUE;
        tulip.setColor(color);
        Assertions.assertEquals("BLUE", tulip.getColor());
    }

    @Test
    public void testChamomileColor() {
        FlowerColor color = FlowerColor.YELLOW;
        chamomile.setColor(color);
        Assertions.assertEquals("YELLOW", chamomile.getColor());
    }
}