package br.com.api.academic.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import br.com.api.academic.model.Aluno;
import br.com.api.academic.repository.AlunoRepositorio;

import javax.annotation.PostConstruct;
import java.time.Instant;

@Component
public class CarregaData {

    @Value("${habilitar.carregar.massa.dados}")
    private boolean podeCarregarDados;

    @Autowired
    private AlunoRepositorio alunoRepositorio;

    @PostConstruct
    public void loadData() {

        if (podeCarregarDados) {
            for (int x = 0; x < 50; x++) {
                alunoRepositorio.save(new Aluno((long) x, "Cibele da Silva" + x, "99662-554" + x, "cibele@silva.com.br", Instant.now()));
            }

        }
    }
}
