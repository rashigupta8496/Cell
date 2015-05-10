import java.util.Scanner;
public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		//Stack_fun stk=new Stack_fun(100);
		int i,j,t;
		t=s.nextInt();
		s.nextLine();
		//String b;
		//System.out.println("t = "+t);
		for(i=1;i<=t;i++)
		{
			//System.out.println("Running test case: "+i);
			String b=s.nextLine();
			//System.out.println(b);
			char c_a_bracket[]=new char[100];
			c_a_bracket=b.toCharArray();
			Stack_fun stk=new Stack_fun(100);
			//System.out.println("qwe");
			//System.out.println(b.length());
			for(j=0;j<b.length();j++)
			{
				//stk=new Stack_fun(100);
				if((c_a_bracket[j]=='(')||(c_a_bracket[j]=='{')||(c_a_bracket[j]=='[')||(c_a_bracket[j]=='<'))
				{
					stk.push(c_a_bracket[j]);
				}
				else
				{
					if(c_a_bracket[j]==')')
					{
						char tp=stk.popout();
						if(stk.char_notEqual(tp, '('))
						{
							System.out.println("NO");
							//stk=new Stack_fun(100);
							break;
						}
					}
					else if(c_a_bracket[j]=='}')
					{
						char tp=stk.popout();
						if(stk.char_notEqual(tp,'{'))
						{
							System.out.println("NO");
							//stk=new Stack_fun(100);
							break;
						}
					}
					else if(c_a_bracket[j]==']')
					{
						char tp=stk.popout();
						if(stk.char_notEqual(tp, '['))
						{
							System.out.println("NO");
							//stk=new Stack_fun(100);
							break;
						}
					}
					else if(c_a_bracket[j]=='>')
					{
						char tp=stk.popout();
						if(stk.char_notEqual(tp, '<'))
						{
							System.out.println("NO");
							//stk=new Stack_fun(100);
							break;
						}
					}
					
				}
			}
			if((j==b.length())&&(stk.stk_empty()))
					System.out.println("YES");
			else if((j==b.length())&&!(stk.stk_empty()))
					System.out.println("NO");
		}
	}

}
