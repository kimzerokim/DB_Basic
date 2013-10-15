package db.generateData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateData {
	private final static int _MAX = 1000000;

	public static void main(String args[]) throws IOException {
		String filename = "/Users/YoungKim/Documents/DB_TestData/testfile";
		String ext = ".csv";
		for (int i = 0; i < 10; i++)
			genData(filename + i + ext, i);
		System.out.println("main finish");
	}

	public static void genData(String filename, int index) throws IOException {
		Random r = new Random();
		BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
		for (int i = 0; i < _MAX; i++) {
			StringBuffer sb = new StringBuffer();
			sb.append("");
			int num = index * _MAX + i;
			sb.append("id" + num + ",");
			sb.append("name" + num + ",");
			sb.append(getLeague() + ",");
			sb.append(r.nextInt(5000) * 100 + ",");
			sb.append(r.nextInt(5000) + ",");
			int pnum = r.nextInt(1000);
			int win = (int) (pnum * r.nextDouble());
			sb.append(pnum + "," + win);
			sb.append("\n");
			bw.write(sb.toString());
		}
		bw.close();
	}

	public static char getLeague() {
		int x = (int) (Math.random() * 10 + 1);
		switch (x) {
		case 1:
			return 'D';
		case 2:
			return 'P';
		case 3:
			return 'G';
		case 4:
		case 5:
			return 'S';
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		default:
			return 'B';
		}
	}
}