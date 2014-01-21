package candy.model;

public class MarshmallowCreature
{
	// Declaration Section
	private int legs;
	private int arms;
	private int eyes;
	private boolean hasButton;
	private String name;

	public void setLegs(int legs)
	{
		this.legs = legs;
	}

	public void setArms(int arms)
	{
		this.arms = arms;
	}

	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}

	public void setHasButton(boolean hasButton)
	{
		this.hasButton = hasButton;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getLegs()
	{
		return legs;
	}

	public int getArms()
	{
		return arms;
	}

	public int getEyes()
	{
		return eyes;
	}

	public boolean getHasButton()
	{
		return hasButton;
	}

	public String getName()
	{
		return name;
	}

	/**
	 * Default constructor for the MarshmallowCreature - Do not use.
	 */
	public MarshmallowCreature()
	{
		arms = 4;
		legs = 4 ;
		eyes = 4 ;
		name = "Bob";
		hasButton = false;
	}

	/**
	 * Creates a MarshmallowCreature with the specified parameters
	 * 
	 * @param name
	 *            The name of the creature.
	 * @param hasButton
	 *            Whether the creature has a button.
	 * @param eyes
	 *            How many eyes the creature has.
	 * @param arms
	 *            How many arms the creature has.
	 * @param legs
	 *            How many legs the creature has.
	 */
	public MarshmallowCreature(String name, boolean hasButton, int eyes,
			int arms, int legs)
	{
		this.name = name;
		this.legs = legs;
		this.eyes = eyes;
		this.arms = arms;
		this.hasButton = hasButton;
	}
}
