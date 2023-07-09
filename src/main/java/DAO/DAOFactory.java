package DAO;

import DAO.impl.JDBCProfessorDAO;

import java.sql.Connection;
public class DAOFactory {

    private Connection conexao;

    public static ProfessorDAO createProfessorDao() {

        return new JDBCProfessorDAO();
    }



}
