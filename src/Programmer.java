public class Programmer extends Person {
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



    @Override
    public void learn() {
        System.out.println(getName() + "азыркы учурда JAVA программалоо тилин уйронуп жатат");
    }

    @Override
    public void walk() {
        System.out.println(getName() + "баласы менен сейилдеп журот");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "кечки тамагын ичип жатат");
    }
    public void coding() {
        System.out.println(getName() + " Java код жазат");
    }
    @Override
    public String toString() {
        return "Name: " + getName() + " Deisgnation: " + getDesignation() + " CompanyName: " + companyName;
    }
}
