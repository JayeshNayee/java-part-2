import javax.lang.model.util.ElementScanner14;

// class A{

//     void show()
//     {
//         System.out.println("I am in A");
//     }
// }

//  class B  extends  A{
//     void show(){
//         System.out.println("I am in B");
//     }
// }
// class C extends A
// {
//     void show(){
//         System.out.println("I am in C");
//     }
//     public static void main(String[] args) {

//         A a1 = new A();
//         a1.show();
//         System.out.println("******");
//         B b1 = new B();
//         b1.show();
//         b1.show();
//         System.out.println("******");
//         C c1 = new C();
//         c1.show();
      
//         c1.show();
     
//     }
// }
// import java.lang.Thread;
// class ThreadProgram extends Thread
// {
//      public void run(){
//         for(int i = 0; i<3; i++){
//         System.out.println("jayesh");
//         }
//     }
//     public static void main(String[] args) {
        
//         ThreadProgram t1 = new ThreadProgram();
//         t1.start();
//         for(int i = 0; i<3; i++){
//         System.out.println("Pragnesh");
//         }
//     }
// }
// import java.lang.Thread;
// class ThreadProgram implements Runnable
// {
//      public void run(){
//         for(int i = 1;i<=5;i++){
//         System.out.println("jayesh");
//         }
//     }
//     public static void main(String[] args) {
        
//         ThreadProgram r = new ThreadProgram();
//         Thread t = new Thread(r);
//         t.start();
//         for(int i = 1 ;i<=5; i++){
//         System.out.println("Pragnesh");
//         }
//     }
// }

class EvenOdd extends Thread
{
   public void run(){

    int oddSum = 0 , evenSum = 0;
    Thread t = Thread.currentThread();
    String threadName = t.getName();
    if(threadName.equals("odd")){
        for(int i =1 ; i<=20; i =i+2){
            System.out.println("odd thread "+i);
        }
    }
    else{
        for(int i =2; i<=20;i= i+2){
            System.out.println("even thread "+i);
        }
    }

    }
}
class ThreadProgram
{
    public static void main(String[] args) {
        EvenOdd t1 = new EvenOdd();
        EvenOdd t2 = new EvenOdd();
        t1.setName("odd");
        t2.setName("even");
        t1.start();
        t2.start();
    }
}