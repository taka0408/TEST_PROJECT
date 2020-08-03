public class Main {
  public static void main(String[] args) {
	  System.out.println("[じゃんけん]: 0:グー 1:チョキ 2:パー");

	 //じゃんけんの手
	  final int GU    = 0;
	  final int CHOKI = 1;
	  final int PA    = 2;

	  String GU   ="グー";
	  String CHOKI="チョキ";
	  String PA   ="パー;"

	  //人間（あなた）とCPU（相手）
	  int PLAYER = new java.util.Scanner(System.in).nextInt();
	  int CPU =new java.util.Random().nextInt(2);

	  /*勝ちの場合
	  //あなた(PLAYER)：パー(2)(0) 　相手(CPU)
	  			   	  チョキ(1)(2)
	  			   	    グー(0)(1) */


	  System.out.println("あなた:"+you);
	  System.out.println("相手:"+r);
	  System.out.println("結果:WIN");

	  /*負けの場合
	  //あなた(you)：パー(2)(1) 　相手
	  			   チョキ(1)(0)
	  			   	 グー(0)(2) */
	  }else if(you < r) {
		  System.out.println("あなた:"+you);
		  System.out.println("相手:"+r);
		  System.out.println("結果:♡Lose♡");

		  //あいこの場合
		  default(you == r){
		  System.out.println("あなた:"+you);
		  System.out.println("相手:"+r);
		  System.out.println("結果:DRAW");

	  }
  	}
 }