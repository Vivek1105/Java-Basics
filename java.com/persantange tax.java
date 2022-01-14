class Second
{ 
   public static void main(String args[])
   {
   System.out.println("chooose category (1-2)");
   System.out.println("1 male 2 female");
   int choose=Integer.parseInt(args[0]);
   int sal=Integer.parseInt(args[1]);
   if (choose==1)
   {
    

          if (sal>=0 && sal<=180000){
          System.out.println(sal);}
          
          if(sal>180001 && sal<=500000){
          System.out.println(sal*0.1);}


          if(sal>=500001 && sal<=8000000){
          System.out.println(sal*0.2);}
  
         else{ System.out.println(sal*0.3);}
 }
   }
       }     

