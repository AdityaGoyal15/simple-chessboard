package org.example.domain;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class KingTest {

  @Test
  void getAllPossibleMoves_returns_all_possible_moves() {
    King king = new King(new Cell(5, 'D'));

    List<Cell> possibleMoves = king.getAllPossibleMoves();

    assertFalse(possibleMoves.isEmpty());
    assertEquals(8, possibleMoves.size());
    assertIterableEquals(
        List.of("C4", "C5", "C6", "D4", "D6", "E4", "E5", "E6"),
        possibleMoves.stream().sorted().map(Cell::toString).collect(Collectors.toList()));
  }
}
