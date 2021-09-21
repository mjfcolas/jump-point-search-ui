package fr.li212.jps.ui.display;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ControlPanel extends Parent {
    public ControlPanel(
            final int xPosition,
            final int width,
            final int height) {
        Rectangle background = new Rectangle();
        background.setWidth(width);
        background.setHeight(height);
        background.setArcHeight(0);
        background.setArcWidth(0);
        background.setFill(Color.LIGHTBLUE);
        this.getChildren().add(background);
        this.setTranslateX(xPosition);

        GridPane container = new GridPane();
        container.setPadding(new Insets(10, 10, 10, 10));
        container.setVgap(5);
        container.setHgap(5);

        TextField xOrig = new TextField();
        GridPane.setConstraints(xOrig, 0, 1);
        container.getChildren().add(xOrig);

        TextField yOrig = new TextField();
        GridPane.setConstraints(yOrig, 0, 2);
        container.getChildren().add(yOrig);

        TextField xDest = new TextField();
        GridPane.setConstraints(xDest, 0, 3);
        container.getChildren().add(xDest);

        TextField yDest = new TextField();
        GridPane.setConstraints(yDest, 0, 4);
        container.getChildren().add(yDest);

        Button button = new Button("Find Path");
        GridPane.setConstraints(button, 0, 5);
        container.getChildren().add(button);
        button.setOnAction(actionEvent -> {
        });

        this.getChildren().add(container);
    }
}
