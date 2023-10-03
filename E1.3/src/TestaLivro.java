public class TestaLivro {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro("Orgulho e Preconceito", "Jane Austen", 1813, "Garnier");
        Livro livro2 = new Livro("A Tentação do Professor", "Kell Teixeira", 2023, "Kindle");
        Livro livro3 = new Livro("Protegida pela Escuridão", "Nina Higgins", 2023, "Kindle");

        System.out.println(livro1.getTitulo());
        System.out.println(livro1.getAutor());
        System.out.println(livro1.getEditora());
        System.out.println(livro1.getAno());

        System.out.println();

        System.out.println(livro2.getTitulo());
        System.out.println(livro2.getAutor());
        System.out.println(livro2.getEditora());
        System.out.println(livro2.getAno());

        System.out.println();

        System.out.println(livro3.getTitulo());
        System.out.println(livro3.getAutor());
        System.out.println(livro3.getEditora());
        System.out.println(livro3.getAno());
    }
}
