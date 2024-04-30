package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("pedrohsouzadev", "senha123senha"));
		email.setFrom("pedrohsouzadev@gmail.com");
		email.setSubject("Teste Pedrão");
		email.setMsg("Chora pato :-)");
		email.addTo("fabio_meu@hotmail.com");
		email.send();
	}

}
