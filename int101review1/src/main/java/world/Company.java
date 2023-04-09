package world;

import human.Person;

/* //test toString and divident methods
    2.create a Company class [in world package] with the following fields:
    1.1 title (String private)/
    1.2 address (String private)/
    1.3 capital (double private)/
    1.4 owner (Person private) /
    create the following method :
    2.1 constructor with all fields /
    2.2 getter and setter for each field/
    2.3 toString method (show all fields)/
    2.4 equals method (compare all fields)
    2.5 divident(เงินปันผล) method (receive a percent (double) and returns the value of the capital)

    1.create a Person class with name(private String) [in human package]
        -create a toString method that show the name.
        -create a constructor with name field
        -create a getter/setter

*/
public class Company {
    private String title;
    private String address;
    private double capital;
    private Person owner;

    public double divident(double percent) {
        return capital * percent / 100;
    }

    public Company(String title, String address, double capital, Person owner) {
        this.title = title;
        this.address = address;
        this.capital = capital;
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Company{" +
                "title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", capital=" + capital +
                ", owner=" + owner +
                '}';
    }


}