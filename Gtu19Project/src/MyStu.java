
class College
{
	void lectures(String sna)
	{
		System.out.println("\n"+sna+" HAS ATTENDED LECTURE");
		
		try{Thread.sleep(3000);}
		catch(Exception e){}
		
		System.out.println("\n"+sna+" HAS FINISHED LECTURE");
	}
	synchronized void viva(String sna)
	{
		System.out.println("\n 	"+sna+" HAS STARTED WITH VIVA");
		
		try{Thread.sleep(3000);}
		catch(Exception e){}
		
		System.out.println("\n 	"+sna+" HAS ENDED WITH VIVA");
	}
	void exam(String sna)
	{
		System.out.println("\n 		"+sna+" HAS STARTED EXAM");
		
		try{Thread.sleep(3000);}
		catch(Exception e){}
		
		System.out.println("\n 		"+sna+" HAS FINISHED EXAM");
	}
	synchronized void submission(String sna)
	{
		System.out.println("\n 			"+sna+" HAS STARTED SUBMISSION ");
		
		try{Thread.sleep(3000);}
		catch(Exception e){}
		
		System.out.println("\n 			"+sna+" HAS FINISHED SUBMISSION");
	}
}
class Student implements Runnable
{
	Thread th;
	String sna;
	College c;
	Student(String sna,College c)
	{
		th=new Thread(this);
		this.sna=sna;
		this.c=c;
		th.start();
	}
	public void run()
	{
		c.lectures(sna);
		c.viva(sna);
		c.exam(sna);
		c.submission(sna);
	}
}
public class MyStu 
{

	public static void main(String[] args) 
	{
		College c=new College();
		
		Student s1=new Student("AVANI",c);
		Student s2=new Student("VRUNDA",c);
		Student s3=new Student("MEET",c);
		
		
	}

}
