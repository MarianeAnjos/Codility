public class Main {
    public static void main(String[] args) {
        testarNumeroUnico();
        testarAnagramas();
        testarDiasSemana();
        testarBrackets();
        testarBananas();
    }

    private static void testarNumeroUnico() {
        int[] numeros = {9, 3, 6, 3, 9, 1, 1};
        int resultado = UnicoNumeroLista.EncontrarUnico(numeros);
        System.out.println("O número encontrado é: " + resultado);
    }

    private static void testarAnagramas() {
        String a = "gato";
        String b = "toga";
        boolean resultado = StringsAnagramas.saoAnagramas(a, b);
        System.out.println(resultado ? "São anagramas" : "Não são anagramas");
    }

    private static void testarDiasSemana() {
        System.out.println(DiasSemana.DiaDaSemana.solution("wed", 23));
    }

    private static void testarBrackets() {
        String teste1 = "({[]})";
        String teste2 = "([)]";
        System.out.println("Teste 1: " + Brackets.verificarBrackets(teste1));
        System.out.println("Teste 2: " + Brackets.verificarBrackets(teste2));
    }

    private static void testarBananas() {
        Solution solution = new Solution();
        System.out.println(solution.solution("NAABXXAN"));
        System.out.println(solution.solution("NAANAAXNABAVYNNBZ"));
        System.out.println(solution.solution("qabaawobl"));
    }
}
