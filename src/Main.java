public class Main {
    public static void main(String[] args) {

        Devil devil1 = new Devil("devil1",10);
        NormalNinja normalNinja1 =new NormalNinja("normalNinja1",10);
        SuperNinja superNinja1 =new SuperNinja("superNinja",10);


        System.out.println(devil1.getHealth());
        superNinja1.attack(devil1);
        superNinja1.attack(devil1);
        normalNinja1.attack(devil1);
        System.out.println(devil1.getHealth());
    }
}