package HomeWork1;
public class SecondTask {


    public boolean isOdd(int num) {
        return !(num % 2 == 0);
    }


    public void getOdd(int num) {
        for (int i = 1; i <= num; i++) {
            if (isOdd(i)) {
                System.out.print(" " + i);
            }
        }
    }

}
