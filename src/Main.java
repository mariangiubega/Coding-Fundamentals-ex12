public class Main {
    public static void main(String[] args) {

        NumereComplexe n1=new NumereComplexe(5,6);
        System.out.println(n1);

        NumereComplexe n2=new NumereComplexe(7,9);
        System.out.println(n2);

        System.out.println(n1.sum(n2));

        NumereComplexe n3 = n1.sum(n2);
        System.out.println(n3);
        System.out.println(n1.substract(n2));
        System.out.println(n3.isReal());

    }


}
