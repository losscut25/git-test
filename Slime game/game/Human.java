package game;

public class Human {
	String name;
	int hp = 100;
	
	public Human(String n) {
		name = n;
	}
	
	public void attack(Slime s) {
		System.out.println("�ΰ��� " + s.name + "�� �����߽��ϴ�.");
		s.hp = s.hp - 30;
		
		if(s.hp<1) {
			System.out.println(s.name + "�� ����ߴ�\n");
		}
		else {
			System.out.println("���� " + s.name + "�� ü���� " + s.hp + "�̴�\n");	
		}		
	}
}
