package BlackJack.model.rules;

import BlackJack.model.Card;
import BlackJack.model.Player;

class Soft17HitStrategy extends BasicHitStrategy {
	
	@Override
	public boolean DoHit(Player a_dealer) {
		if (a_dealer.CalcScore() == g_hitLimit) {
			for (Card c : a_dealer.GetHand()) {
				if (c.GetValue() == Card.Value.Ace) {
					return true;
				}
			}
		}
		return super.DoHit(a_dealer);
		
	}
}
