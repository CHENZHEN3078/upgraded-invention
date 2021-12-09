import java.util.Scanner;
public class Scores {
    static double a1,a2,a3,a4,a5,average,max;

    static void getmax() {
        double score[] = new double[]{a1, a2, a3, a4, a5};
        max = a1;
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        System.out.println("最高分"+max);
    }
    static double getaverage() {
        average = (a1 + a2 + a3 + a4 + a5) / 5;
        System.out.println("平均分" + average);
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = sc.nextInt();
        a4 = sc.nextInt();
        a5 = sc.nextInt();
        sc.close();
        Scores max=new Scores();
        Scores average=new Scores();
        average.getaverage();
        max.getmax();


    }
}
