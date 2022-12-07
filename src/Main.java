import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Random random = new Random();
//        List<Integer> integerList = new ArrayList<>();
//
//        int j = 0;
//        for (int i = 0; i < 400; i++) {
//            integerList.add(random.nextInt(0, 20));
//        }
//        System.out.print(integerList + " ");
//        Iterator <Integer> integerIterator = integerList.iterator();
//
//        List<Integer> integers = new ArrayList<>();
//        while (integerIterator.hasNext()) {
//
//            System.out.println(j += integerIterator.next());
//
//        }
//        Set<Integer> integerSet = new HashSet<>();
//        integerSet.add(8);
//        integerSet.add(6);
//        integerSet.add(9);
//        integerSet.add(0);
//        integerSet.add(1);
//        integerList.addAll(integerSet);
//        System.out.println(integerList);


        Set<Student> students = new HashSet<>(Arrays.asList(
                new Student("Keldibek", 18),
                new Student("Keldibek", 18),
                new Student("Keldibek", 18),
                new Student("Keldibek", 18),
                new Student("Keldibek", 18)
        ));




        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Set<Integer>integerSet = new HashSet<>();
        integerSet.add(0);
        integerSet.add(1);
        integerSet.add(2);

        System.out.println(symmetricDifference(integers, integerSet));
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {


        Set<Integer> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        Set<Integer> sort = new HashSet<>(set1);
        sort.retainAll(set2);
        set3.removeAll(sort);
        return set3;
    }

}