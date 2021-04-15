package prak2;

import java.util.Scanner;

public class Hauptmenue {

	public Hauptmenue() {

		int stop = 0;
		Liste list = new Liste();

		Scanner sc = new Scanner(System.in);
		while (stop == 0) {

			String menueValue = "";
			System.out.println("Was wollen Sie machen?");
			String eingabe = "";

			 eingabe = sc.next();
			menueValue = eingabe;

			switch (menueValue) {
			case "read":
				list.read();
				break;
			case "write":
				break;
			case "add":
				System.out.print("Deutsch: ");
				String ger = sc.next();
				System.out.print("Englisch: ");
				String eng = sc.next();
				list.add(ger, eng);
				break;
			case "delete":
				System.out.print("Vokabel eingeben welche geloescht werden soll (auf Deutsch): ");
				String gerDel = sc.next();
				list.delete(gerDel);
				break;
			case "call":
				list.call();
				break;
			case "show":
				list.show();
				break;
			case "close":
				stop = 1;
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Eingabe fehlerhaft");
				break;
			}
		}

	}

}
