package prak2;

import java.util.Iterator;
import java.util.Scanner;

public class Liste {

	private Element first;

	public Liste() {
		first = null;

	}

	public Element last(Element first) {
		Element current = first;
		if (current == null) {
			return current;
		}
		while (current.getNext() != null) {
			current = current.getNext();

		}
		return current;

	}

	public void add(String ger, String eng) {
		Element last = last(first);
		Element newElem = new Element();

		if (first == null) {
			first = newElem;
		} else if (last.getNext() == null) {
			last.setNext(newElem);
			newElem.setPrev(last);
		}
		newElem.setGer(ger);
		newElem.setEng(eng);
		System.out.println(ger + " , " + eng + " hinzugefuegt");

	}

	public void delete(String elem) {
		Element current = first;
		// Ueberpruefen ob Liste leer ist
		if (first == null) {
			System.out.println("Die Liste ist leer :)");
		} else {
			while (current != null) {
				if (current.ger.equals(elem)) {
					// schauen obs das letzte Element ist
					if (current.next == null) {
						// schauen obs das letzte und erste element ist
						if (current.prev == null) {
							current = null; // TODO Klappt noch nicht :( @Florian fragen :(
							System.out.println("Das einzige Element geloescht. Die Liste ist jetzt leer :)");
							break;
						} else {
							current.prev.next = null;
							current = null;
							System.out.println("Das letzte Element geloescht :)");
							break;
						}
					} else {

						current.prev.next = current.next;
						current.prev.next = current.next;
						current.next.prev = current.prev.next;
						current.next.prev = current.prev.next;
						current.ger = null;
						current.eng = null;
						System.out.println("Element geloescht :)");
					}

				}
				current = current.next;

			}
		}
	}

	public void show() {
		Element current = first;
		if (first == null) {
			System.out.println("Die Liste ist leer");

		} else {
			int i = 1;
			while (current != null) {
				System.out.println(i + ", Ger: " + current.ger + ", Eng: " + current.eng);
				current = current.next;
				i++;
			}
		}
	}

	public Element get(int i) {
		Element e = first;
		for (int j = 0; j < i; j++) {
			e = e.next;

		}
		return e;
	}

	public void call() {
		Scanner sc = new Scanner(System.in);
		int zaehler = 0, rdm = 0, rdmLang = 0;
		rdmLang = (int) ((Math.random() * 2) + 1);
		Element current = first;
		if (current == null) {
			System.out.println("Sie koennen nichts abfragen. Die liste ist leer :)");
			return;
		} else {
			while (current.next != null) {
				current = current.next;
				zaehler++;
			}
			zaehler++;
			current = first;

		}

		rdm = (int) ((Math.random() * (zaehler - 1)) + 1);

		if (rdmLang == 1) {
			for (int i = 1; i < rdm; i++) {
				current = current.next;
			}
			System.out.println("Was ist das englische Wort zu: " + current.ger + " ?");
			String input = sc.next();
			if (current.eng.equals(input)) {
				System.out.println("Richtig :) " + current.ger + " - " + current.eng);
			} else {
				System.out.println("Das ist leider falsch :( Richtig waere: " + current.ger + " - " + current.eng);
			}
			current = first;

		} else if (rdmLang == 2) {
			for (int i = 1; i < rdm; i++) {
				current = current.next;
			}
			System.out.println("Was ist das deutsche Wort zu: " + current.eng + " ?");
			String input = sc.next();
			if (current.ger.equals(input)) {
				System.out.println("Richtig :) " + current.ger + " - " + current.eng);
			} else {
				System.out.println("Das ist leider falsch :( Richtig waere: " + current.ger + " - " + current.eng);
			}
			current = first;

		}		
	}

}
