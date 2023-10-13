public abstract class ContaInvestimentoDecorator implements ContaInvestimento {
    public ContaInvestimento contaInvestimento;

    public ContaInvestimentoDecorator(ContaInvestimento contaInvestimento) {
        this.contaInvestimento = contaInvestimento;
    }

    public ContaInvestimento getContaInvestimento() {
        return contaInvestimento;
    }

    public void setContaInvestimento(ContaInvestimento contaInvestimento) {
        this.contaInvestimento = contaInvestimento;
    }

    public abstract float getPercentualRendimento();

    public float getValorTotal() {
        return this.contaInvestimento.getValorTotal() * (1 + this.getPercentualRendimento());
    }
}
