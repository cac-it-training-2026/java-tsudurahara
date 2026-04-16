package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Scanner sc = new Scanner(System.in);

		String[] itemNames = new String[5];
		String[] Sprices = new String[5];
		int[] prices = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("商品" + (i + 1) + "を入力してください>");
			itemNames[i] = sc.next();
		}
		System.out.println("\n各商品の単価を順に入力してください。");

		for (int j = 0; j < 5; j++) {

			System.out.print(itemNames[j] + "の単価:");
			Sprices[j] = sc.next();
			prices[j] = Integer.parseInt(Sprices[j]);
		}
		System.out.println("\n登録商品一覧");
		for (int k = 0; k < 5; k++) {

			System.out.println(itemNames[k] + ":" + prices[k] + "円");

		}
	}

}
