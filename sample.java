import java.util.*;
public class sample
{
	public static void main(String[] args) {

//printing odd numbers using while loop
	    // int i=0;
		// while(i<=100){
		//     if(i%2==0){
		//         System.out.println(i);
		//     }
		//     i++;
		// }

//array printing
		// int arr[]=new int[5];
		// Scanner scan=new Scanner(System.in);
		// for(int i=0; i<5; i++){
		// 	arr[i]=scan.nextInt();
		// }
		// for(int i=0;i<5;i++){
		// 	System.out.println(arr[i]);
		// }


//type conversion
        // char ch='a';
        // String str=ch + "";
        // System.out.println(str);

//printing array element while giving input
        // Scanner scan=new Scanner(System.in);
        // int n=scan.nextInt();

        // int arr[]=new int[n];

        // for(int i=0; i<n; i++){
        //     arr[i]=scan.nextInt();
        // }

        // for(int i=0; i<n; i++){
        //     System.out.println(arr[i] + " is " + i + "th element in array");
        // }


//greatest number in a array
        // Scanner scan=new Scanner(System.in);
        // int n=scan.nextInt();

        // int arr[]=new int[n];
        // int num=arr[0];

        // for(int i=0; i<n; i++){
        //     arr[i]=scan.nextInt();
        // }

        // for(int i=0; i<n; i++){
        //     if(arr[i]>num){
        //         num=arr[i];
        //     }
        // }
        // System.out.println(num);


//prime number        
        int i,n,flag;
        flag=1;
        n=7;
        for(i=2; i<=n; i++){
                if(n%i == 0){
                        flag=0;
                        break;
                }
                else{
                        i=i+1;
                }
        }
        if(flag=0){
                System.out.println("it is prime");
        }
        else{
                System.out.println("it is not prime");
        }

	}
}