class Super
{
  int i = 10;
}
class B extends Super
{
    int i = 20;
    void show(int i){
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);
    }

    public static void main(String[] args) {
        Super s = new Super();
        s.show(10);
        
    }

}