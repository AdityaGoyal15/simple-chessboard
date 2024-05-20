package org.example.domain;

import java.util.Objects;

public class Cell implements Comparable<Cell> {

  private final int row;
  private final char column;

  public Cell(int row, char column) {
    this.row = row;
    this.column = column;
  }

  public int getRow() {
    return row;
  }

  public int getColumnIndex() {
    return column - 'A';
  }

  @Override
  public String toString() {
    return "" + column + row;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cell cell = (Cell) o;
    return row == cell.row && column == cell.column;
  }

  @Override
  public int hashCode() {
    return Objects.hash(row, column);
  }

  @Override
  public int compareTo(Cell cell) {
    return this.toString().compareTo(cell.toString());
  }
}
