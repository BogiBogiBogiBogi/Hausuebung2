package hausuebung.pkg2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumberTester{
    String path;
    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;
    int lineAmount;
    
    public NumberTester(String fileName) {
        this.path = fileName;
    }
    
    public void setOddEvenTester(NumberTest oddTester)
    {
            this.oddTester = oddTester;
    }
    
    public void setPrimeTester(NumberTest primeTester)
    {
        this.primeTester = primeTester;
    }
    
    public void setPalindromeTester(NumberTest palindromeTester)
    {
        this.palindromeTester = palindromeTester;
    }
    
    public void testFile()
    {
        File f = new File(this.path);
        try {
            Scanner scanner = new Scanner(f);
            while(scanner.hasNext())
            {
                String lines = scanner.nextLine();
                String array[] = lines.split(" ");
                
                switch(array[0])
                {
                    case "1":
                        boolean isOdd = this.oddTester.testNumber(Integer.parseInt(array[1]));
                        if(isOdd)
                        {
                            System.out.println("EVEN");
                        }
                        else
                        {
                            System.out.println("ODD");
                        }
                    break;
                    
                    case "2":
                        boolean isPrime = this.primeTester.testNumber(Integer.parseInt(array[1]));
                        if(isPrime)
                        {
                            System.out.println("PRIME");
                        }
                        else
                        {
                            System.out.println("NO PRIME");
                        }
                    break;
                    
                    case "3":
                        boolean isPalindrome = this.palindromeTester.testNumber(Integer.parseInt(array[1]));
                        if(isPalindrome)
                        {
                            System.out.println("PALINDROME");
                        }
                        else
                        {
                            System.out.println("NO PALINDROME");
                        }
                    break;
                    
                    default:System.exit(0);
                        break;
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}