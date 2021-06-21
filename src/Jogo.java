import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Jogo extends JPanel {

	JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16;
	JPanel pTab, pGan, pPer;
	JLabel lbTab, lbGan, lbPer;
	ImageIcon imgTab, imgGan, imgPer;
	JLabel lbNomeJog, lbRanking;
	JButton btTab, btTab2,btSair, btAtuTab, btJogar;

	//
	int pont = 1;
	double dinheiro = 0.00;

	JLabel dindin, pontuacao;
	//
	
	JogoDAO j;
	JScrollPane scrollTable;
	JTable table;
	BD bd;
	PreparedStatement st;
	ResultSet rs;
	//

	JTextField txNome;
	JLabel lbImgP1;
	ImageIcon imgP1;
	JButton btEntrar;

	//

	JLabel lb1;
	JButton bt1A, bt1B, bt1C, bt1D;
	JLabel lbImgP2;
	ImageIcon imgP2;

	//

	JLabel lb2, lb21;
	JButton bt2A, bt2B, bt2C, bt2D;
	JLabel lbImgP3;
	ImageIcon imgP3;
	//

	JLabel lb3, lb31;
	JButton bt3A, bt3B, bt3C, bt3D;
	JLabel lbImgP4;
	ImageIcon imgP4;

	//

	JLabel lb4;
	JButton bt4A, bt4B, bt4C, bt4D;
	JLabel lbImgP5;
	ImageIcon imgP5;
	//

	JLabel lb5, lb51;
	JButton bt5A, bt5B, bt5C, bt5D;
	JLabel lbImgP6;
	ImageIcon imgP6;
	//

	JLabel lb6, lb61;
	JButton bt6A, bt6B, bt6C, bt6D;
	JLabel lbImgP7;
	ImageIcon imgP7;
	//

	JLabel lb7;
	JButton bt7A, bt7B, bt7C, bt7D;
	JLabel lbImgP8;
	ImageIcon imgP8;
	//

	JLabel lb8, lb81;
	JButton bt8A, bt8B, bt8C, bt8D;
	JLabel lbImgP9;
	ImageIcon imgP9;
	//

	JLabel lb9, lb91;
	JButton bt9A, bt9B, bt9C, bt9D;
	JLabel lbImgP10;
	ImageIcon imgP10;
	//

	JLabel lb10, lb101;
	JButton bt10A, bt10B, bt10C, bt10D;
	JLabel lbImgP11;
	ImageIcon imgP11;
	//

	JLabel lb11;
	JButton bt11A, bt11B, bt11C, bt11D;
	JLabel lbImgP12;
	ImageIcon imgP12;
	//

	JLabel lb12, lb121;
	JButton bt12A, bt12B, bt12C, bt12D;
	JLabel lbImgP13;
	ImageIcon imgP13;
	//

	JLabel lb13, lb131, lb132;
	JButton bt13A, bt13B, bt13C, bt13D;
	JLabel lbImgP14;
	ImageIcon imgP14;
	//

	JLabel lb14, lb141;
	JButton bt14A, bt14B, bt14C, bt14D;
	JLabel lbImgP15;
	ImageIcon imgP15;
	//

	JLabel lb15, lb151;
	JButton bt15A, bt15B, bt15C, bt15D;
	JLabel lbImgP16;
	ImageIcon imgP16;

	public Jogo() {
		inicializarComponentes();
		definirEventos();
	}

	public void inicializarComponentes() {
		setLayout(null);

		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(0, 0, 800, 550);

		txNome = new JTextField();
		imgP1 = new ImageIcon("C:\\imagens- java\\Fundo-Jogo.jpeg");
		lbImgP1 = new JLabel(imgP1);

		btEntrar = new JButton("Entrar");
		btEntrar.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btEntrar.setForeground(Color.white);
		btEntrar.setContentAreaFilled(false);
		btEntrar.setBorder(null);

		txNome.setBounds(230, 326, 277, 33);
		btEntrar.setBounds(300, 375, 150, 30);
		lbImgP1.setBounds(0, 0, 740, 485);

		p1.add(txNome);
		p1.add(btEntrar);

		p1.add(lbImgP1);
		p1.setVisible(true);

		//
		//

		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(0, 0, 800, 550);

		lbNomeJog = new JLabel();
		lbNomeJog.setBounds(280, 40, 300, 45);
		lbNomeJog.setFont(new Font("Bookman Old Style", Font.BOLD, 36));
		lbNomeJog.setForeground(Color.yellow);
		lbNomeJog.setVisible(false);

		dindin = new JLabel();
		dindin.setText("" + dinheiro);
		dindin.setBounds(610, 370, 200, 25);
		dindin.setBorder(null);
		dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		dindin.setForeground(Color.yellow);
		dindin.setVisible(false);

		pontuacao = new JLabel();
		pontuacao.setText("" + pont);
		pontuacao.setBounds(630, 95, 200, 25);
		pontuacao.setBorder(null);
		pontuacao.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		pontuacao.setForeground(Color.yellow);
		pontuacao.setVisible(false);

		imgP2 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP2 = new JLabel(imgP2);
		lbImgP2.setBounds(0, 0, 745, 480);

		lb1 = new JLabel("Qual o primeiro comando utilizado em Mysql?");
		lb1.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt1A = new JButton("mysql  -p root –u");
		bt1A.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt1A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt1A.setForeground(Color.yellow);
		bt1A.setContentAreaFilled(false);
		bt1A.setBorder(null);

		bt1B = new JButton(" mysql root –u –p");
		bt1B.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt1B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt1B.setForeground(Color.yellow);
		bt1B.setContentAreaFilled(false);
		bt1B.setBorder(null);

		bt1C = new JButton("mysql -u root –p");
		bt1C.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt1C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt1C.setForeground(Color.yellow);
		bt1C.setContentAreaFilled(false);
		bt1C.setBorder(null);

		bt1D = new JButton("mysql -u root –q");
		bt1D.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt1D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt1D.setForeground(Color.yellow);
		bt1D.setContentAreaFilled(false);
		bt1D.setBorder(null);

		lb1.setBounds(90, 60, 600, 35);
		bt1A.setBounds(90, 235, 200, 25);
		bt1B.setBounds(90, 300, 200, 25);
		bt1C.setBounds(90, 355, 200, 25);
		bt1D.setBounds(90, 420, 200, 25);

		p2.add(lb1);
		p2.add(bt1A);
		p2.add(bt1B);
		p2.add(bt1C);
		p2.add(bt1D);

		add(dindin);
		add(lbNomeJog);
		add(pontuacao);

		p2.add(lbImgP2);

		p2.setVisible(false);
		//

		//

		p3 = new JPanel();
		p3.setLayout(null);
		p3.setBounds(0, 0, 800, 550);

		imgP3 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP3 = new JLabel(imgP3);
		lbImgP3.setBounds(0, 0, 745, 480);

		lb2 = new JLabel("Qual o comando certo para selecionar uma ");
		lb2.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lb21 = new JLabel("tabela em Mysql?");
		lb21.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt2A = new JButton("*SELECT FROM nome_da_tabela;");
		bt2A.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt2A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt2A.setForeground(Color.yellow);
		bt2A.setContentAreaFilled(false);
		bt2A.setBorder(null);

		bt2B = new JButton("SELECT FROM nome_da_tabela;");
		bt2B.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt2B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt2B.setForeground(Color.yellow);
		bt2B.setContentAreaFilled(false);
		bt2B.setBorder(null);

		bt2C = new JButton("SELECT * FROM nome_da_tabela");
		bt2C.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt2C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt2C.setForeground(Color.yellow);
		bt2C.setContentAreaFilled(false);
		bt2C.setBorder(null);

		bt2D = new JButton("SELECT * FROM nome_da_tabela;");
		bt2D.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt2D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt2D.setForeground(Color.yellow);
		bt2D.setContentAreaFilled(false);
		bt2D.setBorder(null);

		lb2.setBounds(90, 60, 600, 35);
		lb21.setBounds(90, 80, 600, 35);
		bt2A.setBounds(90, 235, 400, 25);
		bt2B.setBounds(90, 300, 400, 25);
		bt2C.setBounds(90, 355, 400, 25);
		bt2D.setBounds(90, 420, 400, 25);

		p3.add(lb2);
		p3.add(lb21);
		p3.add(bt2A);
		p3.add(bt2B);
		p3.add(bt2C);
		p3.add(bt2D);
		p3.add(lbImgP3);

		p3.setVisible(false);

		//

		//

		p4 = new JPanel();
		p4.setLayout(null);
		p4.setBounds(0, 0, 800, 550);

		imgP4 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP4 = new JLabel(imgP4);
		lbImgP4.setBounds(0, 0, 745, 480);

		lb3 = new JLabel("Qual o comando para verificar os bancos");
		lb3.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lb31 = new JLabel("de dados disponiveis?");
		lb31.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt3A = new JButton("DATABASE SHOW;");
		bt3A.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt3A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt3A.setForeground(Color.yellow);
		bt3A.setContentAreaFilled(false);
		bt3A.setBorder(null);

		bt3B = new JButton("SHOW DATABASE;");
		bt3B.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt3B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt3B.setForeground(Color.yellow);
		bt3B.setContentAreaFilled(false);
		bt3B.setBorder(null);

		bt3C = new JButton("SHOW DATABASE");
		bt3C.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt3C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt3C.setForeground(Color.yellow);
		bt3C.setContentAreaFilled(false);
		bt3C.setBorder(null);

		bt3D = new JButton("SHOW BASEDATA;");
		bt3D.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt3D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt3D.setForeground(Color.yellow);
		bt3D.setContentAreaFilled(false);
		bt3D.setBorder(null);

		lb3.setBounds(90, 60, 600, 35);
		lb31.setBounds(90, 80, 600, 35);
		bt3A.setBounds(90, 235, 200, 25);
		bt3B.setBounds(90, 300, 200, 25);
		bt3C.setBounds(90, 355, 200, 25);
		bt3D.setBounds(90, 420, 200, 25);

		p4.add(lb3);
		p4.add(lb31);
		p4.add(bt3A);
		p4.add(bt3B);
		p4.add(bt3C);
		p4.add(bt3D);
		p4.add(lbImgP4);
		p4.setVisible(false);

		//

		//

		p5 = new JPanel();
		p5.setLayout(null);
		p5.setBounds(0, 0, 800, 550);

		imgP5 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP5 = new JLabel(imgP5);
		lbImgP5.setBounds(0, 0, 745, 480);

		lb4 = new JLabel("Qual comando está certo?");
		lb4.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt4A = new JButton("SELECT id_projeto, nome_projeto FROM projetos;");
		bt4A.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		bt4A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt4A.setForeground(Color.yellow);
		bt4A.setContentAreaFilled(false);
		bt4A.setBorder(null);

		bt4B = new JButton("SELECT * id_projetos, nome_projetos FROM * projetos;");
		bt4B.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		bt4B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt4B.setForeground(Color.yellow);
		bt4B.setContentAreaFilled(false);
		bt4B.setBorder(null);

		bt4C = new JButton("SELECT id_projetos, nome_projetos FROM projetos");
		bt4C.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		bt4C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt4C.setForeground(Color.yellow);
		bt4C.setContentAreaFilled(false);
		bt4C.setBorder(null);

		bt4D = new JButton("SELECT id_projetos, nome_projetos FROM * projetos;");
		bt4D.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		bt4D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt4D.setForeground(Color.yellow);
		bt4D.setContentAreaFilled(false);
		bt4D.setBorder(null);

		lb4.setBounds(90, 60, 600, 35);
		bt4A.setBounds(90, 235, 400, 25);
		bt4B.setBounds(90, 300, 400, 25);
		bt4C.setBounds(90, 355, 400, 25);
		bt4D.setBounds(90, 420, 400, 25);

		p5.add(lb4);
		p5.add(bt4A);
		p5.add(bt4B);
		p5.add(bt4C);
		p5.add(bt4D);
		p5.add(lbImgP5);

		p5.setVisible(false);

		//

		//

		p6 = new JPanel();
		p6.setLayout(null);
		p6.setBounds(0, 0, 800, 550);

		imgP6 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP6 = new JLabel(imgP6);
		lbImgP6.setBounds(0, 0, 745, 480);

		lb5 = new JLabel("Qual o comando que mostra a hora e a data");
		lb5.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lb51 = new JLabel("no Mysql? ");
		lb51.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt5A = new JButton("SELECT NOW;");
		bt5A.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt5A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt5A.setForeground(Color.yellow);
		bt5A.setContentAreaFilled(false);
		bt5A.setBorder(null);

		bt5B = new JButton("SELECT NOW()");
		bt5B.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt5B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt5B.setForeground(Color.yellow);
		bt5B.setContentAreaFilled(false);
		bt5B.setBorder(null);

		bt5C = new JButton("SELECT NOW");
		bt5C.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt5C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt5C.setForeground(Color.yellow);
		bt5C.setContentAreaFilled(false);
		bt5C.setBorder(null);

		bt5D = new JButton("SELECT NOW();");
		bt5D.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt5D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt5D.setForeground(Color.yellow);
		bt5D.setContentAreaFilled(false);
		bt5D.setBorder(null);

		lb5.setBounds(90, 60, 600, 35);
		lb51.setBounds(90, 80, 600, 35);
		bt5A.setBounds(90, 235, 200, 25);
		bt5B.setBounds(90, 300, 200, 25);
		bt5C.setBounds(90, 355, 200, 25);
		bt5D.setBounds(90, 420, 200, 25);

		p6.add(lb5);
		p6.add(lb51);
		p6.add(bt5A);
		p6.add(bt5B);
		p6.add(bt5C);
		p6.add(bt5D);
		p6.add(lbImgP6);

		p6.setVisible(false);

		//

		//

		p7 = new JPanel();
		p7.setLayout(null);
		p7.setBounds(0, 0, 800, 550);

		imgP7 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP7 = new JLabel(imgP7);
		lbImgP7.setBounds(0, 0, 745, 480);

		lb6 = new JLabel("Qual o comando correto que mostra somente ");
		lb6.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lb61 = new JLabel("a data no Mysql?  ");
		lb61.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt6A = new JButton("SELECT CURDATE() ");
		bt6A.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt6A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt6A.setForeground(Color.yellow);
		bt6A.setContentAreaFilled(false);
		bt6A.setBorder(null);

		bt6B = new JButton("SELECT CURDATE;");
		bt6B.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt6B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt6B.setForeground(Color.yellow);
		bt6B.setContentAreaFilled(false);
		bt6B.setBorder(null);

		bt6C = new JButton(" SELECT DATE; ");
		bt6C.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt6C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt6C.setForeground(Color.yellow);
		bt6C.setContentAreaFilled(false);
		bt6C.setBorder(null);

		bt6D = new JButton("SELECT CURDATE();");
		bt6D.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt6D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt6D.setForeground(Color.yellow);
		bt6D.setContentAreaFilled(false);
		bt6D.setBorder(null);

		lb6.setBounds(90, 60, 600, 35);
		lb61.setBounds(90, 80, 600, 35);
		bt6A.setBounds(90, 235, 400, 25);
		bt6B.setBounds(90, 300, 400, 25);
		bt6C.setBounds(90, 355, 400, 25);
		bt6D.setBounds(90, 420, 400, 25);

		p7.add(lb6);
		p7.add(lb61);
		p7.add(bt6A);
		p7.add(bt6B);
		p7.add(bt6C);
		p7.add(bt6D);
		p7.add(lbImgP7);

		p7.setVisible(false);

		//

		//

		p8 = new JPanel();
		p8.setLayout(null);
		p8.setBounds(0, 0, 800, 550);

		imgP8 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP8 = new JLabel(imgP8);
		lbImgP8.setBounds(0, 0, 745, 480);

		lb7 = new JLabel("O que significa concatenar?");
		lb7.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt7A = new JButton("Trata-se de um conjunto de caracteres. ");
		bt7A.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		bt7A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt7A.setForeground(Color.yellow);
		bt7A.setContentAreaFilled(false);
		bt7A.setBorder(null);

		bt7B = new JButton("Configurar o tipo de uma variável.");
		bt7B.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		bt7B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt7B.setForeground(Color.yellow);
		bt7B.setContentAreaFilled(false);
		bt7B.setBorder(null);

		bt7C = new JButton("Dividir duas variáveis.");
		bt7C.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		bt7C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt7C.setForeground(Color.yellow);
		bt7C.setContentAreaFilled(false);
		bt7C.setBorder(null);

		bt7D = new JButton("Unir dados de modo logico ou manter ligação.");
		bt7D.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		bt7D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt7D.setForeground(Color.yellow);
		bt7D.setContentAreaFilled(false);
		bt7D.setBorder(null);

		lb7.setBounds(90, 60, 600, 35);
		bt7A.setBounds(90, 235, 400, 25);
		bt7B.setBounds(90, 300, 400, 25);
		bt7C.setBounds(90, 355, 400, 25);
		bt7D.setBounds(90, 420, 400, 25);

		p8.add(lb7);
		p8.add(bt7A);
		p8.add(bt7B);
		p8.add(bt7C);
		p8.add(bt7D);
		p8.add(lbImgP8);
		p8.setVisible(false);

		//

		//

		p9 = new JPanel();
		p9.setLayout(null);
		p9.setBounds(0, 0, 800, 550);

		imgP9 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP9 = new JLabel(imgP9);
		lbImgP9.setBounds(0, 0, 745, 480);

		lb8 = new JLabel("Qual dos grupos abaixo apresenta apenas ");
		lb8.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lb81 = new JLabel("paradigmas de programação?");
		lb81.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt8A = new JButton("Imperativo, Funcional, Logico, e Orientado a Objetos.");
		bt8A.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		bt8A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt8A.setForeground(Color.yellow);
		bt8A.setContentAreaFilled(false);
		bt8A.setBorder(null);

		bt8B = new JButton("Algol, Basic, Logico e Orientado a Objetos.");
		bt8B.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		bt8B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt8B.setForeground(Color.yellow);
		bt8B.setContentAreaFilled(false);
		bt8B.setBorder(null);

		bt8C = new JButton("Imperativo, Programar, Logico e Orientado a Objetos.");
		bt8C.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		bt8C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt8C.setForeground(Color.yellow);
		bt8C.setContentAreaFilled(false);
		bt8C.setBorder(null);

		bt8D = new JButton("Orientado a Objetos, Java, Imperativo e Logico.");
		bt8D.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		bt8D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt8D.setForeground(Color.yellow);
		bt8D.setContentAreaFilled(false);
		bt8D.setBorder(null);

		lb8.setBounds(90, 60, 600, 35);
		lb81.setBounds(90, 90, 600, 35);
		bt8A.setBounds(80, 235, 450, 25);
		bt8B.setBounds(90, 300, 450, 25);
		bt8C.setBounds(80, 355, 450, 25);
		bt8D.setBounds(90, 420, 450, 25);

		p9.add(lb8);
		p9.add(lb81);
		p9.add(bt8A);
		p9.add(bt8B);
		p9.add(bt8C);
		p9.add(bt8D);
		p9.add(lbImgP9);

		p9.setVisible(false);

		//

		//

		p10 = new JPanel();
		p10.setLayout(null);
		p10.setBounds(0, 0, 800, 550);

		imgP10 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP10 = new JLabel(imgP10);
		lbImgP10.setBounds(0, 0, 745, 480);

		lb9 = new JLabel("Quais são os estados possíveis que um ");
		lb9.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lb91 = new JLabel("tipo lógico pode assumir?");
		lb91.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt9A = new JButton("Verdadeira e Duvidoso.");
		bt9A.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt9A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt9A.setForeground(Color.yellow);
		bt9A.setContentAreaFilled(false);
		bt9A.setBorder(null);

		bt9B = new JButton("Verdadeiro, Falso, Duvidoso.");
		bt9B.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt9B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt9B.setForeground(Color.yellow);
		bt9B.setContentAreaFilled(false);
		bt9B.setBorder(null);

		bt9C = new JButton("Incerto e Certo.");
		bt9C.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt9C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt9C.setForeground(Color.yellow);
		bt9C.setContentAreaFilled(false);
		bt9C.setBorder(null);

		bt9D = new JButton("Verdadeiro e Falso.");
		bt9D.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt9D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt9D.setForeground(Color.yellow);
		bt9D.setContentAreaFilled(false);
		bt9D.setBorder(null);

		lb9.setBounds(90, 60, 600, 35);
		lb91.setBounds(90, 80, 600, 35);
		bt9A.setBounds(90, 235, 400, 25);
		bt9B.setBounds(90, 300, 400, 25);
		bt9C.setBounds(90, 355, 400, 25);
		bt9D.setBounds(90, 420, 400, 25);

		p10.add(lb9);
		p10.add(lb91);
		p10.add(bt9A);
		p10.add(bt9B);
		p10.add(bt9C);
		p10.add(bt9D);
		p10.add(lbImgP10);

		p10.setVisible(false);

		//

		//

		p11 = new JPanel();
		p11.setLayout(null);
		p11.setBounds(0, 0, 800, 550);

		imgP11 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP11 = new JLabel(imgP11);
		lbImgP11.setBounds(0, 0, 745, 480);

		lb10 = new JLabel("Qual a linguagem de programação mais");
		lb10.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lb101 = new JLabel("utilizada no mundo?");
		lb101.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt10A = new JButton("Java");
		bt10A.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt10A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt10A.setForeground(Color.yellow);
		bt10A.setContentAreaFilled(false);
		bt10A.setBorder(null);

		bt10B = new JButton("JavaScript");
		bt10B.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt10B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt10B.setForeground(Color.yellow);
		bt10B.setContentAreaFilled(false);
		bt10B.setBorder(null);

		bt10C = new JButton("C#");
		bt10C.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt10C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt10C.setForeground(Color.yellow);
		bt10C.setContentAreaFilled(false);
		bt10C.setBorder(null);

		bt10D = new JButton("Python");
		bt10D.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt10D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt10D.setForeground(Color.yellow);
		bt10D.setContentAreaFilled(false);
		bt10D.setBorder(null);

		lb10.setBounds(90, 60, 600, 35);
		lb101.setBounds(90, 80, 600, 35);
		bt10A.setBounds(20, 235, 300, 25);
		bt10B.setBounds(20, 300, 300, 25);
		bt10C.setBounds(20, 355, 300, 25);
		bt10D.setBounds(20, 420, 300, 25);

		p11.add(lb10);
		p11.add(lb101);
		p11.add(bt10A);
		p11.add(bt10B);
		p11.add(bt10C);
		p11.add(bt10D);
		p11.add(lbImgP11);

		p11.setVisible(false);

		//

		//

		p12 = new JPanel();
		p12.setLayout(null);
		p12.setBounds(0, 0, 800, 550);

		imgP12 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP12 = new JLabel(imgP12);
		lbImgP12.setBounds(0, 0, 745, 480);

		lb11 = new JLabel("Onde são armazenadas as variaveis?");
		lb11.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt11A = new JButton("No programa/software.");
		bt11A.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt11A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt11A.setForeground(Color.yellow);
		bt11A.setContentAreaFilled(false);
		bt11A.setBorder(null);

		bt11B = new JButton("Na memória RAM do computador.");
		bt11B.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt11B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt11B.setForeground(Color.yellow);
		bt11B.setContentAreaFilled(false);
		bt11B.setBorder(null);

		bt11C = new JButton("No banco de dados");
		bt11C.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt11C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt11C.setForeground(Color.yellow);
		bt11C.setContentAreaFilled(false);
		bt11C.setBorder(null);

		bt11D = new JButton("No banco de dados, no software e na memória RAM");
		bt11D.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		bt11D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt11D.setForeground(Color.yellow);
		bt11D.setContentAreaFilled(false);
		bt11D.setBorder(null);

		lb11.setBounds(90, 60, 600, 35);
		bt11A.setBounds(90, 235, 400, 25);
		bt11B.setBounds(90, 300, 400, 25);
		bt11C.setBounds(90, 355, 400, 25);
		bt11D.setBounds(80, 415, 450, 25);

		p12.add(lb11);
		p12.add(bt11A);
		p12.add(bt11B);
		p12.add(bt11C);
		p12.add(bt11D);
		p12.add(lbImgP12);

		p12.setVisible(false);

		//

		//

		p13 = new JPanel();
		p13.setLayout(null);
		p13.setBounds(0, 0, 800, 550);

		imgP13 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP13 = new JLabel(imgP13);
		lbImgP13.setBounds(0, 0, 745, 480);

		lb12 = new JLabel("Qual dos seguintes é um operador de");
		lb12.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lb121 = new JLabel("concatenação de strings válido?");
		lb121.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt12A = new JButton("+");
		bt12A.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt12A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt12A.setForeground(Color.yellow);
		bt12A.setContentAreaFilled(false);
		bt12A.setBorder(null);

		bt12B = new JButton("*");
		bt12B.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt12B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt12B.setForeground(Color.yellow);
		bt12B.setContentAreaFilled(false);
		bt12B.setBorder(null);

		bt12C = new JButton(";");
		bt12C.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt12C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt12C.setForeground(Color.yellow);
		bt12C.setContentAreaFilled(false);
		bt12C.setBorder(null);

		bt12D = new JButton("#");
		bt12D.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt12D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt12D.setForeground(Color.yellow);
		bt12D.setContentAreaFilled(false);
		bt12D.setBorder(null);

		lb12.setBounds(90, 60, 600, 35);
		lb121.setBounds(90, 80, 600, 35);
		bt12A.setBounds(90, 235, 200, 25);
		bt12B.setBounds(90, 300, 200, 25);
		bt12C.setBounds(90, 355, 200, 25);
		bt12D.setBounds(90, 420, 200, 25);

		p13.add(lb12);
		p13.add(lb121);
		p13.add(bt12A);
		p13.add(bt12B);
		p13.add(bt12C);
		p13.add(bt12D);
		p13.add(lbImgP13);

		p13.setVisible(false);

		//

		//

		p14 = new JPanel();
		p14.setLayout(null);
		p14.setBounds(0, 0, 800, 550);

		imgP14 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP14 = new JLabel(imgP14);
		lbImgP14.setBounds(0, 0, 745, 480);

		lb13 = new JLabel("Qual dos seguintes itens possui apenas tipos");
		lb13.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lb131 = new JLabel("válidos usados em lógica de programação");
		lb131.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lb132 = new JLabel("(tipos primitivos)?");
		lb132.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt13A = new JButton("Inteiro, Temporal, Caractere, Double.");
		bt13A.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		bt13A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt13A.setForeground(Color.yellow);
		bt13A.setContentAreaFilled(false);
		bt13A.setBorder(null);

		bt13B = new JButton("Inteiro, Booleano, Tipografia, Double.");
		bt13B.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		bt13B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt13B.setForeground(Color.yellow);
		bt13B.setContentAreaFilled(false);
		bt13B.setBorder(null);

		bt13C = new JButton("Inteiro, Booleano, Caractere, Double.");
		bt13C.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		bt13C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt13C.setForeground(Color.yellow);
		bt13C.setContentAreaFilled(false);
		bt13C.setBorder(null);

		bt13D = new JButton("Temporal, Triple, Caractere, Double.");
		bt13D.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		bt13D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt13D.setForeground(Color.yellow);
		bt13D.setContentAreaFilled(false);
		bt13D.setBorder(null);

		lb13.setBounds(90, 60, 600, 35);
		lb131.setBounds(90, 80, 600, 35);
		lb132.setBounds(90, 100, 600, 35);
		bt13A.setBounds(90, 235, 400, 25);
		bt13B.setBounds(90, 300, 400, 25);
		bt13C.setBounds(90, 355, 400, 25);
		bt13D.setBounds(90, 420, 400, 25);

		p14.add(lb13);
		p14.add(lb131);
		p14.add(lb132);
		p14.add(bt13A);
		p14.add(bt13B);
		p14.add(bt13C);
		p14.add(bt13D);
		p14.add(lbImgP14);
		p14.setVisible(false);

		//

		//

		p15 = new JPanel();
		p15.setLayout(null);
		p15.setBounds(0, 0, 800, 550);

		imgP15 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP15 = new JLabel(imgP15);
		lbImgP15.setBounds(0, 0, 745, 480);

		lb14 = new JLabel("Qual dos seguintes itens a seguir pode ");
		lb14.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lb141 = new JLabel("ser representado por um valor constante?");
		lb141.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt14A = new JButton("Salário de um Funcionário");
		bt14A.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt14A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt14A.setForeground(Color.yellow);
		bt14A.setContentAreaFilled(false);
		bt14A.setBorder(null);

		bt14B = new JButton("Valor da Temperatura no Verão");
		bt14B.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt14B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt14B.setForeground(Color.yellow);
		bt14B.setContentAreaFilled(false);
		bt14B.setBorder(null);

		bt14C = new JButton("Distância da Terra ao Sol");
		bt14C.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt14C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt14C.setForeground(Color.yellow);
		bt14C.setContentAreaFilled(false);
		bt14C.setBorder(null);

		bt14D = new JButton("Valor de Pi");
		bt14D.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		bt14D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt14D.setForeground(Color.yellow);
		bt14D.setContentAreaFilled(false);
		bt14D.setBorder(null);

		lb14.setBounds(90, 60, 600, 35);
		lb141.setBounds(90, 80, 600, 35);
		bt14A.setBounds(90, 235, 400, 25);
		bt14B.setBounds(90, 300, 400, 25);
		bt14C.setBounds(90, 355, 400, 25);
		bt14D.setBounds(90, 420, 400, 25);

		p15.add(lb14);
		p15.add(lb141);
		p15.add(bt14A);
		p15.add(bt14B);
		p15.add(bt14C);
		p15.add(bt14D);
		p15.add(lbImgP15);

		p15.setVisible(false);

		//

		//

		p16 = new JPanel();
		p16.setLayout(null);
		p16.setBounds(0, 0, 800, 550);

		imgP16 = new ImageIcon("C:\\imagens- java\\Fundo-Quiz.jpeg");
		lbImgP16 = new JLabel(imgP16);
		lbImgP16.setBounds(0, 0, 745, 480);

		lb15 = new JLabel("Para que serve o operador aritmético de");
		lb15.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lb151 = new JLabel("módulo %?");
		lb151.setFont(new Font("Bookman Old Style", Font.BOLD, 16));

		bt15A = new JButton("Calcular porcentagens");
		bt15A.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		bt15A.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt15A.setForeground(Color.yellow);
		bt15A.setContentAreaFilled(false);
		bt15A.setBorder(null);

		bt15B = new JButton("Realizar cálculos aritméticos de investimentos");
		bt15B.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		bt15B.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt15B.setForeground(Color.yellow);
		bt15B.setContentAreaFilled(false);
		bt15B.setBorder(null);

		bt15C = new JButton("Retornar o módulo matemático (valor absoluto)");
		bt15C.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		bt15C.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt15C.setForeground(Color.yellow);
		bt15C.setContentAreaFilled(false);
		bt15C.setBorder(null);

		bt15D = new JButton("Calcular o resto de uma divisão inteira");
		bt15D.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		bt15D.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt15D.setForeground(Color.yellow);
		bt15D.setContentAreaFilled(false);
		bt15D.setBorder(null);

		lb15.setBounds(90, 60, 600, 35);
		lb151.setBounds(90, 80, 600, 35);
		bt15A.setBounds(90, 235, 400, 25);
		bt15B.setBounds(90, 300, 400, 25);
		bt15C.setBounds(90, 355, 400, 25);
		bt15D.setBounds(90, 420, 400, 25);

		p16.add(lb15);
		p16.add(lb151);
		p16.add(bt15A);
		p16.add(bt15B);
		p16.add(bt15C);
		p16.add(bt15D);
		p16.add(lbImgP16);

		p16.setVisible(false);

		//

		pTab = new JPanel();
		pTab.setLayout(null);
		pTab.setBounds(0, 0, 800, 550);
		pTab.setBackground(Color.white);
		imgTab = new ImageIcon("C:\\imagens- java\\Fundo-Tabela-Quiz.jpeg");
		lbTab = new JLabel(imgTab);
		lbTab.setBounds(0, 0, 745, 480);

		btSair = new JButton("Sair");
		btSair.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
		btSair.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btSair.setForeground(Color.blue);
		btSair.setContentAreaFilled(false);
		btSair.setBorder(null);
		btSair.setBounds(450, 360, 150, 25);
		
		btJogar = new JButton("Jogar de novo");
		btJogar.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
		btJogar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btJogar.setForeground(Color.blue);
		btJogar.setContentAreaFilled(false);
		btJogar.setBorder(null);
		btJogar.setBounds(110, 360, 200, 25);
		
		pTab.add(btJogar);

		pTab.setVisible(false);
		
		//
		
		pGan = new JPanel();
		pGan.setLayout(null);
		pGan.setBounds(0, 0, 800, 550);
		pGan.setBackground(Color.white);

		imgGan = new ImageIcon("C:\\imagens- java\\Fundo-Ganhou.jpeg");
		lbGan = new JLabel(imgGan);
		lbGan.setBounds(0, 0, 745, 480);
		
		btTab2 = new JButton("Ver ranking");
		btTab2.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
		btTab2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btTab2.setForeground(Color.yellow);
		btTab2.setContentAreaFilled(false);
		btTab2.setBorder(null);
		btTab2.setBounds(295, 420, 150, 25);

		pGan.setVisible(false);
		pGan.add(btTab2);
		pGan.add(lbGan);

		pPer = new JPanel();
		pPer.setLayout(null);
		pPer.setBounds(0, 0, 800, 550);
		pPer.setBackground(Color.white);

		imgPer = new ImageIcon("C:\\imagens- java\\Fundo-Perdeu.jpeg");
		lbPer = new JLabel(imgPer);
		lbPer.setBounds(0, 0, 745, 480);
		pPer.setVisible(false);

		btTab = new JButton("Ver ranking");
		btTab.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
		btTab.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btTab.setForeground(Color.yellow);
		btTab.setContentAreaFilled(false);
		btTab.setBorder(null);
		btTab.setBounds(295, 410, 150, 25);
		
		lbRanking = new JLabel("Ranking");
		lbRanking.setBounds(280, 23, 300, 45);
		lbRanking.setFont(new Font("Bookman Old Style", Font.BOLD, 36));
		lbRanking.setForeground(Color.yellow);
		lbRanking.setVisible(false);

		pPer.add(btTab);
		pPer.add(lbPer);
		
		scrollTable = new JScrollPane();
		scrollTable.setBounds(116, 85, 510, 220);
		bd = new BD();
		j = new JogoDAO(); 
		if (!j.bd.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha na conexão!");
			System.exit(0);
		}
		pTab.add(lbRanking);
		pTab.add(scrollTable);
		pTab.add(btSair);
		pTab.add(lbTab);
		adicionarTabela();
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		add(p8);
		add(p9);
		add(p10);
		add(p11);
		add(p12);
		add(p13);
		add(p14);
		add(p15);
		add(p16);
		add(pTab);
		add(pGan);
		add(pPer);
	}
public void adicionarTabela() {
		
		try {
			if (!bd.getConnection()) {
				JOptionPane.showMessageDialog(null, "Falha na conex�o!");
				System.exit(0);
			}
			st = bd.c.prepareStatement(j.atualizarTabela());
			rs = st.executeQuery();
			DefaultTableModel tableModel = new DefaultTableModel(
					new String[] { "Nome", "Pontuação", "Dinheiro"}, 0) {
			};

			table = new JTable(tableModel);
			DefaultTableModel dtm = (DefaultTableModel) table.getModel();

			while (rs.next()) {
				try {
					String[] dados = new String[3];
					for (int i = 1; i <= 3; i++) {
						dados[i - 1] = rs.getString(i);

					}
					dtm.addRow(dados);
					System.out.println();
				} catch (SQLException erro) {

				}
				scrollTable.setViewportView(table);
			}
			rs.close();
			st.close();
			bd.close();
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Comando Inválido" + erro.toString());
		}
		table.setFont(new Font("Times New Roman", Font.BOLD, 18));
		table.setForeground(new Color(16, 78, 139));
		table.setBackground(Color.white);
		DefaultTableCellRenderer Centro = new DefaultTableCellRenderer();
		Centro.setHorizontalAlignment(SwingConstants.CENTER);
		table.setRowHeight(40);
		table.getColumnModel().getColumn(0).setPreferredWidth(170);
		table.getColumnModel().getColumn(0).setResizable(true);
		table.getColumnModel().getColumn(0).setCellRenderer(Centro);
		table.getColumnModel().getColumn(1).setPreferredWidth(145);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setCellRenderer(Centro);
		table.getColumnModel().getColumn(2).setPreferredWidth(190);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setCellRenderer(Centro);
		table.getTableHeader().setReorderingAllowed(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		

	}
	public void definirEventos() {
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txNome.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor preencha com seu nome");
					return;
				}
				p1.setVisible(false);
				p2.setVisible(true);
				dindin.setVisible(true);
				pontuacao.setVisible(true);

				lbNomeJog.setText(txNome.getText());
			}
		});
		bt1A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);

			}
		});
		bt1B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt1C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2.setVisible(false);
				p3.setVisible(true);
				dinheiro = 500.000;
				dindin.setText("" + dinheiro);
				pont = 2;
				pontuacao.setText("" + pont);

			}
		});
		bt1D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt2A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p3.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt2B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p3.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt2C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p3.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});

		bt2D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p3.setVisible(false);
				p4.setVisible(true);
				dinheiro = 1000.000;
				dindin.setText("" + dinheiro);
				pont = 3;
				pontuacao.setText("" + pont);

			}
		});
		bt3A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p4.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt3B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p4.setVisible(false);
				p5.setVisible(true);
				dinheiro = 2000.000;
				dindin.setText("" + dinheiro);
				pont = 3;
				pontuacao.setText("" + pont);

			}
		});
		bt3C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p4.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt3D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p4.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt4A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p5.setVisible(false);
				p6.setVisible(true);
				dinheiro = 3000.000;
				dindin.setText("" + dinheiro);
				pont = 4;
				pontuacao.setText("" + pont);

			}
		});
		bt4B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p5.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt4C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p5.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt4D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p5.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt5A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p6.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt5B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p6.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt5C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p6.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt5D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p6.setVisible(false);
				p7.setVisible(true);
				dinheiro = 5000.000;
				dindin.setText("" + dinheiro);
				pont = 5;
				pontuacao.setText("" + pont);

			}
		});
		bt6A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p7.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt6B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p7.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt6C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p7.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt6D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p7.setVisible(false);
				p8.setVisible(true);
				dinheiro = 10000.000;
				dindin.setText("" + dinheiro);
				pont = 6;
				pontuacao.setText("" + pont);

			}
		});
		bt7A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p8.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt7B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p8.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt7C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p8.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt7D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p8.setVisible(false);
				p9.setVisible(true);
				dinheiro = 15000.000;
				dindin.setText("" + dinheiro);
				pont = 7;
				pontuacao.setText("" + pont);
			}
		});
		bt8A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p9.setVisible(false);
				p10.setVisible(true);
				dinheiro = 20000.000;
				dindin.setText("" + dinheiro);
				pont = 8;
				pontuacao.setText("" + pont);
			}
		});
		bt8B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p9.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt8C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p9.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt8D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p9.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt9A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p10.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt9B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p10.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt9C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p10.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt9D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p10.setVisible(false);
				p11.setVisible(true);
				dinheiro = 30000.000;
				dindin.setText("" + dinheiro);
				pont = 9;
				pontuacao.setText("" + pont);
			}
		});
		bt10A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p11.setVisible(false);
				p12.setVisible(true);
				dinheiro = 50000.000;
				dindin.setText("" + dinheiro);
				pont = 10;
				pontuacao.setText("" + pont);
			}
		});
		bt10B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p11.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt10C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p11.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt10D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p11.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt11A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p12.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt11B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p12.setVisible(false);
				p13.setVisible(true);
				dinheiro = 100000.000;
				dindin.setText("" + dinheiro);
				pont = 11;
				pontuacao.setText("" + pont);
			}
		});
		bt11C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p12.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt11D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p12.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt12A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p13.setVisible(false);
				p14.setVisible(true);
				dinheiro = 150000.000;
				dindin.setText("" + dinheiro);
				pont = 12;
				pontuacao.setText("" + pont);
			}
		});
		bt12B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p13.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});

		bt12C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p13.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt12D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p13.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt13A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p14.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt13B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p14.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt13C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p14.setVisible(false);
				p15.setVisible(true);
				dinheiro = 300000.000;
				dindin.setText("" + dinheiro);
				pont = 13;
				pontuacao.setText("" + pont);
			}
		});
		bt13D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p14.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt14A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p15.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt14B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p15.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt14C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p15.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 410, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		bt14D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p15.setVisible(false);
				p16.setVisible(true);
				dinheiro = 500000.000;
				dindin.setText("" + dinheiro);
				pont = 14;
				pontuacao.setText("" + pont);
			}
		});
		bt15A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p16.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 420, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);

			}
		});
		bt15B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p16.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 420, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);

			}
		});
		bt15C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p16.setVisible(false);
				pPer.setVisible(true);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 420, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);

			}
		});
		bt15D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p16.setVisible(false);
				pGan.setVisible(true);
				pont = 15;
				pontuacao.setText("" + pont);
				dinheiro = 1000000.000;
				dindin.setText("" + dinheiro);
				dindin.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
				dindin.setBounds(605, 420, 200, 25);
				lbNomeJog.setVisible(true);
				pontuacao.setVisible(false);
			}
		});
		btTab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pPer.setVisible(false);
				pTab.setVisible(true);
				dindin.setVisible(false);
				lbNomeJog.setVisible(false);
				lbRanking.setVisible(true);
				
				j.Quiz.setNome(txNome.getText());
				j.Quiz.setDinheiro(dindin.getText());
				j.Quiz.setPontuacao(pontuacao.getText());
				
				JOptionPane.showMessageDialog(null, j.atualizar(JogoDAO.INCLUSAO));
				j.atualizarTabela();
				
				
				adicionarTabela();

			}
		});
		btTab2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pGan.setVisible(false);
				pTab.setVisible(true);
				dindin.setVisible(false);
				lbNomeJog.setVisible(false);
				lbRanking.setVisible(true);
				
				j.Quiz.setNome(txNome.getText());
				j.Quiz.setDinheiro(dindin.getText());
				j.Quiz.setPontuacao(pontuacao.getText());
				
				JOptionPane.showMessageDialog(null, j.atualizar(JogoDAO.INCLUSAO));
				j.atualizarTabela();
				
				
				adicionarTabela();

			}
		});
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pTab.setVisible(false);
				p1.setVisible(true);
				lbRanking.setVisible(false);
				lbNomeJog.setVisible(false);
				pont = 1;
				pontuacao.setText("" + pont);
				dinheiro = 0.00;
				dindin.setText("" + dinheiro);
				dindin.setBounds(610, 370, 200, 25);
			}});
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Quem quer ser um programador?");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Jogo());
		frame.setBounds(200, 100, 755, 515);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
