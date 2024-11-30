package java102;

import java.util.ArrayList;

public class Grid<T> {
	private final ArrayList<ArrayList<T>> grid;
	public final int sideLength;
    private static int maxSideLength = 0;

	public Grid(int sideLength, T defaultVal) {
		this.sideLength = sideLength;
		this.grid = new ArrayList<ArrayList<T>>(sideLength);
		for (int i = 0; i < sideLength; i++) {
			grid.add(new ArrayList<>(sideLength));
			for (int j = 0; j < sideLength; j++) {
				grid.get(i).add(defaultVal);
			}
		}
	}

	public T get(int row, int col) {
		return grid.get(row).get(col);
	}

	public void set(int row, int col, T val) {
		grid.get(row).set(col, val);
	}

	@Override
	public String toString() {
		String str = "";
		for (ArrayList<T> row : grid) {
			for (T element : row) {
				str += element + " ";
			}
			str += "\n";
		}
		return str;
	}

    public ArrayList<T> diagonal() 
    {
        ArrayList<T> diagonalElements = new ArrayList<>();
        int size = grid.length;
        for (int i = 0; i < size; i++) {
            diagonalElements.add(grid[i][i]);
        }
        return diagonalElements;
    }

    public static int maxSideLength()
    {
        if (sideLength > maxSideLength) {
            maxSideLength = sideLength;
        }
        return maxSideLength;
    }
}