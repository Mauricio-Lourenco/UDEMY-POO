package publicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comentario c1 = new Comentario("Have a nice trip");
		Comentario c2 = new Comentario("wow that's awesome");

		Publicacao p1 = new Publicacao(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
				"I'm going to visit to  this wonderful country", 12);

		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);

		Comentario c3 = new Comentario("Good Night!");
		Comentario c4 = new Comentario("May the force be with you!");

		Publicacao p2 = new Publicacao(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);

		p2.adicionarComentario(c3);
		p2.adicionarComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
