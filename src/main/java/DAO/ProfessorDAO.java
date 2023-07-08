package DAO;

import model.Professor;

import java.util.List;

public interface ProfessorDAO {

    void save(Professor professor);

    void update(Professor professor);

    int delete(Integer id);

    Professor findById(Integer id);

    List<Professor> findAll();

    List<Professor> findByName(String nome);


}
