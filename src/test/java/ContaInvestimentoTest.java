import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ContaInvestimentoTest {
    @Test
    void deveRetornarValorTotal() {
        ContaInvestimento contaInvestimento = new ContaInvestimentoXP(1000f);
        assertEquals(1000f, contaInvestimento.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalComPoupanca() {
        ContaInvestimento contaInvestimento = new Poupanca(new ContaInvestimentoXP(1000f));
        assertEquals(1050f, contaInvestimento.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalComSelic() {
        ContaInvestimento contaInvestimento = new Selic(new ContaInvestimentoXP(1000f));
        assertEquals(1100f, contaInvestimento.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalComMXRF11() {
        ContaInvestimento contaInvestimento = new MXRF11(new ContaInvestimentoXP(1000f));
        assertEquals(1200f, contaInvestimento.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalComPoupancaMaisSelic() {
        ContaInvestimento contaInvestimento = new Selic(new Poupanca(new ContaInvestimentoXP(1000f)));
        assertEquals(1155f, contaInvestimento.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalComPoupancaMaisMXRF11() {
        ContaInvestimento contaInvestimento = new MXRF11(new Poupanca(new ContaInvestimentoXP(1000f)));
        assertEquals(1260f, contaInvestimento.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalComSelicMaisMXRF11() {
        ContaInvestimento contaInvestimento = new MXRF11(new Selic(new ContaInvestimentoXP(1000f)));
        assertEquals(1320f, contaInvestimento.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalComSelicMaisMXRF11MaisPoupanca() {
        ContaInvestimento contaInvestimento = new Poupanca(new MXRF11(new Selic(new ContaInvestimentoXP(1000f))));
        assertEquals(1385.99, contaInvestimento.getValorTotal(), 0.01f);
    }
}
