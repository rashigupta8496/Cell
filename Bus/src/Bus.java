
public class Bus {
	int desTime[]=new int[7];
	int srcTime[]=new int[7];     //actual time bus can be on that station(300-ppl taking time)...time as ppl keep on entering on a particular station...entering a station
	Passenger list[]=new Passenger[40];
	int tot=-1;
	public Bus()
	{
		//System.out.println("dsd");
		desTime[0]=0;
		srcTime[6]=0;
		for(int i=1;i<6;i++)
		{
			desTime[i]=0;
			srcTime[i]=0;
		}
	}
	public boolean addPass(Passenger p)
	{
		//System.out.println("fsdfsdf");
		if((srcTime[p.getSource()])<=300-p.board()&&desTime[p.getDest()]<=300-p.getoff())
		{
			//desTime[p.getSource()]-=srcTime[]
			srcTime[p.getDest()]+=p.getoff();  //1st this
			desTime[p.getDest()]+=p.getoff();
			srcTime[p.getSource()]+=p.board();
			//System.out.println(p.getSource()+" "+srcTime[p.getSource()]);
			//System.out.println(p.getDest()+" "+srcTime[p.getDest()]);
			tot++;
			list[tot]=p;
			//System.out.println("dfsf");
			return true;
		}
		return false;
	}

}
