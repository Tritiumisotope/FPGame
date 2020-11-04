package fpgamegithubredux;

public class AgeNamePair {
    private final int age;
    private final String name;

    public AgeNamePair(int anage, String aName)
    {
        age = anage;
        name = aName;
    }

    public int age()   { return age; }
    public String name() { return name; }
}
