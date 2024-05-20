package org.example.factory;

import org.example.domain.Cell;
import org.example.domain.Piece;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceFactoryTest {

  @Test
  void create_returns_pawn_when_called() {
    Piece pawn = PieceFactory.create("pawn", new Cell(4, 'G'));

    assertNotNull(pawn);
    Cell position = pawn.getPosition();
    assertEquals(4, position.getRow());
    assertEquals(6, position.getColumnIndex());
  }

  @Test
  void create_throws_exception_when_called_with_invalid_piece() {
    Cell cell = new Cell(4, 'G');

    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> PieceFactory.create("invalid", cell));
    assertEquals("Invalid piece", exception.getMessage());
  }
}
