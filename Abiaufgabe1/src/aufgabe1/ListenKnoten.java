package aufgabe1;

public class ListenKnoten<T>{

	public T daten;
	public ListenKnoten<T> nachfolger;
	
	public ListenKnoten(T daten, ListenKnoten<T> nachfolger) {
		this.daten=daten;
		this.nachfolger=nachfolger;
		
	}
}
