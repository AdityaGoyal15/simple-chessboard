package org.example.api;

import org.example.domain.Cell;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardApiTest {

  @Test
  void getAllPossibleMoves_returns_all_possible_moves_of_a_piece_type() {
    ChessBoardApi chessBoardApi = new ChessBoardApi();

    List<Cell> possibleMoves = chessBoardApi.getAllPossibleMoves("king", 5, 'D');

    assertFalse(possibleMoves.isEmpty());
    assertEquals(8, possibleMoves.size());
    assertIterableEquals(
        List.of("C4", "C5", "C6", "D4", "D6", "E4", "E5", "E6"),
        possibleMoves.stream().sorted().map(Cell::toString).collect(Collectors.toList()));
  }
}
