package prak2;

public class Liste {

	Element first;
	Element last;
	
	public Liste(Element first, Element last) {
		this.first = first;
		this.last = last;
		
		this.first.prev = null;
		this.first.next = this.last;
		
		this.last.next = null;
		this.last.prev = this.first;
	}
	
	public void add(Element e) {
		last.next = e;
		e.prev = last;
		last = e;
		
	}
	
	public Element get(int i) {
		Element e = first;
		for (int j = 0; j < i; j++) {
			e = e.next;
			
		}
		return e;		
	}
	
}
