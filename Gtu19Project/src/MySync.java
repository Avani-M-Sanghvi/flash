
class DBMS2
{
	void read(String tna)
	{
		System.out.println(tna+" has started reading database");
		try{ Thread.sleep(5000);}
		catch(Exception e){}
		System.out.println(tna+" has finished reading");
	}
	void edit(String tna)
	{
		System.out.println(tna+" has started editing database");
		try{ Thread.sleep(5000);}
		catch(Exception e){}
		System.out.println(tna+" has finished editing");
	}
}
class User2 implements Runnable
{
	Thread th;
	DBMS2 d;
	String tna;
	User2(String tna,DBMS2 d)
	{
		th=new Thread(this);
		this.tna=tna;
		this.d=d;
		th.start();
	}
	public void run()
	{
		d.read(tna);
		if(tna.equals("Super User"))
		{
			d.edit(tna);
		}
		else
		{
			synchronized(d)
			{
				d.edit(tna);
			}
		}
	}
}
public class MySync
{
	public static void main(String[] args)
	{
		DBMS2 d=new DBMS2();
		
		User2 u1=new User2("Avani",d);
		User2 u2=new User2("Dhruv",d);
		User2 u3=new User2("Meet",d);
		User2 u4=new User2("Super User",d);
	}
}
