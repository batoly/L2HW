import java.util.Arrays;

/*Write a java method that Repeatedly selects and remove a random entry..*/
public class Random {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        System.out.println(Arrays.toString(random(a)));
    }
    public static int [] random(int[]x){
        java.util.Random random=new java.util.Random();
        int index=random.nextInt(x.length-1);
        System.out.println(index);
        for (int i = 0; i <x.length ; i++) {
            if (index<=i)
            {
                x[i]=-1;
            }

        }
        return x;
    }
}
