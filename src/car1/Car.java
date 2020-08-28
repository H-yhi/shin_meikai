package car1;

public class Car {
	private String name; // 名前
	private int width; // 幅
	private int height; // 高さ
	private int length; // 長さ
	private double x; // 現在位置X座標
	private double y; // 現在位置Y座標
	private double fuel; // 残り燃料

	Car(String name, int width, int height, int length, double fuel){
		this.name = name; this.width = width; this.height = height;
		this.length = length; this.fuel = fuel;
		x = y = 0.0;
	}

	double getX() {return x;} // 現在位置X座標を取得
	double getY() {return y;} // 現在位置Y座標を取得
	double getFuel() {return fuel;} // 残り燃料を取得

	void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
	}

	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy); // 移動距離
		if(dist > fuel) {
			return false; // 移動できない ・・・燃料不足
		}else {
			fuel -= dist; // 移動距離の分だけ燃料が減る
			x += dx;
			y += dy;
			return true; // 移動完了
		}
	}

}
