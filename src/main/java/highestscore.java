public class highestscore {
    public static void main(String[] args) {
        double[] cgpa= new double[]{3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double highest= cgpa[0];
        double secondHighest= cgpa[1];

        for (int i=1; i<10 ; i++){
            if (highest < cgpa[i]){
                highest = cgpa[i] ;
            }
        }
        System.out.println("Highest= " +highest);

        for (int i=1 ; i<10 ; i++){
            if (cgpa[i]> secondHighest && cgpa[i]< highest){
                secondHighest= cgpa[i];
            }
        }
        System.out.println("Second highest= " +secondHighest);
    }
}
