public class Phone implements Comparable
{
	private String brandName;
	private String modelName;
	private int price;
	public void setBrandName(String brandName)
	{
		this.brandName=brandName;
	}
	public void setModelName(String modelName)
	{
		this.modelName=modelName;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public String getBrandName()
	{
		return brandName;
	}
	public String getModelName()
	{
		return modelName;
	}
	public int getPrice()
	{
		return price;
	}

	public int compare(Phone a , Phone b) {
		return 0;
	}

	public int compareTo(Object obj) {
		return 0;
	}

}