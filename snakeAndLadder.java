public class snakeAndLadder {
	public static final int ladder=1;
	public static final int snake=2;
	public static void main(String args[]) {
		int position = 0;
		System.out.println("Current Position is:" + position);
		int die = (int)Math.floor( ( ( Math.random() * 10 ) % 6) + 1);
		int choice=(int)Math.floor((Math.random()*10)%3);
		System.out.println("Number on die is:" + die);

		switch(choice){
		case ladder:
			System.out.println("Current position is:" + position);
			position += die;
			System.out.println("Player got ladder, New position is:" + position);
			break;
			
		case snake:
			System.out.println("Current position is:" + position);
			position -= die;
			System.out.println("Player got the snake, New position is:" + position);
			break;
			
		default:
			System.out.println("No Play, Stay at the same position:" + position);
			
		}
	}

}
