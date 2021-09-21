package fr.li212.jps.ui.display;

import fr.li212.jps.ui.grid.RectangularGrid;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Display extends Application {

    private final static int CONTROL_PANEL_WIDTH = 200;

    private final static int GRID_WIDTH = 20;
    private final static int GRID_HEIGHT = 20;
    private final static int CELL_SIDE = 40;

    private final static int GRID_WIDTH_PX = CELL_SIDE * GRID_WIDTH;
    private final static int GRID_HEIGHT_PX = CELL_SIDE * GRID_HEIGHT;

    private final static int TOTAL_DISPLAY_WIDTH = GRID_WIDTH_PX + CONTROL_PANEL_WIDTH;

    private final Group root;

    public Display() {
        final RectangularGrid grid = new RectangularGrid(GRID_WIDTH, GRID_HEIGHT);
        root = new Group(
                new DisplayedGrid(grid, CELL_SIDE),
                new ControlPanel(
                        GRID_WIDTH_PX,
                        CONTROL_PANEL_WIDTH,
                        GRID_HEIGHT_PX));
    }

    @Override
    public void start(final Stage stage) {
        Scene scene = new Scene(root, TOTAL_DISPLAY_WIDTH, GRID_HEIGHT_PX, Color.LIGHTBLUE);
        stage.setScene(scene);
        stage.show();
    }
}
