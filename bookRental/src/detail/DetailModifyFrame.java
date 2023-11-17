package detail;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DetailModifyFrame extends JFrame{

	JButton b1 = new JButton("상세화면으로");
	JButton b2 = new JButton("수정");

	public DetailModifyFrame() {

		setTitle("도서관리시스템 - 수정화면");
		setSize(400, 300);

		setPanel();

		setLocationRelativeTo(null);
		setVisible(true);

	}

	private void setPanel() {
		// TODO 自動生成されたメソッド・スタブ
		JPanel p = new JPanel(new GridLayout(0, 2));
		p.setSize(400, 500);

		JLabel l1 = new JLabel("책제목");
		JLabel l2 = new JLabel("카테고리");
		JLabel l3 = new JLabel("저자");
		JLabel l4 = new JLabel("출판사");
		JLabel l5 = new JLabel("책가격");
		JLabel l6 = new JLabel("대여상태");
		JLabel l7 = new JLabel("대여자");
		JLabel l8 = new JLabel("대여일");
		JLabel l9 = new JLabel("대여비");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		JTextField t5 = new JTextField(10);
//		JTextField t6 = new JTextField(10);
		String[] status = {"대여중", "대여가능", "분실"};
		JComboBox<String> cb6 = new JComboBox<String>(status);
		JTextField t7 = new JTextField(10);
		JTextField t8 = new JTextField(10);
		JTextField t9 = new JTextField(10);

		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(l3);
		p.add(t3);
		p.add(l4);
		p.add(t4);
		p.add(l5);
		p.add(t5);
		p.add(l6);
		p.add(cb6);
		p.add(l7);
		p.add(t7);
		p.add(l8);
		p.add(t8);
		p.add(l9);
		p.add(t9);


		p.add(b1);
		p.add(b2);

		add(p);

		b1.addActionListener(e-> {
			setVisible(false);
			new DetailFrame();
		});
		b2.addActionListener(e-> {
			JOptionPane.showMessageDialog(null, "수정되었습니다.");
			setVisible(false);
			new DetailFrame();

		});

	}

	public static void main(String[] args) {
		new DetailModifyFrame();
	}
}
