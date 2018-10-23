package BlackJack.controller;

import BlackJack.view.IView;
import BlackJack.model.Game;

public class PlayGame {

  public boolean Play(Game a_game, IView a_view) {
    a_view.DisplayWelcomeMessage();
    
    a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
    a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());

    if (a_game.IsGameOver())
    {
        a_view.DisplayGameOver(a_game.IsDealerWinner());
    }

    a_view.GetInput();
    
    if (a_view.wantsToStartNewGame())
    {
        a_game.NewGame();
    }
    else if (a_view.wantsToHit())
    {
        a_game.Hit();
    }
    else if (a_view.wantsToStand())
    {
        a_game.Stand();
    }
    else if (a_view.wantsToQuit()) {
    	return false;
    }

    return true;
  }
}