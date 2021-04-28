public class snakeAndLadder {
	public static final int ladder = 1;
	public static final int snake = 2;
	public static void main(String args[]) {
		int position = 0;
		System.out.println("Current Position is:" + position);

		while(position < 100){
			int die = (int)Math.floor( ( ( Math.random() * 10 ) % 6) + 1);
			int choice=(int)Math.floor((Math.random()*10)%3);

			switch(choice){
			case ladder:
				System.out.println("Number on die is:" + die);
				position += die;
				if(position >= 100){
					System.out.println("Player win the game!");
				}
				else{
					System.out.println("Player got ladder, New position is:" + position);
				}
				break;
				
				case snake:
				System.out.println("Number on die is:" + die);
				position -= die;
				if(position < 0){
					position = 0;
				}
				System.out.println("Player got the snake, New position is:" + position);
				break;
				
			default:
				System.out.println("No Play, Stay at the same position:" + position);
				
			}
		}
	}

}
