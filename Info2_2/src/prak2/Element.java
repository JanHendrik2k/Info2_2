package prak2;

public class Element {

	String ger, eng;
	int value = 0;
//	int id = 0;
	Element prev;
	Element next;



	public Element() {
	
	}

//	public int getId() {
//		return id;
//	}
//	
//	
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getGer() {
		return ger;
	}


	public void setGer(String ger) {
		this.ger = ger;
	}


	public String getEng() {
		return eng;
	}


	public void setEng(String eng) {
		this.eng = eng;
	}


	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Element getPrev() {
		return prev;
	}

	public void setPrev(Element prev) {
		this.prev = prev;
	}

	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}
}
