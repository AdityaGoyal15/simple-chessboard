package org.example.domain;

import org.junit.jupiter.api.Test;

import static org.example.domain.PieceType.KING;
import static org.junit.jupiter.api.Assertions.*;

class PieceTypeTest {

  @Test
  void getType_returns_type_of_piece_type() {
    assertEquals("king", KING.getType());
  }

  @Test
  void fromType_returns_enum_value_of_piece_type() {
    PieceType king = PieceType.fromType("King");

    assertEquals(KING, king);
  }

  @Test
  void fromType_throws_exception_when_called_with_unknown_piece_type() {
    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> PieceType.fromType("Unknown"));

    assertEquals("Unknown piece type: Unknown", exception.getMessage());
  }
}
