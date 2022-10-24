package AccessModifiers;

public class ModifierTest {
    public static void main(String[] args) {
        Modifier mf=new Modifier();
        Modifier mf2=new Modifier();
        Foo foo= new Foo("test");
        Foo foo2= new Foo("test2");
        foo.set(foo2);
        foo2.set(foo);

    }
}
