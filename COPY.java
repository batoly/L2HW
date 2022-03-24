import java.util.Arrays;

/*Write a java method that Clone an array to backup array*/
public class COPY {
    public static int[] COPY() {
        int[] a={10,92,34,42,51};
        int[] x=new int[a.length];
        x=a;
        return x;
    }
    public static void main(String[] args) {

        System.out.println("copy the array="+ Arrays.toString(COPY()));
    }
}
