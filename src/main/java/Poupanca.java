public class Poupanca extends ContaInvestimentoDecorator{
    public Poupanca(ContaInvestimento contaInvestimento) {
        super(contaInvestimento);
    }

    public float getPercentualRendimento() {
        return 0.05f;
    }
}
