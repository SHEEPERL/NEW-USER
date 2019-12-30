package 第七章;

public class DeckOfCards {

	public static void main(String[] args) {
		int[] deck = new int[52];//为整副牌定义一个数组
		String[] suits = {"Spades","hearts","Diamonds","Clubs"};//为花色定义一个数组
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		//为同种花色中的1-13位数的牌定义一个数组
		
		for(int i = 0;i<deck.length;i++) {//将整副牌初始化
			deck[i] = i;
		}
		
		for(int i = 0;i<deck.length;i++) {//洗牌
			int index = (int)(Math.random()*deck.length);//随机抽取一个数组下标
			int temp = deck[i];//将随机数与顺序数交换达到洗牌的目的
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		for(int i = 0;i<4;i++) {//显示前四张卡（此时牌已经打乱，故前四张牌随机排序）
			String suit  = suits[deck[i] / 13];//判断花色（假设0-12为黑桃...)
			String rank = ranks[deck[i] % 13];//判断牌的大小
			System.out.println("Card number "+ deck[i] + ": " + rank + " of "+ suit);
		}
		
		/*
		法二
		for(int i = 0;i<4;i++) {
			int cardNumber = (int)(Math.random()*deck.length);
			String suit = suits[cardNumber / 13];
			String rank = ranks[cardNumber % 13];
			System.out.println("Card number "+ cardNumber + ": " + rank + " of "+ suit);
		}*/

	}

}
