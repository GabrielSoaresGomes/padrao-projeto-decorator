public class Selic extends ContaInvestimentoDecorator{
    public Selic(ContaInvestimento contaInvestimento) {
        super(contaInvestimento);
    }

    public float getPercentualRendimento() {
        return 0.1f;
    }
}
