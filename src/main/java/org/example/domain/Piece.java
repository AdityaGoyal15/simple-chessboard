package org.example.domain;

import java.util.List;

public abstract class Piece {

  protected Cell position;

  protected Piece(Cell position) {
    this.position = position;
  }

  public abstract List<Cell> getAllPossibleMoves();

  public Cell getPosition() {
    return position;
  }
}
