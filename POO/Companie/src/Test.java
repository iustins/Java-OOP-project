import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Angajat a = new Angajat();
		Scanner scanner = new Scanner(System.in);
		System.out.println("CNP");
		a.setCNP(scanner.next());
		System.out.println("Nume");
		a.setName(scanner.next());
		System.out.println("Prenume");
		a.setPrenume(scanner.next());
		System.out.println("Salariu");
		a.setSalariu(scanner.nextDouble());
		scanner.close();
	}
}
