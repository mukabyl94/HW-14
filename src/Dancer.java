public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public Dancer() {

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void dancing(){
        super.learn();
        super.walk();
        super.eat();
        System.out.println(getName() + " бийлейт");

    }
    @Override
    public String toString(){
        return "Name: " + getName() + " Designation: " + getDesignation() + " GroupName: " + groupName;
    }
}
