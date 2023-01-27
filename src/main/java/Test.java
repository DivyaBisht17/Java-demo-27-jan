public class Test {
    int age;
    String name="";
    void Test(int a,String n){
        age=a;
        name=n;
    }

    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t.name+"divya");
        System.out.println(t.age+22);

    }
}
