class Th1 extends Thread
{
    public void run()
    {
        for(int a=1;a<=5;a++)
        {
            if(a==1)
                yield();
            System.out.println("Thread1:"+a);    
        }
        System.out.println("Exit From Thread1"); 
    }    
}
class Th2 extends Thread
{
    public void run()
    {
        for(int b=1;b<=5;b++)
        {
            System.out.println("Thread2:"+b);
            if(b==3)
                stop();
        }
        System.out.println("Exit From Thread2");    
    }
}
class Th3 extends Thread
{
    public void run()
    {
        for(int c=1;c<=5;c++)
        {
            System.out.println("Thread3:"+c);
            if(c==1)
            {
                try{
                    sleep(1000);
                }
                catch(Exception e)
                {
                    System.out.println("Exception:"+e);
                }
            }
        }
        System.out.println("Exit From Thread3");
    }
}
public class Pr2
{
    public static void main(String[] args) 
    {
        Th1 ta=new Th1();
        Th2 tb=new Th2();
        Th3 tc=new Th3();
        System.out.println("Thread1 start");
        ta.start();
        System.out.println("Thread2 start");
        tb.start(); 
        System.out.println("Thread3 start");
        tc.start();   
    }
}