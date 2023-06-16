package devolden;

import java.util.Random;

public class Food {
    private final int posX;
    private final int posY;

    public Food() {
        posX = generalPos(Graphics.WIDTH);
        posY = generalPos(Graphics.HEIGHT);
    }

    private int generalPos(int size) {
        Random random = new Random();
        return random.nextInt(size / Graphics.TICK_SIZE) * Graphics.TICK_SIZE;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}
