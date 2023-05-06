package teste_unitario;

import org.junit.Test;
import org.junit.Assert;

public class Teste_ex01 {
    @Test
    public void validaPalavra(){
    Assert.assertEquals("bom dia",EX01.retornaPalavraString());
}
@Test
public void validaPalavraIncorreta(){
    Assert.assertEquals("não", EX01.retornaPalavraString());
}
@Test
    public void cpfComDigitosCorretos(){
        Assert.assertTrue(EX01.inserirCPF());
    
    }
    @Test
    public void inserirSenha(){
        Assert.assertTrue(EX01.inserirSenha());
}
@Test
    public void retornaFraseString(){
    Assert.assertEquals("Hello World",EX01.retornaFraseString());
}
@Test
    public void retornaTamVetor(){
        Assert.assertEquals(3, EX01.retornaTamVetor());
}
}