public class sortingscore {
    public static void main(String[] args) {
        double[] cgpa= new double[]{3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double temp= 0;
        for (int i=0 ; i<cgpa.length-1 ; i++){
            for (int j=i+1 ; j<cgpa.length ; j++){
                if (cgpa[i]<cgpa[j]){
                    temp= cgpa[i];
                    cgpa[i]=cgpa[j];
                    cgpa[j] = temp;
                }
            }
        }
        System.out.println("Sorting score");
        for (int i=0 ; i<cgpa.length; i++){
            System.out.println(cgpa[i] +"");

        }

    }
}
