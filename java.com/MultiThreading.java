class First extends Thread
{
   public void run()
   {
       for(int i=1; i<=5; i++)
       {
         if(i==3)
         {
            System.out.println("giving my control");
            Thread.yield();
         }
       }
    }
}

class Second extends Thread
{
   public void run()
   {
       for (int j=1; j<=5; j++)
       {
          if (j==3)
          {
              System.out.println("going to sleep");
              try
              {
                 Thread.sleep(500);  // in milisecond
                 }
                   catch (Exception e){
                   System.out.println(e);}
                   }
                   System.out.println("j=" +j);
                 
             
        }
   }
}

class Third extends Thread 
{ 
   public void run()
   {
      for (int k=1; k<5; k++)
      {
         if (k==4)
         { 
            System.out.println();       //prematere death
         }
          System.out.println("k=" +k);
         }
     }    
}


class MultiThreadingDemo
{
   public static void main(String args[])
   {
      System.out.println("main thread");
      First t1=new First();
      Second t2=new Second();
      Third t3=new Third();
      t1.start();             //will invoke run()
      t2.start();
      t3.start();
      System.out.println("end of main");
    }
}
