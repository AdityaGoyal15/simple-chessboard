package org.example;

import org.example.api.ChessBoardApi;
import org.example.domain.Cell;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the type of chess piece (e.g., Pawn, Queen, King): ");
    String pieceType = scanner.nextLine();
    System.out.print("Enter the position of the piece (e.g., G1): ");
    String positionInput = scanner.nextLine();
    int row = Character.getNumericValue(positionInput.charAt(1));
    char column = positionInput.charAt(0);

    ChessBoardApi api = new ChessBoardApi();
    List<Cell> possibleMoves = api.getAllPossibleMoves(pieceType, row, column);

    System.out.println(
        "Possible moves: "
            + possibleMoves.stream()
                .sorted()
                .map(Cell::toString)
                .collect(Collectors.joining(", ")));
  }
}
