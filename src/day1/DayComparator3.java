package day1;
import java.util.Scanner;
public class DayComparator3 {

	static boolean compDay(Day d1, Day d2) {
		return d1.getYesr()  == d2.getYesr()  &&
			   d1.getMonth() == d2.getMonth() &&
			   d1.getDate()  == d2.getDate();
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int y, m, d;
		System.out.println("日付1を入力せよ。");
		System.out.println("年："); y = stdIn.nextInt();
		System.out.println("月："); m = stdIn.nextInt();
		System.out.println("日："); d = stdIn.nextInt();
		Day day1 = new Day(y, m, d);

		System.out.println("日付2を入力せよ。");
		System.out.println("年："); y = stdIn.nextInt();
		System.out.println("月："); m = stdIn.nextInt();
		System.out.println("日："); d = stdIn.nextInt();
		Day day2 = new Day(y, m, d);

		if(compDay(day1, day2)) {
			System.out.println("等しいです。");
		}else {
			System.out.println("等しくありません。");
		}
	}

}
