package human1;
import java.util.Scanner;
public class humanTester {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("名前は："); String name = stdIn.next();
		System.out.println("身長は："); double heigth = stdIn.nextDouble();
		System.out.println("体重は："); double weight = stdIn.nextDouble();

		human human = new human(name, heigth, weight);

		System.out.println(human.getName() + "さん");
		System.out.println(human.getHeigth() + "cm");
		System.out.println(human.getWeiht() + "kg");
	}

}
