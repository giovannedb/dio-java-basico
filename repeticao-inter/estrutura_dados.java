public class estrutura_dados {
    public static void main(String[] args) {
        
        int intA = 1;
        int intB = intA;

        System.out.println("intA " + intA + " intB " + intB);
        intA = 2;

        System.out.println("intA " + intA + " intB " + intB);

        MeuObj objtA = new MeuObj(1);
        System.out.println(objtA);
        MeuObj objB = objtA;
        System.out.println(objB);
        objtA.seNum(2);
        System.out.println(objtA);
        System.out.println(objB);
    }
}
