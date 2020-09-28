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
    List<Integer> liste = new ArrayList<Integer>();
    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;
    
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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public interface NumberTest {
        boolean testNumber(int number);
    }
}