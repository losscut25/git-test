package game;

import javax.swing.JOptionPane;

public class Study {
	public static void main(String[] args) {
		
		Slime s = null;
		
		Slime s1 = new Slime("�����");
		Slime s2 = new Slime("����");
		Human h = new Human("�˷���");
		
		System.out.println(s1.name + "�� " + s2.name + "�� ��Ÿ����! ����� �̸��� " + h.name + "�̴�\n");
		
		while(true) {

			String sTarget = JOptionPane.showInputDialog("��� �������� �����ϰڽ��ϱ�? 1�� " + s1.name + " 2�� " + s2.name);
			
			if(sTarget == null || sTarget.equals("")) {
				System.exit(0);
			}
			
			int target = Integer.parseInt(sTarget);
		
		if(target == 1) {
			
			s = s1;
	
		} else if(target == 2) {
			
			s = s2;
			
		} else {
			
			JOptionPane.showMessageDialog(null, "�ùٸ� ���ڸ� �Է��ϼ���");
		}
		if(s.hp <1) {
			
			System.out.println(s.name + "�� �̹� �׾��ִ�\n");
		} else {
			
			h.attack(s);
			s.attack(h);
		
		}
		if(s1.hp <1 && s2.hp<1) {
			JOptionPane.showMessageDialog(null, "Game Clear!");
			System.exit(0);
		}
		

	}

	}
}
