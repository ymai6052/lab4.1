package cardgame;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	
	public void Deck(String[] rank,String[] suit, int[] pointvalue )
	{
		for(int x=0;x< rank.length;x++)
		{
			for(int y=0;y<suit.length;y++)
			{
				for(int z=0;y<pointvalue.length;y++)
				{
					Card push= new Card(rank[x],suit[y],pointvalue[z]);
					unDealt.add(push);
				}
			}
		}
	}
	public boolean isEmpty()
	{
		return unDealt.size()==0;
	}
	public int size()
	{
		return unDealt.size();
	}
	public Card deal()
	{
		Card x=unDealt.get((int)(Math.random()*unDealt.size()));
		Dealt.add(x);
		return x;
	}
	public void shuffle()
	{
		while(Dealt.size()>0)
		{
			unDealt.add(Dealt.get(0));
			Dealt.remove(0);
		}
		for(int k=51;k>0;k++)
		{
			int index=(int)(Math.random()*k);
			Card holder=Dealt.get(k);
			Dealt.set(k,Dealt.get(index));
			Dealt.set(index,holder);
		}
	}
}
