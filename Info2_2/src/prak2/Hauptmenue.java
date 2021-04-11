package prak2;

import java.util.Scanner;

public class Hauptmenue {

	public Hauptmenue() {

		int test = 0;
		while (test == 0) {
			String menueValue = "";
			System.out.println("Was wollen Sie machen?");

			Scanner sc = new Scanner(System.in);
			String eingabe = sc.next();
			menueValue = eingabe;

			switch (menueValue) {
			case "einlesen":
				System.out.println("1");
				break;
			case "speichern":
				System.out.println("2");
				break;
			case "hinzufuegen":
				System.out.println("3");
				break;
			case "loeschen":
				System.out.println("4");
				break;
			case "abfragen":
				System.out.println("5");
				break;
			case "anzeigen":
				System.out.println("6");
				break;
			default:
				System.out.println("Eingabe fehlerhaft");
				test = 1;
				break;
			}
		}

	}

}
