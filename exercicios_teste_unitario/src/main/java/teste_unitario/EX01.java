package teste_unitario;

import javax.swing.JOptionPane;

public class EX01 {
public static String retornaPalavraString(){
    String palavra = "bom dia";
    return palavra;
}
public static boolean inserirCPF(){
    String cpf = JOptionPane.showInputDialog("Digite seu cpf");
    if (cpf.length()!= 11){
        return false;
    }
    return true;
}
public static boolean inserirSenha(){
    String senha = JOptionPane.showInputDialog("Digite sua senha");
    if (senha.length()!= 8){
        return false;
    }
    return true;
}
public static String retornaFraseString(){
    String palavra = "Hello World";
    return palavra;
}
public static int retornaTamVetor(){
    String[]nomes;
    nomes= new String[3];
    nomes[0] = "Jose";
    nomes[1] = "Joao";
    nomes[2] = "Jaco";
    return nomes.length;
}
//exercicio 4
public static boolean inserirNota(){
    String nota = JOptionPane.showInputDialog("Digite sua nota");
    if (nota.length()/2>= 0){
        return true;
    }
    return false;
}
}
