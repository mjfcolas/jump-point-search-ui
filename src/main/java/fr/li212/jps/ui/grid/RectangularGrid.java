package fr.li212.jps.ui.grid;

import lombok.Getter;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Getter
public class RectangularGrid {

    final Map<Coordinates, Cell> cells;

    public RectangularGrid(
            final int width,
            final int height) {
        cells = IntStream.range(0, width).boxed()
                .flatMap(x -> IntStream.range(0, height).boxed()
                        .map(y -> new Cell(new Coordinates(x, y)))).collect(Collectors.toMap(
                        Cell::getCoordinates,
                        cell -> cell
                ));
    }
}
