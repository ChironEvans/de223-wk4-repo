package weekFour;

public class Main4 {

	public static void main(String[] args) {
		int[] numbers = {11,22,33};
		System.out.println(numbers[1]);
		
		for (int n : numbers) {
			System.out.println(n);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + "=" + numbers[i]);
		}
		
		int[] numbers2 = new int[4];
		numbers2[0] = 111;
		numbers2[1] = 222;
		numbers[2] = 333;
		numbers[3] = 444;
		System.out.println(numbers2[0]);
	}

}
