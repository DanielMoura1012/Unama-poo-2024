public class Tarefa {
    private String titulo;
    private int prioridade;
    private String descricao;
    private String prazo;

    // Construtor que aceita apenas titulo e prioridade
    public Tarefa(String titulo, int prioridade) {
        this.titulo = titulo;
        if (isPrioridadeValida(prioridade)) {
            this.prioridade = prioridade;
        } else {
            throw new IllegalArgumentException("Prioridade deve ser entre 1 e 5.");
        }
        this.descricao = "Sem descrição"; // Valor padrão
        this.prazo = "Sem prazo"; // Valor padrão
    }

    // Método privado que valida a prioridade
    private boolean isPrioridadeValida(int prioridade) {
        return prioridade >= 1 && prioridade <= 5;
    }

    // Getters e Setters (opcional)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        if (isPrioridadeValida(prioridade)) {
            this.prioridade = prioridade;
        } else {
            throw new IllegalArgumentException("Prioridade deve ser entre 1 e 5.");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public static void main(String[] args) {
        // Testando a classe Tarefa
        Tarefa tarefa = new Tarefa("Estudar Java", 3);
        System.out.println("Título: " + tarefa.getTitulo());
        System.out.println("Prioridade: " + tarefa.getPrioridade());
        System.out.println("Descrição: " + tarefa.getDescricao());
        System.out.println("Prazo: " + tarefa.getPrazo());
    }
}
