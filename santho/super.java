class Super
{
    int x=10;
}
class B extends Super
{
    int x=20;
    void show()
    {
        int x=15;
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
    public static void main(String args[])
    {
        B b =new B();
        b.show();
    }
}