
public class Red extends Bus {
	private int fuel=210;
	public boolean check(int a)
	{
		int t=0;   //total no of passengers in red bus
		for(int i=0;i<=tot;i++)
		{
			if(list[i].getDest()>a)
				t++;
		}
		//System.out.println(t);
		if(t>=40)
			return false;
		return true;
	}
	public int fuel()
	{
		for(int i=1;i<7;i++)
		{
			int t=0;
			for(int j=0;j<=tot;j++)
			{
				if(list[j].getSource()<i)
				{
					if(list[j].getDest()>=i)
						t++;
				}
				else
					break;
			}
			fuel=fuel+t;
		}
		return fuel;
	}
	public double getFuel() {
		return fuel;
	}
	
}



