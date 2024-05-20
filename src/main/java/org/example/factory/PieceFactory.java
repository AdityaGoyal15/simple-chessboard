package org.example.factory;

import org.example.domain.Cell;
import org.example.domain.King;
import org.example.domain.Pawn;
import org.example.domain.Piece;
import org.example.domain.PieceType;
import org.example.domain.Queen;

public class PieceFactory {

  public static Piece create(String pieceType, Cell position) {
    PieceType type = PieceType.fromType(pieceType);

    switch (type) {
      case PAWN -> {
        return new Pawn(position);
      }
      case QUEEN -> {
        return new Queen(position);
      }
      case KING -> {
        return new King(position);
      }
      default ->
          throw new IllegalArgumentException(
              "Unable to create and return object of : " + pieceType);
    }
  }
}
