package cardgame;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	
	public void Deckcreator(String[] rank,String[] suit, int[] pointvalue )
	{
		for(int x=0;x< rank.length;x++)
		{
			for(int y=0;y<suit.length;y++)
			{
				for(int z=0;y<pointvalue.length;y++)
				{
					Card push= new Card(rank[x],suit[y],pointvalue[z]);
					unDealt.add(push);
				}//
			}
		}
	}
	
}
