package BlackJack.model.rules;

import BlackJack.model.Player;

public interface IWhoWinStrategy {

	boolean isDealerWinner(Player a_Dealer, Player aPlayer);
}
