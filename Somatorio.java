public class Somatorio {
    
    public static int somatorio(int n){
        if(n == 0) return n;
        return somatorio(n -1) + n;
    }

    public static void main(String args[]){
        
        System.out.println(somatorio(5));
    }
}
