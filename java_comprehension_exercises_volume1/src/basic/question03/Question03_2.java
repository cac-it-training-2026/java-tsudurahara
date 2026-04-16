package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_2 {

	public static void main(String[] args) {

		// TODO:ここに実装
		int basePrice = 1200;//通常料金
		int tickets = 3;//チケット購入枚数
		int reducedPrice = basePrice - 200;//最終的な価格
		int reducedTickets = --tickets;
		int totalPrice = reducedPrice * reducedTickets;
		double taxRate = 1.1;//税率
		double DtotalWithTax = totalPrice * taxRate;
		int totalWithTax = (int) DtotalWithTax;

		System.out.println("購入枚数は" + reducedTickets + "枚です。");
		System.out.println("値下げ後の一枚当たりの料金は" + reducedPrice + "円です。");
		System.out.println("合計金額（税抜）は" + totalPrice + "です。");
		System.out.println("合計金額（税込）は" + totalWithTax + "です。");

	}
}
