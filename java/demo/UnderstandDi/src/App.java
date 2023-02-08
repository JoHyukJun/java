import java.util.Date;

import javax.swing.undo.StateEdit;;

class Member {
    String name;
    String nickname;
    public Member() {}
}

public class App {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        System.out.println(date);
    }

    public static void getDate(Date d) {
        Date date = d;
        System.out.println(date);
    }

    public static void memberUser1() {
        // 강한 결합 : 직접 생성
        Member m1 = new Member();
    }

    public static void memberUser2(Member m) {
        // 약한 결합 : 생성된 것을 주입 받음
        Member m2 = m;
    }
}
