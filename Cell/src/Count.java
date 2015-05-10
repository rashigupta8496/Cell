
public class Count {
	
	public int[][] count_ngbd_type(String a[][])
	{
		int i,j,r,c;
		r=a.length;
		c=a[0].length;
		int countd[][] =new int[r][c];
		int countl[][] =new int[r][c];

		
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				for (int i1 = Math.max(0, i -1); i1 < Math.min(r, i + 2); i1++) 
				{
                    for (int j1 = Math.max(0, j -1); j1 < Math.min(c, j + 2); j1++) 
                    {
             
                        if (i1 != i || j1 != j)
                        {
                        	//System.out.print(a[i1][j1]);
                        	if(a[i1][j1].equals("_"))
                        	{
                        		countd[i][j]++;
                        	}
                        	else if(a[i1][j1].equals("*"))
                        	{
                        		countl[i][j]++;
                        	}
                        	
                        }
                       
                    }
                    
				}
				//System.out.println();
			}
			
		}
		/*for (i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.println(countl[i][j]+" "+countd[i][j]);
			}
			System.out.println();
		}*/
	
		return countl;

    }
	public void Condition(String a[][])
	{
		
		int cl[][]=count_ngbd_type(a);
		//int cd[][]=s.getCountl();
		int r=a.length;
		int c=a[0].length;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				//System.out.print(cd[i][j]+" ");
				if(a[i][j]=="*")
				{
					if(cl[i][j]==0 || cl[i][j]==1 || cl[i][j]>=4)
					{
						a[i][j]="_";
					}
					else if(cl[i][j]==2 || cl[i][j]==3)
					{
						a[i][j]="*";
					}
				}
				else 
				{
					if(cl[i][j]==3)
					{
						a[i][j]="*";
					}
				}
			}
			//System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
