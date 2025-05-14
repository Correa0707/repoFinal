package model;
// MainVehiculos.java
public class MainVehiculos {
    public static void main(String[] args) {
        Ambulancia a1 = new Ambulancia(0, 0);
        new Thread(a1).start();
    }
}

