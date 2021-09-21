package fr.li212.jps.ui.display;

import fr.li212.jps.ui.grid.Cell;
import fr.li212.jps.ui.grid.RectangularGrid;
import fr.li212.jps.ui.grid.RectangularGridEventListener;
import javafx.scene.Parent;

import java.util.HashMap;
import java.util.Map;

public class DisplayedGrid extends Parent implements RectangularGridEventListener {

    private final RectangularGrid grid;
    private final Map<Cell, DisplayedCell> fxCells = new HashMap<>();

    public DisplayedGrid(final RectangularGrid grid, final int sideSize) {
        this.grid = grid;
        this.addAllCells(grid, sideSize);
    }

    private void addAllCells(final RectangularGrid grid, final int sideSize) {
        grid.getCells().values().forEach(cell -> {
            final DisplayedCell displayedCell = new DisplayedCell(cell, sideSize);
            fxCells.put(cell, displayedCell);
            this.getChildren().add(displayedCell);
        });

    }

}
