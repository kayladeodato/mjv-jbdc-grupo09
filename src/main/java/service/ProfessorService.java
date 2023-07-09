package service;

import DAO.ConexaoDB;
import DAO.DAOFactory;
import DAO.ProfessorDAO;

import java.util.List;

import model.Professor;

/**
 * @author julio
 */
public class ProfessorService {

    private static ProfessorDAO dao;


    public ProfessorService() {

        ConexaoDB.iniciarConexao();

        dao = DAOFactory.createProfessorDao();

    }

    public void salvar(Professor professor) {

        if (professor.getId() == null) {
            dao.save(professor);
        } else {

            dao.update(professor);

        }

    }

    public void excuir(Integer id) {
        if (id != null) {
            dao.delete(id);
        }
    }

    public Professor findById(Integer id) {
        if (id == null) {
            return null;
        } else {
            return dao.findById(id);
        }
    }

    public List<Professor> buscar(String nome) {
        if (nome.isBlank()) {
            return findAll();
        } else {
            return dao.findByName(nome);
        }
    }

    public List<Professor> findAll() {
        return dao.findAll();
    }

}
