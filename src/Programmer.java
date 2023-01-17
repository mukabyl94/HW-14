public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public Programmer() {

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void coding(){
        System.out.println(getName() + " Java код жазат");
    }
    public void programmerLearn(){
        super.learn();
        super.walk();
        super.eat();
    }
    @Override
    public String toString(){
        return "Name: " + getName() + " Deisgnation: " + getDesignation() + " CompanyName: " + companyName;
    }
}
