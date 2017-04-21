import com.beust.jcommander.internal.Lists;
import org.testng.TestNG;

import java.util.List;

/**
 * Created by fedor tsyganov on 4/20/17.
 */
public class Main {
    public static void main(String args[]){

        TestNG tng = new TestNG();
        List<String> suites = Lists.newArrayList();
        suites.add("/Path/to/testng.xml");
        tng.setTestSuites(suites);
        tng.run();

    }
}
