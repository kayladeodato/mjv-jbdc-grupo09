import DAO.ConexaoDB;
import DAO.DAOFactory;
import DAO.ProfessorDAO;
import model.Professor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

public class Application {

    private static ProfessorDAO professorDAO;

    public static void main(String[] args) {

        ConexaoDB.iniciarConexao();

        professorDAO = DAOFactory.createProfessorDao();
        incluirProfessor();
        alterarProfessor();
        listarProfessores();
        excluirProfessor();
        listarProfessoresPorNome();
    }

    private static void incluirProfessor() {
        Professor professor = new Professor();
        professor.setNome("Pedro");
        professor.setDataNascimento(LocalDate.now());
        professor.setCargaHoraria(LocalTime.of(13,8,12));
        professor.setValorHora(20.0);
        professor.setEstrangeiro(true);
        professor.setHorasDisponiveis(50);
        professor.setBiografia("Professor das disciplinas de Ciências, Matemática e Português.");
        professor.setCadastro(LocalDateTime.of(2023, Month.JUNE,8,22,00,00));
        professorDAO.save(professor);
    }

    private static void alterarProfessor() {
        Professor professor = professorDAO.findById(24);
        if (professor != null) {
            professor.setNome("Antonio");
            professorDAO.update(professor);
        } else {
            System.out.println("Não existe o professor com o id informado.");
        }

    }

    private static void listarProfessores() {
        List<Professor> professores = professorDAO.findAll();
        for (Professor p : professores) {
            System.out.println(p.getId() + " - " + p.getNome());
        }
    }

    private static void excluirProfessor() {
        int linhasDeletadas = professorDAO.delete(25);
        if (linhasDeletadas == 0) {
            System.out.println("Nenhum registro com id informado localizado para a exclusão");
        }
    }

    private static void listarProfessoresPorNome() {
        List<Professor> professores = professorDAO.findByName("ant");
        for (Professor p : professores) {
            System.out.println(p.getId() + " - " + p.getNome());
        }
    }
}
