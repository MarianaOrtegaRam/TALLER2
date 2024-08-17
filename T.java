public class T extends Thread {
    
    private static Maximo oMax = new Maximo () ;
    private int num = 0 ;
    private static int[] vector;
    private int totThreads;

    public T(int n) {
        num = n;
    }

    public void run() {


        oMax.anotar (num) ;
        }
    
        public static void main(String[] args) {
        int [] vec = {1,4,2,8,3,77,4,6,10,8,10,3};
        vector = vec;

        for ( int i = 0; i < threads+1; i++){
            new T(i).start();
        }

        System.out.println ("El máximo es: " + oMax.darMaximo()) ;
    }
}
