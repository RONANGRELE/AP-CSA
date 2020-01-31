import java.util.*;
public class CW2 {
 public static void main(String[] args) {
  ArrayList<String> sports = new ArrayList<String>();
  sports.add("Softball");
  sports.add("Soccer");
  sports.add("Basketball");
  sports.add("Tennis");
  sports.add("Soccer");
  sports.add("Skiing");
  sports.add("Rowing");
  // 1: printElements(sports);
  // 2: insertElement(sports, "Football");
  // 3: System.out.println(returnElement(sports, 3));
  // 4: removeThirdElement(sports);
  // 5: searchForElement(sports, "Rowing");
  // 6: searchAndCountElement(sports, "Soccer");
  // 7: copyAndReturnList(sports);
 }
 // Number 1:
 public static void printElements(ArrayList<String> inList) {
  for (int i = 0; i < inList.size(); i++) {
   System.out.println(inList.get(i));
  }
 }
 // Number 2:
 public static void insertElement(ArrayList<String> inList,
 String newElement) {
  inList.add(newElement);
  System.out.println(inList.get(inList.size() - 1));
  for (int i = 0; i < inList.size() - 1; i++) {
   System.out.println(inList.get(i));
  }
 }
 // Number 3:
 public static String returnElement(ArrayList<String> inList, int i) {
  return inList.get(i);
 }
 // Number 4:
 public static void removeThirdElement(ArrayList<String> inList) {
  inList.remove(2);
  for (int i = 0; i < inList.size(); i++) {
   System.out.println(inList.get(i));
  }
 }
 // Number 5:
 public static void searchForElement(ArrayList<String> inList,
 String Element) {
  System.out.println(inList.indexOf(Element));
 }
 // Number 6:
 public static void searchAndCountElement(ArrayList<String> inList,
 String Element) {
  int matchCount = 0;
  for (int i = 0; i < inList.size(); i++) { 
   String showElement = inList.get(i);
   if (showElement.equals(Element))
    matchCount++;
  }
  System.out.println(matchCount);
 }
 // Number 7:
 public static void copyAndReturnList(ArrayList<String> inList) {
  for (int i = 0; i < inList.size(); i++) {
   System.out.println(inList.get(i));
  }
 }
 // Number 8:
 public static void shuffleElements(ArrayList<String> inList) {
  // unfinished, stopped here
 }
}