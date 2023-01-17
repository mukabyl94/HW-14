public class Singer extends Person {
    private String bandName;

   public Singer (String name, String designation, String bandName){
       super(name, designation);
       this.bandName = bandName;
   }
    public Singer(){

    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void singing(){
       super.learn();
       super.walk();
       super.eat();
        System.out.println(getName() + " Кыргыз ырларын ырдайт");
    }
    public void playGitar(){
        System.out.println(getName() + " Комузда жана гитарада жакшы ойнойт");
    }
    @Override
    public String toString(){
       return "Name: " + getName() + " Designation: " + getDesignation() + " BamdName: " + bandName;
    }
}
