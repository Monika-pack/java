package arrays;
import java.util.Scanner;
public class TwoDimensional {

	public static void main(String[] args) {
		int rows, columns;
		int[][] Employees = new int[100][50];

		for (rows = 0; rows < 100 ; rows++) {
			for (columns = 0; columns < 50; columns++) {
				Employees[rows][columns] = rows + columns;
			}
		}

	}

}
