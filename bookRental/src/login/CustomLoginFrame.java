package login;

import javax.swing.JFrame;

public class CustomLoginFrame extends JFrame{

	public CustomLoginFrame() {
		//타이틀
		setTitle("도서관리 - 관리자 로그인");
		//프레임을 화면에 보이게 하는 명령어
		setVisible(true);
		//프레임의 크기를 설정한다(픽셀 단위)
		setSize(600, 400);
		//프레임을 화면 가운데 오게 하는 명령어
		setLocationRelativeTo(null);
		//프레임 종료시 프로세스도 종료 시키는 명령어
		setDefaultCloseOperation(3);

		setLayout(null);


	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new CustomLoginFrame();
	}

}
