class Pr
{
	int n,i=2,c=0,j,t=1;
	//int d;
	synchronized void get(int n)
	{
		System.out.println("\nNew Thread "+t++);
		System.out.println("	I:"+i);
		while(n>0)
		{
			//d=i;
			for(j=2;j<=i/2;j++)
			{
				if((i%j)==0)
				{
					c++;
				}
			}
			if(c==0)
			{
				n--;
				System.out.println(" "+i);
			}
			c=0;	i++;
		}
	}
}
class Prime implements Runnable
{
	Thread th;
	Pr y;
	int n;
	int d;
	Prime(int n,Pr y)
	{
		th=new Thread(this);
		this.n=n;
		this.y=y;
		th.start();
	}
	public void run()
	{
		y.get(n);
	}
}
public class MyPrime
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		Pr y1=new Pr();
		while(n>=50)
		{
			n=n-50;
			Prime p1=new Prime(50,y1);
			/*try
			{
				p1.th.join();
			}
			catch(Exception e){}*/
		}
		try{ Thread.sleep(500);}
		catch(Exception e){}
		if(n<50)
		{
			Prime p2=new Prime(n,y1); 
		}	
	}
}
