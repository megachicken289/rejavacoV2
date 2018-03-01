package chapters.ch8.b_Controlling_Access_To_Members;

import chapters.ch8.a_Case_Study.Time1;

public class MemberAccessTest {
	public static void main (String[] args) {
		Time1 time = new Time1();

//        time.hour = 7;      // error: hour has privat access in Time1
//        time.minute = 15;   // error: hour has privat access in Time1
//        time.second = 30;   // error: hour has privat access in Time1
	}
}
