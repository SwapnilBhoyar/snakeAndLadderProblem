public class snakeAndLadder {
	public static final int ladder = 1;
	public static final int snake = 2;
	public static int dieCount = 0;
	public int runGame(int player){
		int die = (int)Math.floor( ( ( Math.random() * 10 ) % 6) + 1);
		dieCount++;
		int choice=(int)Math.floor(( Math.random() * 10) % 3);

		switch(choice){
			case ladder:
			System.out.println("Number on die is:" + die);
			player += die;
			if(player > 100){
				player -= die;
				int remaining = 100 - player;
				System.out.println("Player needs exact " + remaining + " on die to win!");
			}
			else{
				System.out.println("Player got ladder and one more play, New position is:" + player);
			}
			break;
			
			case snake:
			System.out .println("Number on die is:" + die);
			player -= die;
			if(player < 0){
				player = 0;
			}
			System.out.println("Player got the snake, New position is:" + player);
			break;
			
			default:
			System.out.println("No Play, Stay at the same position:" + player);
			
		}
	if(choice == ladder){
		return runGame(player);
	}
	else
		return player;
	}

	public static void main(String args[]){
		int player1 = 0 , player2 = 0;
		snakeAndLadder snakeLadderObject = new snakeAndLadder();

		while(player1 != 100 && player2 != 100){
			player1=snakeLadderObject.runGame(player1);
			System.out.println("player1 current position is:" + player1);
			player2=snakeLadderObject.runGame(player2);
			System.out.println("player2 current position is:" + player2);
		}
		if(player1 == 100){
			System.out.println("player1 win the game");
		}
		else if(player2 == 100){
			System.out.println("player2 win the game");
		}

		System.out.println("Total number of times Die played is:" + dieCount);
	}

}
