package prak2;

import java.io.IOException;
import java.util.Scanner;

public class Hauptmenue {

	/**
	 * Oeffnet bei verschiedenen Konsolenabfragen verschiedene Methoden
	 */
	public Hauptmenue() throws IOException {

		Liste list = new Liste();

		Scanner sc = new Scanner(System.in);
		while (true) {

			String menueValue = "";
			System.out.println("Was wollen Sie machen?\nGeben Sie einen Befehl ein.\nGeben Sie help für \"Hilfe\" ein");
			String eingabe = "";

			eingabe = sc.nextLine();
			menueValue = eingabe;

			switch (menueValue) {
			case "read":
				System.out.println("Aus welcher Datei soll gelesen werden?");
				String readFile = sc.nextLine();
				list.read(readFile);
				break;
			case "write":
				System.out.println("In welche Datei soll geschrieben werden?");
				String writeFile = sc.nextLine();
				list.write(writeFile);
				break;
			case "add":
				System.out.print("Deutsch: ");
				String ger = sc.nextLine();
				System.out.print("Englisch: ");
				String eng = sc.nextLine();
				list.add(ger, eng);
				break;
			case "delete":
				System.out.print("Vokabel eingeben welche geloescht werden soll (auf Deutsch): ");
				String gerDel = sc.nextLine();
				list.delete(gerDel);
				break;
			case "call":
				list.call();
				break;
			case "show":
				list.show();
				break;
			case "close":
				System.out.println("Juhu, dieses coole Programm wird jetzt beendet :)))))");
				sc.close();
				System.exit(0);
				break;
			case "help":
				System.out.println(
						"Befehle:\nread -> Datei auslesen und Vokabeln zur Liste hinzufuegen\nwrite -> Liste in einer Datei sichern\nadd -> Datei zur Liste hinzufuegen\ndelete -> Datei aus der Liste loeschen\ncall -> Vokabeln aus der Liste abfragen\nshow -> Alle Vokabeln in der Liste anzeigen\nclose -> Programm beenden\n");
				break;
			default:
				System.out.println("Eingabe fehlerhaft");
				break;
			}
		}

	}

}
