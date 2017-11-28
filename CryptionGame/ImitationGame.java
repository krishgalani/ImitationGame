import java.util.Scanner;
public class ImitationGame
{
    public static void main(String args[])
  {
       Decipher f = new Decipher();
       Cipher s = new Cipher();
       Scanner z = new Scanner(System.in);
       System.out.println("Welcome to my Encrypt/Decrypt function!\n What would you like to do today?"); 
        while(true)
    {
        System.out.print("Press E to encrypt, and D to decrypt, or S to stop");
        String a = z.nextLine();
        System.out.println(a);
        a = a.toUpperCase();
        if(a.equals("E"))
        {
             System.out.println("Please enter the word you would like to encrypt: ");
             String b = z.nextLine();
             s.encrypt(b);  
             System.out.println("Would you like to decrypt your encrypted word now?(Y or N)");
             String u = z.nextLine();
             u = u.toUpperCase();
             if (u.equals("Y"))
                {
                 f.decrypt();
                }
             else{
                 break;
                 }
        }
        else if(a.equals("D"))
        {
             System.out.println("Please enter the word you would like to decrypt: ");
             String j = z.nextLine();
             f.decrypt(j);
        }   
        else if(a.equals("S"))
        {
            break;
        }
        else
        {
            System.out.println("Invalid Phrase");
        }    
    }
  }
}