import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Add values to list
        Integer elements1[] = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15};
        Integer elements2[] = {-5, 15, 2, -1, 7, 15, 36};
        List<Integer> pleblist1 = new LinkedList<>(Arrays.asList(elements1));
        List<Integer> pleblist2 = new LinkedList<>(Arrays.asList(elements2));

        //Call method using the 2 list
        countCommon(pleblist1, pleblist2);
    }

    public static void countCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> similar = new HashSet<>(list1);
        int common;

        //Uses the union set operation on the list
        similar.retainAll(list2);
        common = similar.size();

        System.out.println(similar);
        System.out.println(common);

    }



    }


