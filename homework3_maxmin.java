import java.util.Scanner;
public class homework3_maxmin {
    public static void main (String [] arg){

        Scanner sc =new Scanner(System.in);
        System.out.println("몇 개의 수를 입력할 예정인가요?");

        int n=sc.nextInt(); //입력할 숫자 개수
        int[] nums=new int[n]; //숫자 배열

        for(int i=0; i<n; i++){
            System.out.println("수를 입력하세요.");
            nums[i]=sc.nextInt();
        }

        int max=nums[0]; int min=nums[0];

        for(int num : nums){
            if (num>max)
                max=num;
            if(num<min)
                min=num;
        }
        System.out.printf("최대값: %d\n",max);
        System.out.printf("최소값: %d\n",min);
    }
}
