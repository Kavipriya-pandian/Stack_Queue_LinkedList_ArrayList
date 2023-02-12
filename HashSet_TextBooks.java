package Week3_Assignment;
import java.util.HashSet;
import java.util.Set;

public class HashSet_TextBooks 
{
	public static void main(String[] args) {
        Set<String> stackOneTextBooks = new HashSet<>();
        stackOneTextBooks.add("Chemistry");
        stackOneTextBooks.add("Mathematics");
        stackOneTextBooks.add("Biology");
        stackOneTextBooks.add("English");

        Set<String> stackTwoTextBooks = new HashSet<>();
        stackTwoTextBooks.add("Biology");
        stackTwoTextBooks.add("English");
        stackTwoTextBooks.add("Geography");
        stackTwoTextBooks.add("Physics");
        
        Set<String> StackOne = new HashSet<>(stackOneTextBooks);
        Set<String> StackTwo = new HashSet<>(stackTwoTextBooks);

        StackOne.removeAll(StackTwo);
        System.out.println("Subject that present only in the First Stack are: "+StackOne);

     
        StackTwo.removeAll(StackOne);
        System.out.println("Subjects that only present in the Second Stack are: " + StackTwo);

        
        stackOneTextBooks.retainAll(stackTwoTextBooks);
        System.out.println("Subjects that present in both First and Second Stacks are : "+stackOneTextBooks);
    }
}


