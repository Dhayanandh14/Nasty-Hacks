import java.util.*;

class NastyHacks {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
   int n;
   int r,e,c;
   n=kbd.nextInt(); 
   for(int i=0;i<n;i++){
     r=kbd.nextInt();
     e=kbd.nextInt();
     c=kbd.nextInt();
     if(e-c==r){
      System.out.println("does not matter");
     }
     else if(e-c>r){
       System.out.println("advertise");
     }
     else{
       System.out.println("do not advertise");
     }
   }
   
  
  }
}
