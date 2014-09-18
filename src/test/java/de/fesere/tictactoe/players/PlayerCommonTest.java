package de.fesere.tictactoe.players;

import de.fesere.tictactoe.Board;
import de.fesere.tictactoe.Player;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public abstract class PlayerCommonTest {
  abstract Player playerForCommonTests();

  @Test
  public void testReducesTheNumberOfMoves() {
    Board board = new Board();
    Player player = playerForCommonTests();
    Board newBoard = player.performMove(board);

    int oldSize = board.getPossibleMoves().size();
    assertThat(newBoard.getPossibleMoves().size(), is(oldSize-1));

  }
}
