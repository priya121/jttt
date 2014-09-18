package de.fesere.tictactoe.players;

import de.fesere.tictactoe.Mark;
import de.fesere.tictactoe.Player;

public class RandomPlayerTest extends PlayerCommonTest  {
  @Override
  Player playerForCommonTests() {
    return new RandomPlayer(Mark.O);
  }
}
