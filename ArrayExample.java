import java.util.Scanner ;

public class ArrayExample {
    public static void main (String[] args) {
        Scanner scan = new Scanner ( System.in );
        double[] arr;   //declaration
        arr = new double[7];  //creation
            for ( int dex = 0; dex < arr.length; dex++){
            arr[dex] = Math.random() * 50;
        }
            double[] arr2 = {2,3,5,4,6,7,7,8,7};
            int arr3;
            arr3 = new int[5];
            
            for ( int dex = 0; dex < arr2.length; dex++){
                System.out.printf("Enter student" + (dex + 1) + "'s score");
                arr3[dex] = scan.nextInt();
            for ( int dex = 0; dex < arr2.length; dex++){
                System.out.printf("%3d\t");
    }
}
    }
}
        
                    