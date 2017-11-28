public class Decipher 
{
    public String decrypt()
    {
        for(int i = 0; i < Cipher.result.length(); i++)
        {
            for(int c = 0; c < Cipher.decryption.length(); c++)
            {
                if(Cipher.result.charAt(i)==Cipher.decryption.charAt(c)) 
                {
                    Cipher.result.replace(Cipher.result.charAt(i),Cipher.alphabet.charAt(c));
                }  
            }
        }
        System.out.println("Your word decrypted is: "+Cipher.result);
        return Cipher.result;
    }
    public static String decrypt(String input){
        String result = ("");
        for(int i = 0; i < input.length(); i++)
        {
            for(int c = 0; c < Cipher.decryption.length(); c++)
            {
                if(input.charAt(i)==Cipher.decryption.charAt(c)) 
                {
                    result+=Cipher.alphabet.charAt(c);
                }  
            }
        }
        System.out.println("Your random word decrypted is: "+result);
        return result;
    }
}