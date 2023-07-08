package DAO.impl;

import DAO.ConexaoDB;
import DAO.ProfessorDAO;
import model.Professor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class JDBCProfessorDAO implements ProfessorDAO {

    private Connection conexao;

    public JDBCProfessorDAO() {
        conexao = ConexaoDB.getConnection();
    }

    public void save(Professor professor) {

        try {
            String sql = "INSERT INTO tab_professor (nome, dt_nascimento, carga_horaria ,vl_hora, fl_estrangeiro, hr_disponiveis, biografia, dh_cadastro) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, professor.getNome());
            statement.setDate(2, Date.valueOf(professor.getDataNascimento()));
            statement.setTime(3, Time.valueOf(professor.getCargaHoraria()));
            statement.setDouble(4, professor.getValorHora());
            statement.setBoolean(5, professor.isEstrangeiro());
            statement.setInt(6, professor.getHorasDisponiveis());
            statement.setString(7, professor.getBiografia());
            statement.setTimestamp(8, Timestamp.valueOf(professor.getCadastro()));
            int rowsUpdated = statement.executeUpdate();
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

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, professor.getNome());
            statement.setDate(2, Date.valueOf(professor.getDataNascimento()));
            statement.setTime(3, Time.valueOf(professor.getCargaHoraria()));
            statement.setDouble(4, professor.getValorHora());
            statement.setBoolean(5, professor.isEstrangeiro());
            statement.setInt(6, professor.getHorasDisponiveis());
            statement.setString(7, professor.getBiografia());
            statement.setTimestamp(8, Timestamp.valueOf(professor.getCadastro()));
            statement.setInt(9, professor.getId());

            int rowsUpdated = statement.executeUpdate();
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
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, id);
            rowsDeleted = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rowsDeleted;
    }

    public Professor findById(Integer id) {
        Professor professor = null;
        try {
            String sql = "SELECT * FROM tab_professor WHERE id = ?";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

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
            ResultSet resultSet = statement.executeQuery(sql);

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
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, "%" + nome.toUpperCase() + "%");
            ResultSet resultSet = statement.executeQuery();

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
}
