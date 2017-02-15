package zuoYe;

public abstract class pet 
{	
	private int health;
	private int love;
	public pet()
	{
		this.health=100;
		this.love=0;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public abstract void play();
}	
