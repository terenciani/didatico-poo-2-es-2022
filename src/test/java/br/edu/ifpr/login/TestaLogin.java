package br.edu.ifpr.login;

import br.edu.ifpr.paranavai.armarios.controle.LoginControlador;
import org.junit.Assert;
import org.junit.Test;

public class TestaLogin {
    @Test
    public void autenticacaoOk(){
        String email = "admin@admin.com";
        String senha = "12345";
        /* podemos utilizar o método static,pq é uma classe vazia */
        String resposta = LoginControlador.verifica(email,senha);
        Assert.assertEquals("sucesso no login", resposta);    
    }
    @Test
    public void emailInvalido(){
        String email = "bleble@blabla.com";
        String senha = "12345";
        String resposta = LoginControlador.verifica(email,senha);
        Assert.assertEquals("E-mail inválido", resposta);
    }
}
