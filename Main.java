public class Main {
    public static void main(String[] args) {
      int n1 = 2;
      for(int j = 0; j <= 100; j++){
        if(primos(n1)){
          System.out.println(n1);

        }
        n1++;
      } 
    }

 public static boolean primos (int num) {
   if (num <= 1){
     return false;
   }
   for(int i = 2; i * i <= num; i++){
     if (num % i == 0){
       return false;
     }

   }
   return true;
 }
}