package view;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import model.Professor;

/**
 * @author julio
 */
public class ProfessorTableModel extends AbstractTableModel {

    //private static final int COL_ID = 0;
    private static final int COL_NOME = 0;
    private static final int COL_DT_NASC = 1;
    private static final int COL_CARGA_HORARIA = 2;
    private static final int COL_VL_HORA = 3;
    private static final int COL_HR_DISPONIVEIS = 4;
    private static final int COL_DT_CAD = 5;
    private static final int COL_BIOGRAFIA = 6;
    List<Professor> linhas;
    private final String[] colunas = new String[]{"Nome",
            "Data Nascimento", "Carga Horária", "Valor Hora", "Horas Disponiveis", "Data Cadastro", "Biografia"};

    public ProfessorTableModel(List<Professor> professores) {
        this.linhas = new ArrayList<>(professores);
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public Class getColumnClass(int columnIndex) {

        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int row, int column) {

        Professor professor = linhas.get(row);

        if (column == COL_NOME) {
            return professor.getNome();
        } else if (column == COL_DT_NASC) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return professor.getDataNascimento().format(formatter);
        } else if (column == COL_CARGA_HORARIA) {
            return professor.getCargaHoraria();
        } else if (column == COL_VL_HORA) {
            return professor.getValorHora().toString().replace(".", ",");
        } else if (column == COL_HR_DISPONIVEIS) {
            return professor.getHorasDisponiveis();
        } else if (column == COL_DT_CAD) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            return professor.getCadastro().format(formatter);
        } else if (column == COL_BIOGRAFIA) {
            return professor.getBiografia();
        }

        return "";
    }

    @Override
    public void setValueAt(Object aValue, int row,
                           int column) {
        Professor professor = linhas.get(row);
        if (column == COL_NOME) {
            professor.setNome(aValue.toString());
        } else if (column == COL_DT_NASC) {
            professor.setDataNascimento(null);
        } else if (column == COL_CARGA_HORARIA) {
            professor.setCargaHoraria(null);
        } else if (column == COL_VL_HORA) {
            professor.setValorHora(Double.valueOf(aValue.toString()));
        } else if (column == COL_HR_DISPONIVEIS) {
            professor.setHorasDisponiveis(null);
        }
    }

    public Professor getProfessor(int indiceLinha) {
        return linhas.get(indiceLinha);
    }


    public void updateTable(List<Professor> linhas) {
        this.linhas = linhas;
    }
}
