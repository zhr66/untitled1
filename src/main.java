public class main {
    public static void main(String[] args) {
        test1 t ;
        t= new test1(10);


        test2 t2 = new test2(t);
        System.out.println(t2.getT1().getA());
        t.setA(30);
        System.out.println(t2.getT1().getA());



        System.out.println(t.getA()); //地址始终是一样的，

    }


}
