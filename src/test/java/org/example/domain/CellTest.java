package org.example.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellTest {

  @Test
  void getRow_returns_row_number() {
    Cell g1 = new Cell(1, 'G');

    assertEquals(1, g1.getRow());
  }

  @Test
  void getColumnIndex_returns_column_index() {
    Cell g1 = new Cell(1, 'G');

    assertEquals(6, g1.getColumnIndex());
  }

  @Test
  void toString_returns_name_of_the_cell() {
    Cell g1 = new Cell(1, 'G');

    assertEquals("G1", g1.toString());
  }

  @Test
  void compareTo_returns_negative_value_when_G4_is_compared_with_E5() {
    Cell g4 = new Cell(4, 'G');
    Cell e5 = new Cell(5, 'E');

    assertTrue(e5.compareTo(g4) < 0);
  }

  @Test
  void compareTo_returns_positive_value_when_E5_is_compared_with_G4() {
    Cell g4 = new Cell(4, 'G');
    Cell e5 = new Cell(5, 'E');

    assertTrue(g4.compareTo(e5) > 0);
  }

  @Test
  void compareTo_returns_zero_when_two_equal_cells_are_compared() {
    Cell g41 = new Cell(4, 'G');
    Cell g42 = new Cell(4, 'G');

    assertEquals(0, g41.compareTo(g42));
  }
}
