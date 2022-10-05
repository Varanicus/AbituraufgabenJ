package aufgabe1;


//A)
public class ListenKnoten<T>{

	public T daten;
	public ListenKnoten<T> nachfolger;
	
	public ListenKnoten(T daten, ListenKnoten<T> nachfolger) {
		this.daten=daten;
		this.nachfolger=nachfolger;
		
	}
}

//B)
/*
public void enqueue(T x) {
	dieListe.anhaengen(x);
}


public T dequeue() {
	T x=dieListe.get(0);
	dieListe.entferneBei(0);
	return x;	
}*/

//C)
/*
 
public void anhaengen(T val){
    
    if(anhaengen == null) {                                  //für denn fall das die Liste leer ist
       anfang = new ListenKnoten<T>(val, null);
    }else{                                                   
    ListenKnoten<T> k = anfang;
    while (k.nachfolger != null){
    k=k.nachfolger;
    }
    k.nachfolger = new ListenKnoten<T>(val, null);
    }
}
 */
