//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
 public static int total( List<Integer> ray)
 {
//Create an int variable called myNums and set it equal to zero
int myNums = 0;
//Use a for each loop to go through each array element and add the previous element
for(int i : ray)
//Inside the for loop, add the current value to myNums
   {
     myNums = myNums + i;
   }
//Return the sum of the elements in the ArrayList outside of the for each loop.
return myNums;
 }
}