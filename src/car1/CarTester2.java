package car1;
import java.util.Scanner;
public class CarTester2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("車のデータを入力せよ。");
		System.out.println("名前は："); String name = stdIn.next();
		System.out.println("車幅は："); int width = stdIn.nextInt();
		System.out.println("高さは："); int height = stdIn.nextInt();
		System.out.println("長さは："); int length = stdIn.nextInt();
		System.out.println("ガソリン量は："); double fuel = stdIn.nextDouble();

		Car myCar = new Car(name, width, height, length, fuel);

		while(true) {
			System.out.println("現在地（" + myCar.getX() + "," + myCar.getY() + "）・残り燃料" + myCar.getFuel());
			System.out.println("移動しますか[0・・・No/1・・・Yes]：");
			if(stdIn.nextInt() == 0) break;

			System.out.println("X方向の移動距離：");
			double dx = stdIn.nextDouble();
			System.out.println("Y方向の移動距離：");
			double dy = stdIn.nextDouble();

			if(!myCar.move(dx, dy))
				System.out.println("燃料が足りません！");
		}
	}

}
