package elseif;

public class Potatoes {

	public static void main(String[] args) {
		
		for (int i = 1; i < 9; i++) {
			if (i-8==0) {
				System.out.println("more");
			}
			else if (i-4!=0) {
				System.out.println(i+ " potato");
			}
			else if (i-4==0) {
				System.out.println(i);
			}
			
		}
	}
}