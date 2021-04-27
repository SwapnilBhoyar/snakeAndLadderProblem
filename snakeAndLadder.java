public class snakeAndLadder {
	public static void main(String args[]) {
		int position = 0;
		System.out.println("Current Position is:" + position);
		int die = (int)Math.floor( ( ( Math.random() * 10 ) % 6) + 1);
		System.out.println("Number on die is:" + die);
	}

}
