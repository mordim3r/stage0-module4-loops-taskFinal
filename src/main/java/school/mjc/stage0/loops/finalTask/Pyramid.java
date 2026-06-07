package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // пробелы
            for (int s = 0; s < cathetusLength - i; s++) {
                System.out.print(" ");
            }
            // убывание
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // возрастание (со 2, чтобы не дублировать 1)
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
