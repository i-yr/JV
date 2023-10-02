import java.util.Scanner;

class Student {
    int stdNum;
    String name;
    String major;
    int phoneNum;

    public Student (int stdNum, String name, String major, int phoneNum) {
        this.stdNum = stdNum;
        this.name = name;
        this.major = major;
        this.phoneNum = phoneNum;
    }

    public void setStdNum(int stdNum) {
        this.stdNum = stdNum;
    }

    public int getStdNum() {
        return stdNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        String strPhoneNum = Integer.toString(phoneNum);
        return "0" + strPhoneNum.substring(0,2) + "-" + strPhoneNum.substring(2,6) + "-" + strPhoneNum.substring(6);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i=0; i<3; i++)
        {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int stdNum = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            int phoneNum = sc.nextInt();


            students[i] = new Student(stdNum, name, major, phoneNum);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        System.out.println("첫번째 학생: " + students[0].getStdNum() + " " + students[0].getName()  + " " + students[0].getMajor() + " " + students[0].getPhoneNum());
        System.out.println("두번째 학생: " + students[1].getStdNum() + " " + students[1].getName() + " " + students[1].getMajor() + " " + students[1].getPhoneNum());
        System.out.println("세번째 학생: " + students[2].getStdNum() + " " + students[2].getName() + " " + students[2].getMajor() + " " + students[2].getPhoneNum());
    }
}
