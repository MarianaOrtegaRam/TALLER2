public class Maximo {


    public int maximo = 0;

    public synchronized  void anotar(int n){
        if (n>maximo){
            maximo =n;
        }
    }

    public synchronized int darMaximo(){
        return maximo;
    
    }
    
}
