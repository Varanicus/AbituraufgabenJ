package caesar;

public class Ceasar {
	
	public static String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};


	public static void main(String[] args) {
	
		caesar("ZAUN");
		System.out.println("TEst");
	}
	
	public static String caesar(String klartext){
		String text=klartext;
		String[] Atext= text.split("");

		int i=0;
		while(i<27) {
			
			if(Atext[0]==alphabet[i]) {
				System.out.println("Z");
			}
		}


		return text;
	}

}
