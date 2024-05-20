package org.example.domain;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class QueenTest {

  @Test
  void getAllPossibleMoves_returns_all_possible_moves() {
    Queen queen = new Queen(new Cell(4, 'E'));

    List<Cell> possibleMoves = queen.getAllPossibleMoves();

    assertFalse(possibleMoves.isEmpty());
    assertEquals(27, possibleMoves.size());
    assertIterableEquals(
        List.of(
            "A4", "A8", "B1", "B4", "B7", "C2", "C4", "C6", "D3", "D4", "D5", "E1", "E2", "E3",
            "E5", "E6", "E7", "E8", "F3", "F4", "F5", "G2", "G4", "G6", "H1", "H4", "H7"),
        possibleMoves.stream().sorted().map(Cell::toString).collect(Collectors.toList()));
  }
}
