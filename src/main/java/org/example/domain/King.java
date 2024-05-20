package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {

  protected King(Cell position) {
    super(position);
  }

  @Override
  public List<Cell> getAllPossibleMoves() {
    List<Cell> possibleMoves = new ArrayList<>();
    int currentRow = position.getRow();
    int currentColumnIndex = position.getColumnIndex();
    int[] rowOffsets = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] colOffsets = {-1, 0, 1, -1, 1, -1, 0, 1};

    for (int i = 0; i < 8; i++) {
      int nextRow = currentRow + rowOffsets[i];
      int nextColumn = currentColumnIndex + colOffsets[i];

      if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 0 && nextColumn < 8) {
        possibleMoves.add(new Cell(nextRow, (char) (nextColumn + 'A')));
      }
    }

    return possibleMoves;
  }
}
