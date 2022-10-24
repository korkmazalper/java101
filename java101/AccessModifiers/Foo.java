package AccessModifiers;
class Foo
{
    private String contents;

    public Foo(String str) {
        contents = str;
    }

    public void set(Foo other)
    {
        System.out.println(contents); // original of contents value
        contents = other.contents;
        System.out.println(contents); // contents value is changed
    }
}
