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
			JOptionPane.showMessageDialog(null, "현재 주인공의 체력은 " +hp + "이다");
		}
	}

}
