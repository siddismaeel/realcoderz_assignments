class Rectangle
{
	private double length = 1;
	private double width = 1;
	
	public void setLength(double length)
	{
		this.length = length;
	}
	public double getLength()
	{
		return this.length;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	public double getWidth()
	{
		return this.width;
	}
	
	public double calculateAreaOfRectAngle()
	{
		return 2 *(length + width);
	}
}