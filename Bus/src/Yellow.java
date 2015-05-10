
public class Yellow extends Bus{
	private int fuel=140;
	public boolean check(int a)
	{
		int t=0;
		for(int i=0;i<=tot;i++)
		{
			if(list[i].getDest()>a)
				t++;
		}
		if(t>=20)
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
