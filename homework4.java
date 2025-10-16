import java.util.Scanner;

public class homework4 {
    static int gcd(int m, int n){//재귀함수
        if(n==0)
            return m;

        return gcd(n,m%n);
    }


    static int gcd2(int a, int b){//반복문버전
        int tmp;
        
        if(a<b){
            tmp=a;
            a=b;
            b=tmp;
        }
        
        while(b!=0){
            tmp=a%b;
            a=b;
            b=tmp;
        }

        return a;
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int result = gcd(m, n);
        System.out.println("두 수의 최대공약수는 " + result + "입니다.");


        //반복문버전
        System.out.print("두 수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result2 = gcd(a, b);
        System.out.println("두 수의 최대공약수는 " + result2 + "입니다.");
    }

    
}

