package game;

import javax.swing.JOptionPane;

public class Study2 {
	public static void main(String[] args) {


		Slime s = null;
		
		slime s1 = new Slime("슬라삐");
		slime s2 = new Slime("슬라디");
		
		s = s1;
		
		System.out.println(s.name);

    }
}
