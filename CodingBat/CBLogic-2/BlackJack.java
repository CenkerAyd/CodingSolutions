package Logic_2;
//https://codingbat.com/prob/p117019
public class BlackJack {
    public int blackJack(int a,int b){
      if (a>21 && b>21)return 0;
      if (a>b){
          if (a>21)return b;
          return a;
      }
      if (b>21)return a;
      return b;
    }
}
