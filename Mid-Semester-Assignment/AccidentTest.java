/*Name:Nuha Imran
 *Id:20696366
  date:6/11/21*/

import java.util.*;
public class AccidentTest
{
 public static void main(String[] args)
 {
  //creating object
  Location place = new Location();
  //testing my class
  Accident testOne = new Accident("9797493", "28/5/18", "815", "Medical", "beaufort st", "50626", "Right Angle", place);
  System.out.println("Test one id: " + testOne.getId());

  //testing another one
  Accident testTwo = new Accident("10026671", "23/5/19", "30", "PDO minor", "Douro rd", "67890", "Hit Object", place);
  System.out.println("Test two accident date: " + testTwo.getDate());

  if(testOne.equals(testTwo))
   {
     System.out.println("They are the same");
   }
  else
   {
    System.out.println("They are not the same");
   }

  System.out.println("Details of accident one are :" + testOne.toString());

  testOne.setId("9797493");

  System.out.println("Details of accident one are:" + testOne.toString());
}

}
