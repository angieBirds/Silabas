import javax.swing.*;
public class Interfaz extends JFrame{
	JButton bot;
	public Interfaz (String nombre, int x, int y, int ancho, int alto){
		
		//creacion del Panel
		super(nombre);
		this.setBounds(x,y,ancho, alto);
		this.getContentPane().setLayout(null);
		
		//creacion de botones
		bot=new JButton ("Ba");
		bot.setBounds(20,20,55,30);
		this.getContentPane().add(bot);
		bot= new JButton ("Be");
		bot.setBounds(100,40, 65, 50);
		this.getContentPane().add(bot);
		bot= new JButton("Bi");
		bot.setBounds(180, 40, 65, 50);
		this.getContentPane().add(bot);
		bot= new JButton("Bo");
		bot.setBounds(260, 40, 65, 50);
		this.getContentPane().add(bot);
		bot= new JButton("Bu");
		bot.setBounds(340, 40, 65, 50);
		this.getContentPane().add(bot);
		
		this.setVisible(true);
		
		//creacion de oyentes
		
		
	}
	

}
