package prak2;

public class Element {
	
	String word;
	int value;
	Element prev;
	Element next;
	
	public Element(String word) {
		this.word= word;
	}
	
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
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
