package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

  protected Pawn(Cell position) {
    super(position);
  }

  @Override
  public List<Cell> getAllPossibleMoves() {
    List<Cell> possibleMoves = new ArrayList<>();
    int currentRow = position.getRow();
    int currentColumnIndex = position.getColumnIndex();

    int nextRow = currentRow + 1;
    if (nextRow <= 8) {
      possibleMoves.add(new Cell(nextRow, (char) (currentColumnIndex + 'A')));
    }

    return possibleMoves;
  }
}
