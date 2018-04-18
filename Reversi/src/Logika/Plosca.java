package Logika;

public class Plosca {
	
	public final static int velikost = 8;
	
	protected Polje[][] polja;
	
	{
		//Velikost plosce mora biti zaradi za�etne pozicije VEDNO sodo �tevilo.
		assert(Plosca.velikost % 2 == 0);
	}
	
	public Plosca(){
		polja = new Polje[Plosca.velikost][Plosca.velikost];
		for (int i = 0; i < Plosca.velikost; i++){
			for (int j = 0; j < Plosca.velikost; j++){
				polja[i][j] = new Polje(i, j);
			}
		}
	}

}
