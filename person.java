
public class person
{
    private int age;
    private String gender;
    private String name;
    public person()
    {
        age = 16;
        gender = "male";
        name = "Ronan Grele";
    }

    public person(int age, String gender, String name)
    {
      age = this.age;
      gender = this.gender;
      name = this.name;
    }
    public void setage(int Xage) {
     Xage = age;
    }
    public void setgender(String Xgender) {
     gender = Xgender;
    }
    public void setname(String Xname) {
     name = Xname;
    }
    public int getage(int Xage) {
     return Xage;
    }
    public String getgender(String Xgender) {
     return Xgender;
    }
    public String getname(String Xname) {
     return Xname;
    }
    public String t0String() {
     return name + " is of age " 
     + age + " and identifies as a " + gender;
    }
}
