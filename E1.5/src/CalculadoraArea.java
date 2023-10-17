public class CalculadoraArea {
    
     public static double calcularAreaTotal(FormaGeometrica[] formas){
            
            double areaTotal = 0;
            
            for (FormaGeometrica i: formas) {
                areaTotal += i.calcularArea();
            }

            return areaTotal;
        }

    public static void main(String[] args) throws Exception {

        FormaGeometrica[] figuras = new FormaGeometrica[3]; 

        figuras[0] = new Circulo(5.0);
        figuras[1] = new Retangulo(7.0, 3.0);
        figuras[2]= new Triangulo(6.0, 4.0);
       
        System.out.printf("Área total: %.2f cm²", calcularAreaTotal(figuras));
       
    }
}
