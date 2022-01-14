//class parent start
class Parent
{
   int a= 20;
  void show ()
{
   System.out.println("parent class"+a);
}
}
 
// class parent end 


//class child start

class Child extends Parent
{
  int b= 30;
void show()
{ 
System.out.println ("child" +a+ "&" +b);
}
}

//class child end 


//child class instance

class Inheritance
{
   public static void main (String args[])
{
   Child obj=new Child();
    obj.show();
}
}