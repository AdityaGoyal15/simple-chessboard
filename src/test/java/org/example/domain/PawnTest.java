package org.example.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PawnTest {

  @Test
  void getAllPossibleMoves_returns_all_possible_moves() {
    Pawn pawn = new Pawn(new Cell(1, 'G'));

    List<Cell> possibleMoves = pawn.getAllPossibleMoves();

    assertEquals(1, possibleMoves.size());
    assertNotNull(possibleMoves.get(0));
    assertEquals("G2", possibleMoves.get(0).toString());
  }

  @Test
  void getAllPossibleMoves_does_not_return_any_moves_when_current_position_is_in_the_last_row() {
    Pawn pawn = new Pawn(new Cell(8, 'G'));

    List<Cell> possibleMoves = pawn.getAllPossibleMoves();

    assertEquals(0, possibleMoves.size());
  }
}
