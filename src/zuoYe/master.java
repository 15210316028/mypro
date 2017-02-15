package zuoYe;
public class master 
{
	public void pet(pet pet)
	{
		if(pet instanceof dog)
		{
			dog dog=(dog) pet;
			dog.play();
		}
		else
		{
			qiE qq=(qiE) pet;
			qq.play();
		}					
	}
}
