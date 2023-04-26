enum House
{
	oneBHK(23),
	twoBHK(35),
	threeBHK(42);
	private int price;
	House(int p) { price =p;}
	int getPrice(){return price;}

	public static void main(String[] args)
	{
	System.out.println("all house prices");
	for(House h: House.values())
	System.out.println(h+" costs "+h.getPrice()+"lakhs.");
	}
}
