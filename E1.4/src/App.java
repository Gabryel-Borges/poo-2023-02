public class App {
    public static void main(String[] args) throws Exception {
        Animal[] animais = new Animal[3];

        animais[0] = new Boi();
        animais[1] = new Sapo();
        animais[2] = new Cachorro();

       for (int i=0; i<animais.length; i++) {
            System.out.println(animais[i].som());
       }
    }
}
