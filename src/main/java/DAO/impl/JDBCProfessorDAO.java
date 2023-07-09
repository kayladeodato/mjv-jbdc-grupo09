package DAO.impl;

import DAO.ConexaoDB;
import DAO.ProfessorDAO;
import model.Professor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCProfessorDAO implements ProfessorDAO {

    private Connection conexao;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private int rowsUpdated;

    public JDBCProfessorDAO() {
        conexao = ConexaoDB.getConnection();
    }

    public void save(Professor professor) {

        try {
            String sql = "INSERT INTO tab_professor (nome, dt_nascimento, carga_horaria ,vl_hora, fl_estrangeiro, hr_disponiveis, biografia, dh_cadastro) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            preparedStatement(sql);
            preparedStatement.setString(1, professor.getNome());
            preparedStatement.setDate(2, Date.valueOf(professor.getDataNascimento()));
            preparedStatement.setTime(3, Time.valueOf(professor.getCargaHoraria()));
            preparedStatement.setDouble(4, professor.getValorHora());
            preparedStatement.setBoolean(5, professor.isEstrangeiro());
            preparedStatement.setInt(6, professor.getHorasDisponiveis());
            preparedStatement.setString(7, professor.getBiografia());
            preparedStatement.setTimestamp(8, Timestamp.valueOf(professor.getCadastro()));

            rowsUpdated();
            if (rowsUpdated > 0) {
                System.out.println("Professor adicionado com sucesso.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void update(Professor professor) {

        try {
            String sql = "UPDATE tab_professor SET nome = ?, dt_nascimento = ?, carga_horaria = ? ,vl_hora = ?, fl_estrangeiro = ?, hr_disponiveis = ?, biografia = ?, dh_cadastro = ? WHERE id = ?";

            preparedStatement(sql);
            preparedStatement.setString(1, professor.getNome());
            preparedStatement.setDate(2, Date.valueOf(professor.getDataNascimento()));
            preparedStatement.setTime(3, Time.valueOf(professor.getCargaHoraria()));
            preparedStatement.setDouble(4, professor.getValorHora());
            preparedStatement.setBoolean(5, professor.isEstrangeiro());
            preparedStatement.setInt(6, professor.getHorasDisponiveis());
            preparedStatement.setString(7, professor.getBiografia());
            preparedStatement.setTimestamp(8, Timestamp.valueOf(professor.getCadastro()));
            preparedStatement.setInt(9, professor.getId());

            rowsUpdated();
            if (rowsUpdated > 0) {
                System.out.println("Nome do professor alterado com sucesso.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int delete(Integer id) {
        int rowsDeleted = 0;
        try {
            String sql = "DELETE FROM tab_professor WHERE id = ?";
            preparedStatement(sql);
            preparedStatement.setInt(1, id);
            rowsDeleted = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rowsDeleted;
    }

    public Professor findById(Integer id) {
        Professor professor = null;
        try {
            String sql = "SELECT * FROM tab_professor WHERE id = ?";

            preparedStatement(sql);
            preparedStatement.setInt(1, id);

            resultSet();

            while (resultSet.next()) {
                professor = new Professor();
                professor.setId(resultSet.getInt("id"));
                professor.setNome(resultSet.getString("nome"));
                professor.setDataNascimento(resultSet.getDate("dt_nascimento").toLocalDate());
                professor.setCargaHoraria(resultSet.getTime("carga_horaria").toLocalTime());
                professor.setValorHora(resultSet.getDouble("vl_hora"));
                professor.setEstrangeiro(resultSet.getBoolean("fl_estrangeiro"));
                professor.setHorasDisponiveis(resultSet.getInt("hr_disponiveis"));
                professor.setBiografia(resultSet.getString("biografia"));
                professor.setCadastro(resultSet.getTimestamp("dh_cadastro").toLocalDateTime());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return professor;
    }

    public List<Professor> findAll() {
        List<Professor> registros = new ArrayList<>();

        try {
            String sql = "SELECT * FROM tab_professor";
            Statement statement = conexao.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Professor professor = new Professor();
                professor.setId(resultSet.getInt("id"));
                professor.setNome(resultSet.getString("nome"));
                professor.setDataNascimento(resultSet.getDate("dt_nascimento").toLocalDate());
                professor.setCargaHoraria(resultSet.getTime("carga_horaria").toLocalTime());
                professor.setValorHora(resultSet.getDouble("vl_hora"));
                professor.setEstrangeiro(resultSet.getBoolean("fl_estrangeiro"));
                professor.setHorasDisponiveis(resultSet.getInt("hr_disponiveis"));
                professor.setBiografia(resultSet.getString("biografia"));
                professor.setCadastro(resultSet.getTimestamp("dh_cadastro").toLocalDateTime());
                registros.add(professor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return registros;
    }

    public List<Professor> findByName(String nome) {
        List<Professor> registros = new ArrayList<>();

        try {
            String sql = "SELECT * FROM tab_professor WHERE UPPER(nome) LIKE  ? ";
            preparedStatement(sql);
            preparedStatement.setString(1, "%" + nome.toUpperCase() + "%");
            resultSet();

            while (resultSet.next()) {
                Professor professor = new Professor();
                professor.setId(resultSet.getInt("id"));
                professor.setNome(resultSet.getString("nome"));
                professor.setDataNascimento(resultSet.getDate("dt_nascimento").toLocalDate());
                professor.setCargaHoraria(resultSet.getTime("carga_horaria").toLocalTime());
                professor.setValorHora(resultSet.getDouble("vl_hora"));
                professor.setEstrangeiro(resultSet.getBoolean("fl_estrangeiro"));
                professor.setHorasDisponiveis(resultSet.getInt("hr_disponiveis"));
                professor.setBiografia(resultSet.getString("biografia"));
                professor.setCadastro(resultSet.getTimestamp("dh_cadastro").toLocalDateTime());
                registros.add(professor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return registros;
    }

    public void preparedStatement(String sql) {
        try {
            preparedStatement = conexao.prepareStatement(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resultSet() {

        try {
            resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resultSet(String sql) {

        try {
            resultSet = preparedStatement.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void rowsUpdated() {
        try {
            rowsUpdated = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
