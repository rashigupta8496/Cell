
public class Stack_fun {

	private int count;
	private char ca[];
	Stack_fun(int n)
	{
		count=-1;
		ca=new char[n];
	}
	void push(char ch)
	{
		if(count>99)
			System.out.println("NO");
		else
			ca[++count]=ch;
	}
	char popout()
	{
		if(count<=-1)
			return 'e';
		else
			return ca[count--];
	}
	boolean char_notEqual(char a,char b)
	{
		if(a!=b)
			return true;
		else 
			return false;
	}
	boolean stk_empty()
	{
		if(count==-1)
			return true;
		else 
			return false;
	}
}
