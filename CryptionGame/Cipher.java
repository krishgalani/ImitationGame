public class Cipher 
{
    public static String result = ("");
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz1234567890 ";
    public static String decryption = "啊被车的饿饭更回爱接快来么你哦跑去人死天鱼绿问行友中一二三四五六七八九ling1_";
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