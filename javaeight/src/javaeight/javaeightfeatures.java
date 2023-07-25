package javaeight;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class javaeightfeatures {

	public static void main(String[] args) {
		List<String> names1 = new ArrayList<String>();
		names1.add("mahesh");
		names1.add("Suresh");
List<String> names2 = new ArrayList<String>();
names2.add("mahesh");
names2.add("Stringone");
javaeightfeatures tester = new javaeightfeatures();
System.out.println("sort using java 7syntax:");
tester.sortUsingJava7(names1);
System.out.println(names1);
System.out.println("Sort using Java 8 syntax: ");
	
tester.sortUsingJava8(names2);
System.out.println(names2);
	}
private void sortUsingJava7(List<String> names) {   
    Collections.sort(names, new Comparator<String>() {
       @Override
       public int compare(String s1, String s2) {
          return s1.compareTo(s2);
       }
    });
 }
 
 //sort using java 8
 private void sortUsingJava8(List<String> names) {
    Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}

}
