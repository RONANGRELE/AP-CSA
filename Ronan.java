
public class Ronan extends person
{
 private String hobby1;
 public Ronan()
 {
  super();
  hobby1 = "learning the guitar";
 }
 public Ronan(int age, String gender, String name, String hobby1)
 {
  super(age, gender, name);
  this.hobby1 = hobby1;
 }
 public void birthday(int age) {
  age = getage(age) + 1;
  super.setage(age);
 }
 public String t0String() {
  return super.toString() + " and likes " + hobby1;
 }
}