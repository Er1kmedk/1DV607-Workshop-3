package BlackJack.model.rules;

public class RulesFactory {

  public IHitStrategy GetHitRule() {
    //return new BasicHitStrategy();
    return new Soft17HitStrategy();
  }

  public INewGameStrategy GetNewGameRule() {
    return new AmericanNewGameStrategy();
  }
  
  public IWhoWinStrategy GetWinRule() {
	  return new DealerWinRule();
	  //return new PlayerWinRule();
  }
}