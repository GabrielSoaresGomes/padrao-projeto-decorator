public class MXRF11 extends ContaInvestimentoDecorator{
    public MXRF11(ContaInvestimento contaInvestimento) {
        super(contaInvestimento);
    }

    public float getPercentualRendimento() {
        return 0.2f;
    }
}
