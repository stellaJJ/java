import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Homework9 {

    public static void main(String[] args) {

        Map<String, String> db = new HashMap<>();

        try {
            File file = new File("db.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.length() == 0) {      // 빈 줄은 건너뛰기
                    continue;
                }

                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    String id = parts[0].trim();
                    String pw = parts[1].trim();
                    db.put(id, pw);
                }
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("ID와 Password를 입력하세요.\nID: ");
            String inputId = sc.nextLine().trim();

            if (!db.containsKey(inputId)) {
                System.out.println("입력한 ID가 존재하지 않습니다. 다시 입력하세요.");
                continue;
            }

            System.out.print("Password: ");
            String inputPw = sc.nextLine().trim();

            // 비밀번호 일치 여부 확인
            String realPw = db.get(inputId);
            if (realPw.equals(inputPw)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
            }
        }

        sc.close();
    }
}
