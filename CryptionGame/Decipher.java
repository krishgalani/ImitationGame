public class Decipher 
{
    public String decryptRandom(String input){
        Cipher sample = new Cipher();
        String result = ("");
        for(int i = 0; i < input.length(); i++)
        {
            for(int c = 0; c < sample.getDecryption().length(); c++)
            {
                if(input.charAt(i)==sample.getDecryption().charAt(c)) 
                {
                    result+=sample.getAlphabet().charAt(c);
                }  
            }
        }
        System.out.println("Your random word decrypted is: "+result);
        return result;
    }
}