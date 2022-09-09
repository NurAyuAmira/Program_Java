//Lab 6 e.g. 4: Numbers4.java
public class Numbers4 
{ 
    public static void main (String [] arg)
    {
        String code="";
        try
        {
            code = "55123";
            int codenum = Integer.parseInt(code);
            System.out.println("Code number is "+codenum);
        }
        catch(RuntimeException e)
        {
            System.out.println(code + " cannot convert to integer number.");
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally block - always run.");
        }
    }
}
