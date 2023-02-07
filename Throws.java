import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class test {
    
    void readFile()throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("d://abc.txt");
    }
    void savaFile()throws FileNotFoundException{
        FileOutputStream fos = new FileOutputStream("d://xyz.txt");
    }
}
class Throws{
public static void main(String[] args) {
    test t1 = new test();
    try {
        t1.readFile(); 
    } catch (FileNotFoundException e) {
        System.out.println(e);
    }
    try {
        t1.savaFile();
    } catch (Exception e) {
        System.out.println(e);
    }
    System.out.println("Hello");
    

}
};
