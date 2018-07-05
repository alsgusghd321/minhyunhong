import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToeClient extends Thread {
	private JButton[][] buttons = new JButton[19][19];
	private char me, other;
	private JFrame frame;
	private JPanel panel;
	private JLabel message;
	private Socket socket;
	private BufferedReader input;
	private PrintWriter output;


	public TicTacToeClient() throws UnknownHostException, IOException {
		socket = new Socket("127.0.0.1", 1324);

		input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		output = new PrintWriter(socket.getOutputStream(), true);

		frame = new JFrame();
		panel = new JPanel();
		panel.setLayout(new GridLayout(19, 19, 2, 2));
		Font font = new Font("Dialog", Font.ITALIC, 50);

		message = new JLabel("���⿡ �޽����� ǥ�õ˴ϴ�.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel, BorderLayout.CENTER);
		frame.add(message, BorderLayout.SOUTH);
		frame.setSize(700, 700);
		frame.setVisible(true);

		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				final int ii = i;
				final int jj = j;
				buttons[i][j] = new JButton(" ");
				buttons[i][j].setFont(font);

				buttons[i][j].addActionListener(e -> {
					buttons[ii][jj].setText("" + me);
					output.println("MOVE" + ii + "" + jj);
				});
				panel.add(buttons[i][j]);
			}
		}
		panel.repaint();
	}

	public void run() {
		String response;
		try {
			response = input.readLine();

			if (response.startsWith("START")) {
				me = response.charAt(6);
				other = (me == 'X') ? 'O' : 'X';
				message.setText("��Ⱑ ���۵˴ϴ�.");
				frame.setTitle("���� ����ڴ�" + me);
			}
			while (true) {
				response = input.readLine();
				if (response.startsWith("OTHER")) {
					int i = Integer.parseInt(response.substring(6, 7));
					int j = Integer.parseInt(response.substring(8, 9));
					buttons[i][j].setText("" + other);
					message.setText("������ �ξ����ϴ�.");
				} else if (response.startsWith("PRINT")) {
					message.setText(response.substring(6));
				}
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		TicTacToeClient client = new TicTacToeClient();
		client.start();
	}
}