import java.util.*;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> myList = new ArrayList<String>();
        /*myList.add(sc.nextLine());
        System.out.println(myList);
        Set<String> toSet = new HashSet<>(myList);
        System.out.println(toSet);
        Set targetSet = Set.copyOf(myList);
        System.out.println(targetSet);*/
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
        Set<String> tSet = new HashSet<>();
        tSet.add(sc.nextLine());
        System.out.println(tSet);
    }
}
//List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 4, 5);
//    Set<Integer> targetSet = new HashSet<>(sourceList);