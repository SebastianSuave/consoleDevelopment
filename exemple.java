import java.util.Scanner;

public class exemple {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("\033[31m" + "Introduce un numero" + "\u001B[0m");
		//Ask for a number
		int usrNum = scanner.nextInt();

		if(usrNum >= 0 && usrNum <=10){
			for (int i = 0; i <= 10; i++) {
				int multiply = (i * usrNum);
				System.out.println("\033[32m" + usrNum + " x " + i + " = " + multiply + "\u001B[0m");
			}
		} else {
			System.out.println("\033[34m" + "Del 1-10 porfavor, cara alcachofa");
		}
	}
}

