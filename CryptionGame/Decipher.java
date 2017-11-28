public class Decipher 
{
    public static String decryptRandom(String input){
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