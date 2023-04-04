package org.example;

//Overriding ใบตองบอกเป็นการเขียนทับ

public abstract class MemberCard {
    private String firstName, lastName;

    @Override //การ Override(Ctrl + O) คือการที่เราสามารถเปลี่ยนแปลง default ของ method ที่อยู่ใน class แม่
    public String toString() {
        return String.format("firstName = %s, lastName = %s", firstName, lastName);
//        return super.toString();
    }

    public MemberCard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public MemberCard() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Overridable method
    public float discount(float amount) {
        if (amount > 1000f) {
            return amount * .02f;
        } else {
            return 0f;
        }
    }

    //inheritance ปกติคลาสลูกไม่จำเป็นต้อง implement code เองก็ได้
    //การสร้าง abstract method - ทำให้คลาสลูกต้อง implement code เอง {}
    //Must implement this method in subclass
    public abstract float rewardXPoint(); //abstract จบ ; เลย ไม่มี {} (implementation)

    //subclass can't Override this method
    public final int calcPoint(float amount){
        return (int)((amount / 20) * rewardXPoint());
    }
}
