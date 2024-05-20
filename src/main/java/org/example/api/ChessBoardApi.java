package org.example.api;

import org.example.domain.Cell;
import org.example.domain.Piece;
import org.example.factory.PieceFactory;

import java.util.List;

public class ChessBoardApi {

  public List<Cell> getAllPossibleMoves(String pieceType, int row, char column) {
    Piece piece = PieceFactory.create(pieceType, new Cell(row, column));

    return piece.getAllPossibleMoves();
  }
}
