package BlackJack.model.rules;

import BlackJack.model.Player;

public class PlayerWinRule implements IWhoWinStrategy {

	@Override
	public boolean isDealerWinner(Player a_Dealer, Player a_Player) {
		if (a_Dealer.CalcScore() == a_Player.CalcScore()) {return false;}
		return true;
	}

}
