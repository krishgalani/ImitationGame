public class Cipher 
{
    private String result = ("");
    private String alphabet = "abcdefghijklmnopqrstuvwxyz1234567890 ";
    private String decryption = "啊被车的饿饭更回爱接快来么你哦跑去人死天鱼绿问行友中一二三四五六七八九零_";
  public String encrypt(String input) 
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
  public String getResult()
    {
      return result;
    }
  public String getAlphabet()
    {
      return alphabet;
    }
  public String getDecryption()
    {
      return decryption;
    }
}