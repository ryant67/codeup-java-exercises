import java.util.Arrays;

public class ArraysExercise {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] person = {"George", "Jane", "Chris"};

        for(String people : person) {
            System.out.println(people);
        }

    }



}
