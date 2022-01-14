class NoMatchException extends Exception
{
   String msg;
   NoMatchException (String s){
     msg=s;
}
  public String to_String() {            
   return(msg);
}
}

class MatchException
{
   void Matching_String (String str)
   throws NoMatchException {
   if(str.equalsIgnoreCase("wellcome")){
   System.out.println("string matched");
}
else
{ throw new NoMatchException("string does not match");
  }
}

public static void main(String args[])
{
  MatchException M = new MatchException ();
  try 
 {
   M.Matching_String ("well");
}
   catch(NoMatchException m)
{
   System.out.println("In catch block");
   System.out.println(M);
}
}
}