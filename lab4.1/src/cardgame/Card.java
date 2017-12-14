package cardgame;

public class Card{
	private String rank;
	private String suit;
	private int pointvalue;
	
	public Card(String rank,String suit, int pointvalue)
	{
		this.rank=rank;
		this.suit=suit;
		this.pointvalue=pointvalue;
	}
	public String getrank()
	{
		return this.rank;
	}
	public String getsuit()
	{
		return this.suit;
	}
	public int getpointvalue()
	{
		return this.pointvalue;
	}
	public boolean equals(Card otherCard)
	{
		if(this.rank==otherCard.getrank() && this.suit==otherCard.getsuit()&&this.pointvalue==otherCard.getpointvalue())
		{
			return true;
		}
		return false;
	}
	public String toString()
	{
		return this.rank+this.suit+this.pointvalue;			
	}
}
