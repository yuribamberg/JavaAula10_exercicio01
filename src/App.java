//Nome: Yuri Ivo Luiz Bamberg
//Matrícula: 1261948881
public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro1 = new Carro();

        carro1.marca = "Chevrolet";
        carro1.modelo = "Chevette";
        carro1.ano = 1970;

        carro1.acelerar(50);
        carro1.frear(10);

        System.out.println(carro1.retornarDados());
    }
}