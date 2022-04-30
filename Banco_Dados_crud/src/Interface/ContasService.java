package Interface;

import Object.Conta;
import model.ContasDAO;

import java.util.List;

public interface ContasService {
    //CREATE
    public void salvar(Conta conta);

    //RETRIVE
    public List<Conta> buscarTodas();

    public Conta buscaPorId(int id);

    //DELETE
    public void apagar(int id);

    //UPDATE
    public void atualizar(Conta conta);

    // retorna a implementação que escolhemos - no caso o ContasCSVService
    public static ContasService getNewInstance(){
        return (ContasService) new ContasDAO ();
    }
}
