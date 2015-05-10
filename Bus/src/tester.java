import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class tester {
	public static void main(String []args)
	{
		File f=new File("input_data.dat");
		try
		{
			Passenger p[]=new Passenger[200];
			int i=0;
			Scanner sc=new Scanner(f);
			Red r[]=new Red[10];
			Green g[]=new Green[10];
			Yellow y[]=new Yellow[10];
			r[0]=new Red();
			g[0]=new Green();
			y[0]=new Yellow();
			int j=0;
			while(sc.hasNextLine())
			{
				String a[]=sc.nextLine().split(" ");
				///System.out.println(a.length);
				p[i]=new Passenger(a[0],a[1],a[2],a[3]);
				//System.out.println(p[i].getDest()+" "+p[i].getoff()+" "+p[i].getSource());
				
				while(true)
				{
					//System.out.println("kjjdkjf");
					if(r[j].check(p[i].getSource())&&r[j].addPass(p[i]))
					{
						//System.out.println("hdg");
						p[i].setBustype("red");
						p[i].setBusno(j+1);
						break;
					}
					else if(g[j].check(p[i].getSource())&&g[j].addPass(p[i]))
					{
						p[i].setBustype("green");
						p[i].setBusno(j+1);
						break;
					}
					else if(y[j].check(p[i].getSource())&&y[j].addPass(p[i]))
					{
						p[i].setBustype("yellow");
						p[i].setBusno(j+1);
						break;
					}
					else
					{
						j++;
						r[j]=new Red();
						g[j]=new Green();
						y[j]=new Yellow();
					}
				}
				i++;
			} 
			for(int k=0;k<=j;k++)
			{
				int fl=r[k].fuel();
				if(fl>210)
					System.out.println("Fuel  used by red bus no "+(k+1)+" is "+fl+"ml");
			}
			for(int k=0;k<=j;k++)
			{
				int fl=g[k].fuel();
				if(fl>175)
					System.out.println("Fuel  used by green bus no "+(k+1)+" is "+fl+"ml");
			}
			for(int k=0;k<=j;k++)
			{
				int fl=y[k].fuel();
				if(fl>140)
					System.out.println("Fuel  used by yellow bus no "+(k+1)+" is "+fl+"ml");
			}
			for(int k=0;k<i;k++)
			{
				System.out.println(p[k].getName()+"  "+p[k].getBustype()+" "+p[k].getBusno());
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
	}
}

