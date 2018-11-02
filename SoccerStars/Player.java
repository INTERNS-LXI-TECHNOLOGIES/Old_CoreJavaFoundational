class Player
{
	private String name;
	private int age;
	private String position;
	private String nation;
    private int rating;	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setPosition(String position)
	{
		this.position=position;
	}
	public void setNation(String country)
	{
		this.nation=country;
	}
	public void setRating(int rating)
	{
		this.rating=rating;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getPosition()
	{
		return position;
	}
	public String getNation()
	{
		return nation;
	}
	public int getRating()
	{
		return rating;
	}
	public void printDetails()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Position:"+this.position);
		System.out.println("Rating:"+this.rating);
		System.out.println("Nation:"+this.nation);
	}
	
	
}