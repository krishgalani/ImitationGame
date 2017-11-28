public class Cipher 
{
    public static String result = ("");
  public static String encrypt(String input) 
  {
    for(int i = 0; i < input.length(); i++) 
    {
      for(int c = 0; c < alphabet.length(); c++) 
      {
        if(input.charAt(i)==alphabet.charAt(c)) 
        {
        result += decryption.charAt(c);
        }  
      }
    }
    System.out.println("Your word encrypted: "+result);
    return result;
  } 
}