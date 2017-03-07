public class Toyota implements Location
{
	double x; 
	double y; 
	
	public Toyota(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public int getID()
	{
		return 1 + (int)(Math.random() * 999999);
	}
		
	public void move(int x, int y)
	{
		this.x += x;
		this.y += y;
	}
		
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}
	
}