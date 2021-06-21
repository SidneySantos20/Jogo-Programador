import java.sql.*;
public class JogoDAO {
	public Quiz Quiz;
	public BD bd;
	private PreparedStatement statement;
	private ResultSet resultSet;
	private String men, sql;
	public static final byte INCLUSAO = 1;
	public static final byte ALTERACAO = 2;
	public static final byte EXCLUSAO = 3;
	
	public JogoDAO() {
		bd = new BD();
		Quiz = new Quiz();
	}
	
	public boolean localizar() {
		sql = "select * from jogo where nome =?";
		try {
			statement = bd.c.prepareStatement(sql);
			statement.setString(1, Quiz.getNome());
			resultSet = statement.executeQuery();
			resultSet.next();
			Quiz.setNome(resultSet.getString(1));
			Quiz.setPontuacao(resultSet.getString(2));
			Quiz.setDinheiro(resultSet.getString(3));
			return true;
		}catch (SQLException erro) {
			return false;
		}
	}
	public String atualizarTabela() {
		String atuTab = "select * from jogo order by dinheiro desc;";
		return atuTab;
	}
	
	public String atualizar(int operacao) {
		men = "Operação realizada com sucesso ";
		try {
			if(operacao == INCLUSAO) {
				sql = "insert into jogo values (?,?,?)";
				statement = bd.c.prepareStatement(sql);
				statement.setString(1,	Quiz.getNome());
				statement.setString(2, Quiz.getPontuacao());
				statement.setString(3, Quiz.getDinheiro());
			} else if(operacao == ALTERACAO) {
				sql = "update jogo set nome = ?, where nome =?";
				statement = bd.c.prepareStatement(sql);
				statement.setString(1,	Quiz.getNome());
				statement.setString(2,	Quiz.getNome());
			} else if(operacao == EXCLUSAO) {
				sql = "delete from jogo where nome =?";
				statement = bd.c.prepareStatement(sql);
				statement.setString(1,Quiz.getNome());
			}
			if (statement.executeUpdate() == 0) {
				men = "Falha na operação";
			}
			
		} catch(SQLException erro) {
			men = "Falha na operação " + erro.toString();
		}
		return men;
	}
}