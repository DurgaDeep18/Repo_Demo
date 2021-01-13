
abstract class Myntra 
{
	abstract void image();
	abstract void details();
}


class Sandle extends Myntra
{
	@Override
	public void image()
	{
		System.out.println("it is a sandle");
	}
	
	@Override
	public void details()
	{
		System.out.println("Sandle is looking good");
	}
}

class Shoe extends Myntra
{
	@Override
	public void image()
	{
		System.out.println("it is a shoe");
	}
	
	@Override
	public void details()
	{
		System.out.println("Shoe is Preety");
	}
}