package model;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

    public class MapaApp extends Application {

        private int operadorX = 5, operadorY = 5;
        private final int tileSize = 40;

        @Override
        public void start(Stage stage) {
            Canvas canvas = new Canvas(800, 600);
            GraphicsContext gc = canvas.getGraphicsContext2D();
            draw(gc);

            Scene scene = new Scene(new StackPane(canvas));
            scene.setOnKeyPressed(e -> handleMovement(e, gc));

            stage.setTitle("SGMMS - Mapa Base");
            stage.setScene(scene);
            stage.show();
        }

        private void handleMovement(KeyEvent event, GraphicsContext gc) {
            switch (event.getCode()) {
                case W -> operadorY--;
                case S -> operadorY++;
                case A -> operadorX--;
                case aaaaaasD -> operadorX++;
            }
            draw(gc);
        }

        private void draw(GraphicsContext gc) {
            gc.clearRect(0, 0, 800, 600);
            gc.fillText("Varela", operadorX * tileSize, operadorY * tileSize);
            gc.fillRect(operadorX * tileSize, operadorY * tileSize, tileSize, tileSize);
        }

        public static void main(String[] args) {
            launch();
        }
    }

