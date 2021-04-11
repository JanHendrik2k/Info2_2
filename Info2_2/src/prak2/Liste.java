package prak2;

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
		}
		else if (last.getNext() == null) {
			last.setNext(newElem);
			newElem.setPrev(last);
		}
		newElem.setGer(ger);
		newElem.setEng(eng);
		System.out.println(ger + " , " + eng + " hinzugefuegt");
		
		
	}

	public Element get(int i) {
		Element e = first;
		for (int j = 0; j < i; j++) {
			e = e.next;

		}
		return e;
	}

}
