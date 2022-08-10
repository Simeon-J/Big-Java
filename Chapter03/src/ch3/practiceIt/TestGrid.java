package ch3.practiceIt;

public class TestGrid {
    public static void main(String[] args) {
        printGrid(10,10);
    }

    public static void printGrid(int row, int col) {
        String grid = "";
        // single column
        if (col == 1) {
            for (int r = 1; r <= row; r++) {
                grid = grid.concat(r + "\n");
            }
        // single row
        } else if (row == 1) {
            for (int c = 1; c <= col; c++) {
                if (c == col) {
                    grid = grid.concat(c + "");
                    break;
                }
                grid = grid.concat(c + ", ");
            }
        } else {
            for (int r = 1; r <= row; r++) {
                int g = r;
                for (int c = 1; c <= col; c++) {
                    if (c == col) {
                        grid = grid.concat(g + "\n");
                        break;
                    }
                    grid = grid.concat(g + ", ");
                    g += row;
                }
            }
        }
        System.out.println(grid);
    }
}
