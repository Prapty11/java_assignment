import java.util.Scanner;

public class babyheight {
    public static void main(String[] args) {
        int[] height = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Babies height:" );

        for (int i=0; i<height.length; i++){
            height[i]= sc.nextInt();
        }
        int lowestHeight1= Integer.MAX_VALUE;
        int lowestHeight2= Integer.MAX_VALUE;

        for (int i=0; i<10; i++){
            if (height[i]< lowestHeight1){
                lowestHeight1= lowestHeight2;
                lowestHeight1=height[i];
            }
            if (height[i]<lowestHeight2 && height[i]!= lowestHeight1){
                lowestHeight2= height[i];
            }
        }
        System.out.println("Two babies lowest height");
        System.out.println("1st lowest height " + lowestHeight1 + "cm");
        System.out.println("2nd lowest height " + lowestHeight2+ "cm");
    }
}
