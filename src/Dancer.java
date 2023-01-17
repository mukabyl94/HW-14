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

    @Override
    public void learn() {
        System.out.println(getName() + "учурд бийдин башка турун уйронуп жатат");
    }

    @Override
    public void walk() {
        System.out.println(getName() + "сейилдеп журот");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "достору менен тамактанууда");
    }

    public void dancing(){
        System.out.println(getName() + " бийлейт");
    }
    @Override
    public String toString(){
        return "Name: " + getName() + " Designation: " + getDesignation() + " GroupName: " + groupName;
    }
}
