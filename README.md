# JavaTypeConversion
文字列と数値の型変換

## 処理
文字列や数値の型変換（キャスト）します。

## コード
```
public class Typeconv {

	public static void main(String[] args) {
		System.out.println("** ケース1 **");
		double num1 = 3.15;
		System.out.println(num1);
		System.out.println((int)num1);
		System.out.println("");

		System.out.println("** ケース２ **");
		int num2 = 5;
		System.out.println(num2);
		System.out.println((double)num2);
		System.out.println("");

		System.out.println("** ケース３ **");
		String text = "123";
		System.out.println(text);
		System.out.println(Integer.parseInt(text) * 100);
		System.out.println(Double.parseDouble(text));
	}

}
```

## 出力結果
```
** ケース1 **  
3.15  
3  
  
** ケース２ **  
5  
5.0  
  
** ケース３ **  
123  
12300  
123.0  
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 統合開発環境(IDE)： | Eclipse 4.7.0 Oxygen |
| 開発言語： | Java8 |
