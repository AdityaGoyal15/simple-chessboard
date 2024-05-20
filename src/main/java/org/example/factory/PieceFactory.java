package org.example.factory;

import org.example.domain.Cell;
import org.example.domain.King;
import org.example.domain.Pawn;
import org.example.domain.Piece;
import org.example.domain.Queen;

public class PieceFactory {

  public static Piece create(String piece, Cell position) {
    switch (piece.toLowerCase()) {
      case "pawn" -> {
        return new Pawn(position);
      }
      case "queen" -> {
        return new Queen(position);
      }
      case "king" -> {
        return new King(position);
      }
      default -> throw new IllegalArgumentException("Invalid piece");
    }
  }
}
