// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Random;
import java.util.Scanner;

class Lesson_6 {
    public static void main(String[] args) {
        getThreeDimArray();
        paintChessBoard();
    }


    //1) Method for increasing three-dimensional array by number. Output new array to the console
    public static void getThreeDimArray() {
        System.out.println("\n" + 1 + ") " + "********************************" + "\n");

        Scanner scan = new Scanner(System.in);

        //Initialisation of array arr
        //First way
//        int[][][] arr = new int[][][]
//                {
//                        {
//                                {
//                                        1, -2, 13
//                                },
//                                {
//                                        4, 0, 6
//                                },
//                                {
//                                        7, 8, -9
//                                },
//                                {
//                                        -10, 11, 0
//                                }
//                        },
//                        {
//                                {
//                                        10, 0, 12
//                                },
//                                {
//                                        -13, 24, 15
//                                },
//                                {
//                                        16, 17, -28
//                                },
//                                {
//                                        19, -20, 21
//                                }
//                        }
//
//                };


        //Initialisation of array arr
        //Second way
        System.out.print("Input quantity of rows of the array: ");
        int row = scan.nextInt();

        System.out.print("Input quantity of columns of the array: ");
        int col = scan.nextInt();

        System.out.print("Input depth of the array: ");
        int depth = scan.nextInt();

        int[][][] arr = new int[row][col][depth];


        //Filling the array with help of class Random
        Random random = new Random();

        System.out.println("Original array arr:");
        for (int outer = 0; outer < row; outer++) {
            for (int mid = 0; mid < col; mid++) {
                for (int iner = 0; iner < depth; iner++) {
                    arr[outer][mid][iner] = random.nextInt(-10, 20); //?????????
                    System.out.print(arr[outer][mid][iner] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        //Create new array newArr. Fill it with elements of the array arr increased by number
        int[][][] newArr = new int[row][col][depth];

        System.out.print("Enter any positive integer number: ");
        int numb = scan.nextInt();

        System.out.println("New array newArr:");
        for (int outer = 0; outer < row; outer++) {
            for (int mid = 0; mid < col; mid++) {
                for (int iner = 0; iner < depth; iner++) {
                    newArr[outer][mid][iner] = arr[outer][mid][iner] + numb; //?????????
                    System.out.print(newArr[outer][mid][iner] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    //2) Method for painting a chess board
    public static void paintChessBoard() {
        System.out.println(2 + ") " + "********************************" + "\n");

        //Initialisation of array chessBoard
        char[][] chessBoard = new char[8][8];
        char black = 'B';
        char white = 'W';

        //Fill array with 'B' and 'W' in chess order
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if (((i % 2 == 0) && (j % 2 == 0)) || ((i % 2 != 0) && (j % 2 != 0))) {
                    chessBoard[i][j] = white;
                } else {
                    chessBoard[i][j] = black;
                }
                System.out.print(chessBoard[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }

}

