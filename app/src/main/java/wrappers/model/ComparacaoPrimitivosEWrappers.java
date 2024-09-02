package model;

public class ComparacaoPrimitivosEWrappers {

    private Integer inteiroWrapper;
    private int inteiroPrimitivo;
    private Double decimalWrapper;
    private double decimalPrimitivo;
    private Boolean boleanoWrapper;
    private boolean boleanoPrimitivo;
    private Character caracterWrapper;
    private char caracterPrimitivo;
    private String conjuntoDeCaracteres;

    public ComparacaoPrimitivosEWrappers(
        Integer inteiroWrapper, int inteiroPrimitivo,
        Double decimalWrapper, double decimalPrimitivo,
        Boolean boleanoWrapper, boolean boleanoPrimitivo,
        Character caracterWrapper, char caracterPrimitivo,
        String conjuntoDeCaracteres
    ) {
        this.inteiroWrapper = inteiroWrapper;
        this.inteiroPrimitivo = inteiroPrimitivo;
        this.decimalWrapper = decimalWrapper;
        this.decimalPrimitivo = decimalPrimitivo;
        this.boleanoWrapper = boleanoWrapper;
        this.boleanoPrimitivo = boleanoPrimitivo;
        this.caracterWrapper = caracterWrapper;
        this.caracterPrimitivo = caracterPrimitivo;
        this.conjuntoDeCaracteres = conjuntoDeCaracteres;
    }

    public void exibirValoresPadrao() {
        System.out.println("Valores padrão das variáveis:");
        System.out.println("inteiroWrapper (Integer): " + inteiroWrapper); 
        System.out.println("inteiroPrimitivo (int): " + inteiroPrimitivo); 
        System.out.println("decimalWrapper (Double): " + decimalWrapper); 
        System.out.println("decimalPrimitivo (double): " + decimalPrimitivo); 
        System.out.println("boleanoWrapper (Boolean): " + boleanoWrapper); 
        System.out.println("boleanoPrimitivo (boolean): " + boleanoPrimitivo); 
        System.out.println("caracterWrapper (Character): " + caracterWrapper); 
        System.out.println("caracterPrimitivo (char): " + caracterPrimitivo);
        System.out.println("conjuntoDeCaracteres (String): " + conjuntoDeCaracteres); 
    }

    public void comparacaoDeNumerosInteirosComWrappers(Integer numero) {
        System.out.println("Utilizando equals: " + inteiroWrapper.equals(numero));
        System.out.println("Utilizando == : " + (inteiroWrapper == numero));
    }

    public void comparacaoDeNumerosInteirosComPrimitivos(int numero) {
        System.out.println("Utilizando == : " + (inteiroPrimitivo == numero));
    }

    public void comparacaoDeNumerosDecimaisComWrappers(Double numero) {
        System.out.println("Utilizando equals: " + decimalWrapper.equals(numero));
        System.out.println("Utilizando == : " + (decimalWrapper == numero));
    }

    public void comparacaoDeNumerosDecimaisComPrimitivos(double numero) {
        System.out.println("Utilizando == : " + (decimalPrimitivo == numero));
    }

    public void comparacaoDeBooleanosComWrappers(Boolean valor) {
        System.out.println("Utilizando equals: " + boleanoWrapper.equals(valor));
        System.out.println("Utilizando == : " + (boleanoWrapper == valor));
    }

    public void comparacaoDeBooleanosComPrimitivos(boolean valor) {
        System.out.println("Utilizando == : " + (boleanoPrimitivo == valor));
    }

    public void comparacaoDeCaracteresComWrappers(Character caractere) {
        System.out.println("Utilizando equals: " + caracterWrapper.equals(caractere));
        System.out.println("Utilizando == : " + (caracterWrapper == caractere));
    }

    public void comparacaoDeCaracteresComPrimitivos(char caractere) {
        System.out.println("Utilizando == : " + (caracterPrimitivo == caractere));
    }

    public void comparacaoDeStrings(String texto) {
        System.out.println("Utilizando equals: " + conjuntoDeCaracteres.equals(texto));
        System.out.println("Utilizando == : " + (conjuntoDeCaracteres == texto));
    }

}
