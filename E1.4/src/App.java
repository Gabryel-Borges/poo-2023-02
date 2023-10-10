public class App {
    public static void main(String[] args) throws Exception {
        Animal[] animais = new Animal[3];

        animais[0] = new Boi();
        animais[1] = new Sapo();
        animais[2] = new Cachorro();

        System.out.print("Som do Boi: ");
        System.out.println(animais[0].som());

        System.out.print("Som do Sapo: ");
        System.out.println(animais[1].som());

        System.out.print("Som do Cachorro: ");
        System.out.println(animais[2].som());
    }
}
