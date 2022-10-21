package staticsImports;
import static java.lang.Math.*;
public class StaticImportTest {
    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(pow(1,-1));
        System.out.println("Statically imported");
    }
}
