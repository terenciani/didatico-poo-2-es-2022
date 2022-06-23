package br.edu.ifpr.login;

import br.edu.ifpr.paranavai.armarios.controle.LoginControlador;
import org.junit.Assert;
import org.junit.Test;

public class TestaLogin {
    @Test
    public void autenticacaoOk(){
        String email = "emailexistente@gmail.com";
        String senha = "senhacorreta";
        LoginControlador controle = new LoginControlador();
        String resposta = controle.verifica(email,senha);
        Assert.assertEquals("sucesso no login", resposta);
    }
}
