package Array;

import java.util.HashSet;

public class ValidSudoku {

    //Best and simple solution
    public static boolean isValidSudoku(char[][] board) {

        int n = 9;
        HashSet<Character> row[] = new HashSet[9];
        HashSet<Character> col[] = new HashSet[9];
        HashSet<Character> sub[][] = new HashSet[3][3];
        for(int i=0; i<n; i++) {
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
        }
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                sub[i][j] = new HashSet<>();
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                char c = board[i][j];
                if(c<'0' || c>'9') continue;
                int x = (i/3), y = (j/3);
                if(!row[i].add(c) || !col[j].add(c)
                        || !sub[x][y].add(c)) return false;

            }
        }
        return true;
    }

    public static boolean isValidSudokuBS(char [][]board){
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char currentChar = board[i][j];
                if(currentChar!='.'){
                    if(!set.add(currentChar+"found in row "+i)||!set.add(currentChar+"found in column "+j)||!set.add(currentChar+" found in box"+i/3+j/3))
                        return false;
                }
            }
        }
        return true;
    }






    public static void main(String args[]){
        char [][] board ={{'5','3','.','.','5','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println("Valide Sudoku: "+isValidSudokuBS(board));
    }
}