package wrappers;

import wrappers.model.ComparacaoPrimitivosEWrappers;

public class App {

     public static void main(String[] args) {

        System.out.print("Teste 01 - Valores iniciais das variáveis: \n");
        ComparacaoPrimitivosEWrappers teste01 = ComparacaoPrimitivosEWrappers.builder().build();
        teste01.exibirValoresIniciais();
        System.out.print("\n");


        
        System.out.print("Teste 02 - Comparação de numeros Inteiros Wrapper iniciados normalmente ou com Autoboxing \n");
        ComparacaoPrimitivosEWrappers teste02 = ComparacaoPrimitivosEWrappers.builder()
                                                .inteiroWrapper(10)
                                                .build();
        
        Integer numeroInicializadoNormalmente = new Integer(10);
        teste02.comparacaoDeNumerosInteirosComWrappers(numeroInicializadoNormalmente);
        System.out.print("\n");
        Integer numeroInicializadoComAutoboxing = 10;
        teste02.comparacaoDeNumerosInteirosComWrappers(numeroInicializadoComAutoboxing);
        System.out.print("\n");


        
        System.out.print("Teste 03 - Comparação de numeros Inteiros primitivos \n");
        ComparacaoPrimitivosEWrappers teste03 = ComparacaoPrimitivosEWrappers.builder()
                                                .inteiroPrimitivo(10)
                                                .build();
        int numero = 10;
        teste03.comparacaoDeNumerosInteirosComPrimitivos(numero);
        System.out.print("\n");


        
        System.out.print("Teste 04 - Comparação de valores boleanos Wrapper iniciados normalmente ou com Autoboxing  \n");
        ComparacaoPrimitivosEWrappers teste04 = ComparacaoPrimitivosEWrappers.builder()
                                                .boleanoWrapper(false)
                                                .build();
        
        Boolean boleanoInicializadoNormalmente = new Boolean(false);
        teste04.comparacaoDeBooleanosComWrappers(boleanoInicializadoNormalmente);
        System.out.print("\n");
        Boolean boleanoInicializadoComAutoboxing = false;
        teste04.comparacaoDeBooleanosComWrappers(boleanoInicializadoComAutoboxing);
        System.out.print("\n");

        
        
        System.out.print("Teste 05 - Comparação de valores boleanos primitivos \n");
        ComparacaoPrimitivosEWrappers teste05 = ComparacaoPrimitivosEWrappers.builder()
                                                .boleanoPrimitivo(false)
                                                .build();
        
        boolean boleanoPrimitivo = false;
        teste05.comparacaoDeBooleanosComPrimitivos(boleanoPrimitivo);
        System.out.print("\n");

    }
}
