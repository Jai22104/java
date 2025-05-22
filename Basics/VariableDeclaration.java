public class VariableDeclaration {
    public static void main(String[] args){
        int a =10;
        int b =30;
        int c = a + b;
        System.out.println("Sum is : " + c);

        String st1 = "Welcome to JAVA learning";
        System.out.println(st1.contains("to"));

        String st2 = "What are you Learning";           //(if we add ! in statememt then it use as a NOT gate in sentance)
        System.out.println(st2.contains("WL"));

        //((%)Modulus gives the reminder value) (** exponential)

        int d = 5;
        int e = 3;

        int mod = d % e;
        System.out.println(mod);

        System.out.println(Math.pow(d, e));

    }
}
