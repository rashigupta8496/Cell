
public class Passenger {
	String name,type;   //type of passenger
	int source,dest;
	String bustype;     //color of bus
	int busno;          //?
	public String getBustype() {
		return bustype;
	}
	public void setBustype(String bustype) {
		this.bustype = bustype;
	}
	public int getBusno() {
		return busno;
	}
	public void setBusno(int busno) {
		this.busno = busno;
	}
	public Passenger(String t,String n,String s,String d)
	{
		name=n;
		type=t;
		source=s.charAt(0)-65;
		dest=d.charAt(0)-65;	
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getSource() {
		return source;
	}
	public int getDest() {
		return dest;
	}
	public int board()
	{
		if(type.equals("senior"))
			return 20;
		else if(type.equals("child"))
			return 20;
		else 
			return 10;
	}
	public int getoff()
	{
		if(type.equals("senior"))
			return 20;
		else if(type.equals("child"))
			return 60;
		else 
			return 10;
	}
}


