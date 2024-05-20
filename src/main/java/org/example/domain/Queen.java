package org.example.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Queen extends Piece {

  protected Queen(Cell position) {
    super(position);
  }

  @Override
  public List<Cell> getAllPossibleMoves() {
    List<Cell> possibleMoves = new ArrayList<>();
    int currentRow = position.getRow();
    int currentColumnIndex = position.getColumnIndex();

    IntStream.range(0, 8)
        .forEach(
            i -> {
              if (currentColumnIndex != i) {
                possibleMoves.add(new Cell(currentRow, (char) (i + 'A')));
              }
              if (currentRow != i + 1) {
                possibleMoves.add(new Cell(i + 1, (char) (currentColumnIndex + 'A')));
              }
            });

    IntStream.range(1, 8)
        .forEach(
            i -> {
              if (currentColumnIndex + i < 8 && currentRow + i <= 8) {
                possibleMoves.add(new Cell(currentRow + i, (char) (currentColumnIndex + i + 'A')));
              }
              if (currentColumnIndex - i >= 0 && currentRow + i <= 8) {
                possibleMoves.add(new Cell(currentRow + i, (char) (currentColumnIndex - i + 'A')));
              }
              if (currentColumnIndex + i < 8 && currentRow - i > 0) {
                possibleMoves.add(new Cell(currentRow - i, (char) (currentColumnIndex + i + 'A')));
              }
              if (currentColumnIndex - i >= 0 && currentRow - i > 0) {
                possibleMoves.add(new Cell(currentRow - i, (char) (currentColumnIndex - i + 'A')));
              }
            });

    return possibleMoves;
  }
}
