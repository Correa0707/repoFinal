package model;
// Vehiculo.java
public abstract class Vehiculo {
    protected int x, y;
    protected int velocidad; // milisegundos entre movimientos

    public Vehiculo(int x, int y, int velocidad) {
        this.x = x;
        this.y = y;
        this.velocidad = velocidad;
    }

    public abstract void mover();

    public int getX() { return x; }
    public int getY() { return y; }
}

