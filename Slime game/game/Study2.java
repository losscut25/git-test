package game;

import javax.swing.JOptionPane;

public class Study2 {
	public static void main(String[] args) {
		int hp = 100;
		
		while(true) {
			if(hp<1) {
				JOptionPane.showMessageDialog(null, "Game Over");
				break;
			}
			JOptionPane.showMessageDialog(null, "���� ���ΰ��� ü���� " +hp + "�̴�");
		}
	}

}
