package day1;
import java.util.Scanner;
public class DayTester {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		String[] wd   = {"日", "月", "火", "水", "木", "金", "土"};

		System.out.println("誕生日を西暦で入力せよ。");
		System.out.println("年："); int y = stdIn.nextInt();
		System.out.println("月："); int m = stdIn.nextInt();
		System.out.println("日："); int d = stdIn.nextInt();

		Day birthday = new Day(y, m, d);
		System.out.println("あなたの誕生日"
				           + birthday.getYesr()       + "年"
				           + birthday.getMonth()      + "月"
				           + birthday.getDate()       + "日"
				           + wd[birthday.dayOfWeek()] + "曜日です。");
	}

}
