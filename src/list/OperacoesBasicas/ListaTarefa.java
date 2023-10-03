package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;
public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    // testes
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
        listaTarefa.adicionarTarefa("Ir para academia");
        listaTarefa.adicionarTarefa("Ir almoçar na faculdade");
        listaTarefa.adicionarTarefa("Ir almoçar na faculdade");
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
        listaTarefa.removerTarefa("Ir almoçar na faculdade");
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Ir almoçar na faculdade");
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

    }
}
