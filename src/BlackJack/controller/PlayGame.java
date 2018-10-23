package BlackJack.controller;

import BlackJack.view.IView;
import BlackJack.view.SimpleView;
import BlackJack.model.Game;
import BlackJack.model.ICardGiven;

public class PlayGame implements ICardGiven {
	private Game a_game;
	private IView a_view;
	
	public PlayGame()
	{
		a_game = new Game();
		a_view = new SimpleView();
		
		a_game.addSubscriber(this);
	    a_view.DisplayWelcomeMessage();
	}
  public boolean Play() {
   
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

@Override
	public void CardGiven() {
		a_view.DisplaySpaces();
		a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
		a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());	
		a_view.DisplayWelcomeMessage();
	}
}