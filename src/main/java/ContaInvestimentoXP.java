public class ContaInvestimentoXP implements ContaInvestimento{
    public float valorInvestido;

    public ContaInvestimentoXP() {};

    public ContaInvestimentoXP(float valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public float getValorTotal() {
        return this.valorInvestido;
    }
}
