package human;

/*
    1.create a Person class with name(private String) [in human package]/
        -create a toString method that show the name./
        -create a constructor with name field/
        -create a getter/setter /
*/
public class Person {
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
