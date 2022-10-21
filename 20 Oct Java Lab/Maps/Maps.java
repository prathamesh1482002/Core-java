/*
Author : Prathamesh Manjrekar
Date   : 20 Oct 2022
*/
package labques;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps 
{
   public static void main(String args[]) 
   {   
	//insertion the data
      Map<String, String> map = new HashMap<String, String>();
      map.put("Prathamesh", "20");
      map.put("Vipin", "21");
      map.put("Tushar", "22");
      map.put("Anuja", "23");
      map.put("Sayali", "24");

      Map<String, String> map1 = new LinkedHashMap<String, String>();
      map1.put("Prathamesh", "20");
      map1.put("Vipin", "21");
      map1.put("Tushar", "22");
      map1.put("Anuja", "23");
      map1.put("Sayali", "24");

      //Updating the previous data
      Map<String, String> map2 = new TreeMap<String, String>();
      map2.put("Riya", "66");
      map2.put("Sagar", "21");
      map2.put("Ayanokoji", "42");
      map2.put("Rohit", "27");
      map2.put("Doffy", "35");
      System.out.println("HashMap:" + map);
      System.out.println("LinkedHashMap:" + map);
      System.out.println("TreeMap:-" + map2);
      System.out.println(" ");
     
      //Delete the previous data
      map.put("Ayanokoji", "20"); 
      map1.put("Riya", "21");
      map2.put("Three", "6");
      System.out.println("HashMap:" + map);
      System.out.println("LinkedHashMap:" + map);
      System.out.println("TreeMap:-" + map2);
      System.out.println(" ");
     
      map.remove("Prathamesh","20");
      map1.remove("Sayali","24");
      map2.remove("Doffy","35");
      System.out.println("HashMap:" + map);
      System.out.println("LinkedHashMap:" + map);
      System.out.println("TreeMap:-" + map2);
   }
}