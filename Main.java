import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        WeeklyPerformance weeklyPerformance = new WeeklyPerformance();
        weeklyPerformance.QuadraticSolution(1,-1,7);

       PracticeGround practiceGround = new  PracticeGround();
       WeeklyPerformance go =practiceGround.home();
        System.out.println(go.john);
        StringBuilder sb = new StringBuilder();
        //sb.substring(2,1);
        int max = 999999999;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int g = random.nextInt(max);

        System.out.println(g);
//        System.out.println(g);
        System.out.println(g);
        System.out.println(g);
        System.out.println(g);
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(6);
        numbers.add(3);
        numbers.add(23);
        numbers.add(12);
        numbers.add(17);
//        System.out.println(numbers.size());
        for (int i =0;i<=12;i++) {
if(numbers.contains(i)) {
    System.out.println(i);
} else System.out.println(i);
        }

    }
}
