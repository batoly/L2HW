/*Write a java method that Reverse an array using another array*/
public class Revers {
    public static void main(String[] args) {
        int[]a = {11, 12, 13, 14, 15};
        reverse(a,a.length);
    }
    public  static void reverse(int a[],int x){
        int []n=new int[x];
        int j=x;
        for (int i = 0; i <x; i++) {
            n[j-1]=a[i];
            j=j-1;
            System.out.println("Revers array is \n");
            for (int k = 0; k <x ; k++) {
                System.out.println(n[k]);
            }
        }
    }



}