package game;

import javax.swing.JOptionPane;

public class Study {
	public static void main(String[] args) {
		
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
			
			h.attack(s1);
			
			s1.attack(h);
	
		} else if(target == 2) {
			h.attack(s2);
			
			s2.attack(h);
			
		} else {
			
			JOptionPane.showMessageDialog(null, "�ùٸ� ���ڸ� �Է��ϼ���");
		}

	}

	}
}
