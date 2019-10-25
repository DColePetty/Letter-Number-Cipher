// COLE PETTY
// LETTERS AND NUMBER SWAP CIPHER
// side project, solo

import java.util.Scanner;

public class LNCipher
{
  public static String alphabet = " abcdefghijklmnopqrstuvwxyz";
  public static String alphabetUpper = " abcdefghijklmnopqrstuvwxyz".toUpperCase();
  /* 
   * the space is intentional to give 'a' = index '1',
   * One could easily modify this code by placing a space at the end and giving it's index "27",
   * this functionality would also make the code given decipherable to some online cipher solving tools
   * or make the cipher less decipherable to a witty human.
   */
  public static Scanner sc = new Scanner(System.in);
  public static String encryptedText = "";
  
  private static void Encrypt(String str)
  {
    for(int a = 0; a < str.length(); a++)
    {
      if(str.charAt(a) != ' ' && (alphabet.indexOf(str.charAt(a)) != -1 || alphabetUpper.indexOf(str.charAt(a)) != -1))
      {
        char currentLetter = str.charAt(a);
        int itsIndex = alphabet.indexOf(currentLetter);
        if(itsIndex == -1)
        {
        	itsIndex = alphabetUpper.indexOf(currentLetter);
        }
        encryptedText = encryptedText.concat("" + itsIndex + "-");
        //System.out.println("str.charAt("  + a + "):" + str.charAt(a));
        //System.out.println("alphabet.indexOf(str.charAt(a))):" + alphabet.indexOf(str.charAt(a)));
      }
      else
      {
    	if(str.charAt(a) != ' ') 
    	{
    		encryptedText = encryptedText.concat("" + str.charAt(a) + "-");
    	}
    	else 
    	{
    		if(encryptedText.length() > 0)
    		{
    			encryptedText = encryptedText.substring(0, encryptedText.length()-1);
    		}
    		encryptedText = encryptedText.concat("" + str.charAt(a) + "");
    	}
      }
    }
    encryptedText = encryptedText.substring(0, encryptedText.length()-1);
  }
  public static void main(String[] args)
  {
    System.out.println("Enter the message you wish to encrypt");
    String plaintext = sc.nextLine();
    
    Encrypt(plaintext);
    System.out.println("Your encoded message is: \n" + encryptedText);
    
   // the quick brown fox jumped over the lazy dog
  }
}
