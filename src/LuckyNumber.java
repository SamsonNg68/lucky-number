
import java.util.Scanner;

public class LuckyNumber {
	// khai báo hàm main() điều khiển làm luông chính của chương trình
	public static void main(String[] args) {
		// import Scanner để có thể nhâp giá trị vào
		Scanner sc = new Scanner(System.in);
		System.out.println("Tôi đang nghĩ một số trong khoảng từ 0 đến 100...");
		// gọi lai hàm play
		play(sc);
	}

	// khai báo hàm play() để thực hiện trò chơi
	public static void play(Scanner sc) {

		// sử dụng method Math random để lấy số ngẫu nhiên từ 0 đến 100;
		double root = (Math.random() * 100);
		// sử dung Math round để làm tròn thành só nguyên dương
		int randomNum = (int) Math.round(root);

		boolean winGame = false;
		int totalGuess = 0;
		int totalGame = 1;

		// sử dungg vong lăp while để lặp cho đến khi playerNum == randomNum
		while (winGame == false) {
			System.out.println("Bạn đoán?");
			int playerNum = sc.nextInt();

			// môi mọt lần đoán sai thì biên count sẽ cộng thêm 1
			totalGuess++;

			// sử dụng điều kiện if để kiểm tra playerNum và randomNum
			if (playerNum == randomNum) {
				// nếu đoán đúng sẽ in ra số lần đã đoán
				System.out.println("Chúc mừng bạn đã đoán đúng con số may mắn sau " + totalGuess + " lần dự doán!");
				// sử dụng do while loop để hỏi xem người dùng có muốn tiếp tục chơi hay ko sau
				// khi win game?
				do {
					System.out.println("Bạn có muốn tiếp tục chơi không?");
					String kp = sc.next();
					totalGame++;

					// sử dung if else để kiểm tra người dung có nhập "y" để tiếp tục hay ko?
					// nếu nhâp "y" , "yes", "YES","yes" thì chưương trình sẽ tiếp tục và biến
					// winGame = false để tiếp tục game.
					if (kp.equalsIgnoreCase("y") || kp.equalsIgnoreCase("yes")) {
						winGame = false;
						totalGuess++;
						play(sc);

					} else {
						// nếu không thì chường trinh sẽ goi hàm report để in ra kết quả tổng quát
						report(totalGame, totalGuess);

					}

				} while (winGame == true);
				// nếu winGame thì vòng lặp thỏa điều kiện sẽ ngưng.
				break;

			} else {

				if (playerNum > randomNum) {
					System.out.println("Số may mắn nhỏ hơn dự đoán của bạn.");

				} else {
					System.out.println("Số may mắn lớn hơn dự đoán của bạn.");
				}

			}
		}

	}

	// khai báo hàm report để hiển thi báo cáo
	public static void report(int totalGame, int totalGuess) {
		System.out.println("Kết quả tổng quát của trò chơi:");
		System.out.println("Tổng số lần chơi= " + totalGame);
//		System.out.println("Tổng số lần dự đoán= " + totalGuess);
//		System.out.println("Số dự đoán trung bình mỗi lượt= " + (double)totalGuess / totalGame);

	}

}
