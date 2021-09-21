package fr.li212.jps.ui.display;

import fr.li212.jps.ui.grid.Cell;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = {"underlyingCell"}, callSuper = false)
public class DisplayedCell extends Rectangle {

    final Cell underlyingCell;

    public DisplayedCell(final Cell underlyingCell, final int sideSize) {
        super(
                underlyingCell.getCoordinates().getX() * sideSize,
                underlyingCell.getCoordinates().getY() * sideSize,
                sideSize,
                sideSize);
        this.setFill(Color.GREEN);
        this.setStrokeType(StrokeType.INSIDE);
        this.setStroke(Color.BLACK);

        this.underlyingCell = underlyingCell;
    }
}
