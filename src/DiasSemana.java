public class DiasSemana {
    public class DiaDaSemana {
        public static String solution(String S, int K) {
            String[] dias = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};

            int posicaoAtual = 0;
            for (int i = 0; i < dias.length; i++) {
                if (dias[i].equals(S.toLowerCase())) {
                    posicaoAtual = i;
                    break;
                }
            }

            int novaPosicao = (posicaoAtual + K) % 7;

            return dias[novaPosicao];
        }
    }
}
