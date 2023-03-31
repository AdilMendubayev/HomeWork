import java.util.*;
// 2. Написать программу, которая запрашивает у пользователя набор слов, сохраняет их, а затем выводит количество уникальных слов в наборе.
// !!! набор слов заканчивается вводом "stop" от пользователя !!!
public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> myList = new ArrayList<String>();
        while (sc.hasNext()) {
            if (sc.next().equals("stop")) {
                break;
            }
            myList.add(sc.next());
        }
        Set<String> tSet = new TreeSet<>(myList);
        System.out.println("количество уникальных слов в наборе: "+tSet.size());
    }
}
