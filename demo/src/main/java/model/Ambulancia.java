package model;

// Ambulancia.java
public class Ambulancia extends Vehiculo implements Runnable {

    public Ambulancia(int x, int y) {
        super(x, y, 500); // se mueve cada 500 ms
    }

    @Override
    public void mover() {
        x += 1; // se mueve horizontalmente
        System.out.println("Ambulancia en (" + x + ", " + y + ")");
    }

    @Override
    public void run() {
        while (true) {
            mover();
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

