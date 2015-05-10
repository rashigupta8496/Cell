import java.util.Scanner;
public class Cell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,i,j;
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt();
		String micro[][]=new String[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				micro[i][j]=s.next();
				//System.out.println(micro[i][j]);
			}
		}
	/*	for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(micro[i][j]);
			}
			System.out.println();
		}*/
		//Simulation sim=new Simulation(micro[][]);
		//System.out.println(sim.count_ngbd(micro));
		//Simulation sim=count_ngbd_type(micro[][]);
		Count c=new Count();
		//c.count_ngbd_type(micro);
		//c.Condition(micro);
		for(int k=0;k<2;k++)
		{
			//c.count_ngbd_type(micro);
			c.Condition(micro);
			
			
		}
	}

}
