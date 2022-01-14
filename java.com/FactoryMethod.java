//IntAddress 
import java.net.*;
class FactoryMethod
{
   public static void main(String args[])
{
try{
  InetAddress i= InetAddress.getLocalHost();
  System.out.println(i);
  System.out.println("host name="+i.getHostName());
  System.out.println("CanonicalName="+i.getCanonicalHostName());
  
  i=InetAddress.getByName("157.240.13.35");
  System.out.println("Address="+ i.getHostName());

  i=InetAddress.getByName("google.co.in");
  System.out.println("googleIP="+ i.getHostAddress());
  System.out.println(i.isMulticastAddress()? "yes":"no");
  System.out.println(i.isLoopbackAddress()? "yes":"no");

  InetAddress iArr[]=InetAddress.getAllByName("facebook.co.in");

  for (int j=0;1<iArr.length;j++)
{
   System.out.println("ip=" + iArr[j]);
    }
}
catch(Exception e){
System.out.println(e);
}
}

}
