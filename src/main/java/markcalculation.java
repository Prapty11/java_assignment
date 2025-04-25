public class markcalculation {
    public static void main(String[] args) {
        int totalQuestions = 15;
        int totalMarks = 100;

        for (int fiveMark = 0; fiveMark <= totalQuestions; fiveMark++) {
            int tenMark = totalQuestions - fiveMark;

            int marks = (fiveMark * 5) + (tenMark * 10);

            if (marks == totalMarks) {
                System.out.println("5-mark questions: " + fiveMark);
                System.out.println("10-mark questions: " + tenMark);
                return;
    }
}
    }
}