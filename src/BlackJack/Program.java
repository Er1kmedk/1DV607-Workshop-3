package BlackJack;

import BlackJack.controller.*;

public class Program
{

  public static void main(String[] a_args)
  {
    PlayGame ctrl = new PlayGame();
    
    while (ctrl.Play());
  }
}