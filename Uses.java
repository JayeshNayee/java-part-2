// *****Uses of static method


// class Test
// {
//     static int a = 20;
//    static  void display(){
//         System.out.println(a);
//     }
// }
// class Uses{
//     public static void main(String[] args) {   
//        Test.display();
//     }
// }
//******************************************************************** */
// class Test
// {
//     static void show(){
//         display();
//         System.out.println("1");
//     }
//     static void display(){
//         System.out.println("2");
//     }

// }
// class Uses{
//     public static void main(String[] args) {
        
//         Test.show();
//     }
// }
//******************************************************************/
// class Test{

//      int i = 30;
//     static void display(){
//         System.out.println(this.i);
//     }
// }

// class Uses {
//     public static void main(String[] args) {
//      Test.display();
//     }
// }