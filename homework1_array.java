import java.util.Scanner;
public class homework1_array {
    public static void main(String[] args){
        int[] num=new int[5]; int sum=0;

        System.out.println("정수 5개 입력: ");
        for(int i=0; i<5;i++){ //정수 입력
            Scanner sc=new Scanner(System.in);
            num[i]=sc.nextInt(); //배열에 입력값 저장하기
            sum+=num[i]; //정수 덧셈
        }
        System.out.printf("합은: %d ", sum); //합 출력
    }
}
