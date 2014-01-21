package candy.conroller;

import candy.model.MarshmallowCreature;

public class CandyController
{
	private MarshmallowCreature myCreature;

	public void start()
	{
			makeMonster();
	}
		
		private void makeMonster()
		{
			myCreature = new MarshmallowCreature("Bob", false, 4, 4, 4);
		}
	
}
