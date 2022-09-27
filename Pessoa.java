public class Pessoa {

    private double altura;
    private int peso;
    private String cor;
    private String sexo;


    public Pessoa() {
    }


    public Pessoa(double altura, int peso, String cor, String sexo) {
        this.altura = altura;
        this.peso = peso;
        this.cor = cor;
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    float imc() {
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("De acordo com meus calculos, seu IMC é " + (Math.round(imc)) + " e você está abaixo do peso :(");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("De acordo com meus calculos, seu IMC é " + (Math.round(imc)) + " e seu peso é normal Parabens!!!");
        } else if (imc > 25 && imc <= 29.5) {
            System.out.println("De acordo com meus calculos, seu IMC é " + (Math.round(imc)) + " e você está sobre  peso :(");
        } else if (imc > 30 && imc <= 34.9) {
            System.out.println("De acordo com meus calculos, seu IMC é " + (Math.round(imc)) + " e você está obeso de grau I :(");
        } else if (imc > 35 && imc <= 39.9) {
            System.out.println("De acordo com meus calculos, seu IMC é " + (Math.round(imc)) + " e você está obeso de grau II :(");
        } else if (imc > 40) {
            System.out.println("De acordo com meus calculos, seu IMC é " + (Math.round(imc)) + " e você está em um quadro de oberidade morbida :(");
        }
        return 0;
    }

}

