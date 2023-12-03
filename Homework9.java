import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class Homework9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> idPw = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("db.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");

                if (tokens.length == 2) {
                    String id = tokens[0];
                    String password = tokens[1];
                    idPw.put(id, password);
                } else {
                    System.out.println("error");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean login = false;
        while (!login) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = sc.nextLine().trim();

            if (idPw.containsKey(id)) {
                System.out.print("password : ");
                String pw = sc.nextLine().trim();

                if (idPw.get(id).equals(pw)) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    login = true;
                }
                else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                }
            }
            else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            }
        }
    }
}
