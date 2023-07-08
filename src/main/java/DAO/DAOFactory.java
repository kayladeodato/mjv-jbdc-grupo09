package DAO;

import DAO.impl.JDBCProfessorDAO;

public class DAOFactory {

    public static ProfessorDAO createProfessorDao() {
        return new JDBCProfessorDAO();
    }

}
