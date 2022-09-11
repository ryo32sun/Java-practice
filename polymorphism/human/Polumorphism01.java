package polymorphism.human;

public class Polumorphism01 {
	public static void main(String[] arge) {
		Human human1 = new Student("佐藤", 17, 70);
		System.out.println("Humanクラスのメソッド:プロフィールを紹介します。" + human1.getProfile());

		Human human2 = new Employee("田中", 28, "システム部");
		System.out.println("Humanクラスのメソッド:プロフィールを紹介します。" + human2.getProfile());
	}
}
