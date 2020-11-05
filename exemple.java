import java.util.Scanner;

public class exemple {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("\033[31m" + "Introduce un numero" + "\u001B[0m");
		int usrNum = scanner.nextInt();

		for (int i = 0; i <= 10; i++) {
			int multiply = (i * usrNum);
			System.out.println("\033[32m" + usrNum + " x " + i + " = " + multiply);
		}
	}
}

