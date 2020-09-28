package hausuebung.pkg2;

import java.util.ArrayList;
import java.util.List;


public class HalloJavamitForEach {
    static List<String> list = new ArrayList<String>();
    
    public static void main(String[] args)
    {
        list.add("hallo");
        list.add("yellow");
        list.add("catt");
        list.add("hallo");
        list.forEach((String s) -> System.out.println(s));
        
        
        System.out.println(" ");
        
        NumberTester numtes = new NumberTester("hehehe.txt");
        numtes.testFile();
    }
}