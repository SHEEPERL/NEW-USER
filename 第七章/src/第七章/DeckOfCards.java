package ������;

public class DeckOfCards {

	public static void main(String[] args) {
		int[] deck = new int[52];//Ϊ�����ƶ���һ������
		String[] suits = {"Spades","hearts","Diamonds","Clubs"};//Ϊ��ɫ����һ������
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		//Ϊͬ�ֻ�ɫ�е�1-13λ�����ƶ���һ������
		
		for(int i = 0;i<deck.length;i++) {//�������Ƴ�ʼ��
			deck[i] = i;
		}
		
		for(int i = 0;i<deck.length;i++) {//ϴ��
			int index = (int)(Math.random()*deck.length);//�����ȡһ�������±�
			int temp = deck[i];//���������˳���������ﵽϴ�Ƶ�Ŀ��
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		for(int i = 0;i<4;i++) {//��ʾǰ���ſ�����ʱ���Ѿ����ң���ǰ�������������
			String suit  = suits[deck[i] / 13];//�жϻ�ɫ������0-12Ϊ����...)
			String rank = ranks[deck[i] % 13];//�ж��ƵĴ�С
			System.out.println("Card number "+ deck[i] + ": " + rank + " of "+ suit);
		}
		
		/*
		����
		for(int i = 0;i<4;i++) {
			int cardNumber = (int)(Math.random()*deck.length);
			String suit = suits[cardNumber / 13];
			String rank = ranks[cardNumber % 13];
			System.out.println("Card number "+ cardNumber + ": " + rank + " of "+ suit);
		}*/

	}

}
