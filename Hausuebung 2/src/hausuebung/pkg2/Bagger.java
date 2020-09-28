package hausuebung.pkg2;

import java.util.ArrayList;
import java.util.List;


public class Bagger {
    List<String> list = new ArrayList<String>();
    
    void testForEach()
    {
        list.add("hallo");
        list.add("yellow");
        list.add("catt");
        list.add("hallo");
        list.forEach((String s) -> System.out.println(s));
        
    }
}
