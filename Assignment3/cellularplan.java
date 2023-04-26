package Assignment3;

abstract public class cellularplan
{
	protected double rate;
	abstract void getRate();
	public void processBill(int minutes)
	{
	System.out.println(minutes*rate);
	}
}
