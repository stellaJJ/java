import java.util.Scanner;

class studentInfo{
    int id;
    String name;
    long phone;
    String major;

    studentInfo(int id, String name, String major, long phone){
        this.id=id;
        this.name=name;
        this.major=major;
        this.phone=phone;
    }

    int getId(){return id;}
    String getName(){return name;}
    String getMajor(){return major;}
    long getPhone(){return phone;}

    void setId(int id){this.id=id;}
    void setName(String name){this.name=name;}
    void setMajor(String major){this.major=major;}
    void setPhone(long phone){this.phone=phone;}

    String formatedPhone(){//0복구, -추가
        String ph="0"+phone;
        return ph.substring(0, 3) + "-" + ph.substring(3, 7) + "-"
                + ph.substring(7);
    }
    public String toString(){
        return id+" "+ name+" " + major+ " "+formatedPhone();
    }
}

public class homework2_studentInfo {
    public static void main(String[] args) {
        studentInfo[] student= new studentInfo[3];

        Scanner sc= new Scanner(System.in);
        for(int i=0; i<3; i++) {
            System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int id = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phone = sc.nextLong();

            student[i]=new studentInfo(id, name, major,phone);

        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        String [] numToKor={"첫","두","세"};

        for (int i=0; i<3; i++){
            System.out.printf(numToKor[i] +"번째학생: "+ student[i]+ "\n" );
        }


    }
}
