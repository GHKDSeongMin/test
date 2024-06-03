import java.text.DecimalFormat;

class Coffee{
	String menu;
	int unitPrice;
	int qty;
	
	public void coffeePrice() {
		DecimalFormat df = new DecimalFormat("￦#,###");
		
		System.out.printf("주문한 메뉴 %s 커피 대금은 %s원 입니다.",menu,df.format(unitPrice*qty));
	}
}

public class Wk13_202411037_Test01 {

	public static void main(String[] args) {
		Coffee aa = new Coffee();
		
		aa.menu = "카페모카";
		aa.unitPrice = 4000;
		aa.qty = 3;
		aa.coffeePrice();

	}

}
