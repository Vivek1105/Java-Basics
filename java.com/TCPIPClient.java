import java.io.*;
import java.net.*;
class TCPIPClient
{
    public static void main( String args[])
    {  
        try
        {
            String ip="192.168.9.89";
            final int PORT= 12345;

            Socket skt=new Socket(ip,PORT);
            System.out.println("client is invoked...");
            System.out.println("port number="+skt.getPort());
            System.out.println("Local port number="+skt.getLocalPort());
            System.out.println("type somthing that will be swnd to server");

            BufferedReader in=new BufferedReader(new InputStreamReader(skt.getInputStream()));
            BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(skt.getOutputStream(), true);
            String str=null;
            do 
            {
               str=keyboard.readLine();
               out.println(str);

               str=in.readLine();
               System.out.println("from server:"+str);

            }
            while(!str.equalsIgnoreCase("quit"));
         } 

         catch(Exception e)
        {
            System.out.println(e);
    }
   }
}
