package org.example.domain;

import java.util.Arrays;

public enum PieceType {
  PAWN("pawn"),
  KING("king"),
  QUEEN("queen");

  private final String type;

  PieceType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public static PieceType fromType(String type) {
    return Arrays.stream(PieceType.values())
        .filter(pieceType -> pieceType.type.equals(type.toLowerCase()))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("Unknown piece type: " + type));
  }
}
