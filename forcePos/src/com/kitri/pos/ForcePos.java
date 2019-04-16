
package com.kitri.pos;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EtchedBorder;



public class ForcePos extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	final JTextField userTf;
	final JTextField passTf;
	private RoundedButton rb_1;
	private JButton exitB;
	private JButton loginB;
	private MainFrame mainFrame; // 메인 프레임
	private UserDao userDao;
	public Administrator administrator;

	// 생성자
	public ForcePos() {
		super("ForcePos");
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 15, 1326, 753);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 배경화면 패널
		JPanel background = new JPanel() {
			private static final long serialVersionUID = 1L;
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize(); // 패널의 크기를 얻어옴
				ImageIcon image = new ImageIcon("E:\\javadata\\Workspace\\javase\\pos\\src\\image\\Background.png"); // 이미지얻어옴.
				g.drawImage(image.getImage(), 0, 0, d.width, d.height, null); // Jpanel의 크기에 맞게 이미지를 그린다.
				setOpaque(false); // 배경을 투명하게 설정해줌
				super.paintComponent(g);
			}
		};
		background.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		background.setOpaque(false);

		background.setBounds(0, 34, 1320, 633);
		contentPane.add(background);
		background.setLayout(null);

		JPanel title = new JPanel();
		title.setOpaque(false);
		title.setBounds(12, 10, 1278, 83);
		background.add(title);
		title.setLayout(new BorderLayout(0, 0));

		JLabel Forcepos = new JLabel("Forcepos");
		Forcepos.setHorizontalTextPosition(SwingConstants.CENTER);
		Forcepos.setForeground(new Color(0, 128, 128));
		Forcepos.setHorizontalAlignment(SwingConstants.CENTER);
		Forcepos.setFont(new Font("Consolas", Font.BOLD, 70));
		title.add(Forcepos, BorderLayout.CENTER);

		// 로그인 화면 패널 설정
		JPanel user = new JPanel() {
			private static final long serialVersionUID = 1L;
			@Override
			protected void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("E:\\javadata\\Workspace\\javase\\pos\\src\\image\\Usericon.png");
				g.drawImage(image.getImage(), 0, 0, d.width, d.height, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		user.setBounds(328, 129, 153, 165);
		background.add(user);

		// 유저 패널
		JPanel userP = new JPanel();
		userP.setOpaque(false);
		userP.setBounds(497, 129, 475, 165);
		background.add(userP);
		userP.setLayout(new BorderLayout(0, 0));

		// 패스워드 패널 설정
		JPanel pass = new JPanel() {
			private static final long serialVersionUID = 1L;
			@Override
			protected void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("E:\\javadata\\Workspace\\javase\\pos\\src\\image\\KEY.png");
				g.drawImage(image.getImage(), 0, 0, d.width, d.height, null);
				setOpaque(false);
				super.paintComponent(g);
			};
		};
		pass.setOpaque(false);
		pass.setBounds(328, 320, 153, 156);
		background.add(pass);

		// 패스워드 패널
		JPanel passP = new JPanel();
		passP.setBounds(497, 320, 475, 156);
		background.add(passP);
		passP.setLayout(new BorderLayout(0, 0));

		// 비밀번호텍스트필드
		passTf = new JPasswordField(6);
		passP.add(passTf, BorderLayout.CENTER);
		passTf.setHorizontalAlignment(SwingConstants.CENTER);
		passTf.setFont(new Font("맑은 고딕", Font.ITALIC, 40));

		// 비밀번호를 입력받는
		passTf.setText("");
		passTf.setColumns(10);
		passTf.addActionListener(this);

		// 버튼두개
		JPanel SouthButt = new JPanel();
		SouthButt.setOpaque(false);
		SouthButt.setBounds(388, 518, 518, 73);
		background.add(SouthButt);
		SouthButt.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));

		// 로그인 버튼
		// 둥글게 만드는 버튼 클래스 객체 생성후 대입
		loginB = new JButton("\uB85C\uADF8\uC778 ");
		RoundedButton rb = new RoundedButton("로그인");
		rb.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		loginB = rb;

		loginB.setForeground(new Color(240, 248, 255));
		loginB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginB.setSize(new Dimension(10, 10));
		loginB.setIconTextGap(1);
		loginB.setBackground(new Color(28, 94, 94));
		loginB.setFont(new Font("맑은 고딕", Font.PLAIN, 50));
		SouthButt.add(loginB);

		// 종료 버튼
		// 둥글게 만드는 버튼 클래스 객체 생성후 대입
		exitB = new JButton("\uC885\uB8CC");
		rb_1 = new RoundedButton("종   료");
		rb_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 127, 80), new Color(255, 127, 80)));
		exitB = rb_1;

		exitB.setBackground(new Color(255, 99, 71));
		exitB.setForeground(new Color(240, 248, 255));
		exitB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exitB.setIconTextGap(1);
		exitB.setMinimumSize(new Dimension(73, 23));
		exitB.setMaximumSize(new Dimension(73, 23));
		exitB.setFont(new Font("맑은 고딕", Font.PLAIN, 50));
		SouthButt.add(exitB);

		// 유저 텍스트필드
		userTf = new JTextField(6);
		userTf.setBounds(497, 129, 475, 165);
		background.add(userTf);
		userTf.setHorizontalAlignment(SwingConstants.CENTER);
		userTf.setFont(new Font("맑은 고딕", Font.ITALIC, 40));

		// 아이디를 입력받는
		userTf.setText("");
		userTf.setColumns(10);
		setResizable(false);

		// 이벤트 리스너 등록
		userTf.addActionListener(this);
		passTf.addActionListener(this);
		loginB.addActionListener(this);
		exitB.addActionListener(this);

	}
	
// 아이디 비밀번호 유효성 검사
	public boolean isLoginCheck() {
			boolean loginCheck = false;
			
		if(userTf.getText().trim().isEmpty() || passTf.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, "공백은 싫어.", "입력오류", 
					JOptionPane.ERROR_MESSAGE);
		} else {
			loginCheck = true;	
		}
		return loginCheck;
	}

	//메인프레임을 보여줘
	public void showFrame() {
		mainFrame = new MainFrame();
		mainFrame.setVisible(true);
		this.setVisible(false);
	}

	// 실행
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForcePos forcePos = new ForcePos();
					forcePos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();
		
		if (isLoginCheck()) {
			passTf.requestFocus();
		}
		
		if(ob == passTf) {
			showFrame();
		}
		
		//로그인 버튼을 눌렀을 경우
		if (ob == loginB) {
			String id = userTf.getText().trim();
			String pw = passTf.getText().trim();		

			//DB에 있는 아이디와 비밀번호가 일치할 경우 
			userDao = new UserDao();
			if(userDao.pass(id, pw) == true) {
				JOptionPane.showMessageDialog(this, "'+ id +'" + " 님 환영합니다.");
			} else {
					JOptionPane.showMessageDialog(this, "ID, PASSWORD 확인바래요!","입력오류 ", 
							JOptionPane.WARNING_MESSAGE);
				}
			}
		
		//종료 버튼 
		if (ob == exitB) {
			System.exit(0);
		}
	}
}
