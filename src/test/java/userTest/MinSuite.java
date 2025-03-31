package userTest;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
@Suite
//@SelectPackages("src.test.java.userTest")  // välj alla tester i detta paket
@IncludeTags("myTest")             // kör bara tester med denna tagg
public class MinSuite {
}