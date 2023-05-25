public class Lesson_4_AdditionTask {
    public static void main(String[] args) {
        getFibonacci();

    }

    public static void getFibonacci() {
        System.out.println("\n" + 1 + ") " + "********************************" + "\n");

        int numb = 0;
        int nextNumb = 1;
        int lastNumb = 0;

        int tempNumb;
        for (int i = 1; i <= 11; i++) {

//Variable nextNumb go to the place of numb
            tempNumb = numb;
            numb = nextNumb;
            nextNumb = tempNumb;

            //Variable numb go to the place of lastNumb
            tempNumb = lastNumb;
            lastNumb = numb;
            numb = tempNumb;

            System.out.print(i == 11 ? (numb + "\n") : (numb + ", "));
            nextNumb = lastNumb + numb;

        }
    }


}
