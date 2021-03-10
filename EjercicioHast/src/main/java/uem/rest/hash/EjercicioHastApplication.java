package uem.rest.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import uem.rest.hash.modelo.entidad.Usuario;
import uem.rest.hash.modelo.persistencia.DaoUsuario;

@SpringBootApplication
public class EjercicioHastApplication {

	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = SpringApplication.run(EjercicioHastApplication.class, args);
		Scanner sc = new Scanner(System.in);
		int opcion = Integer.parseInt(sc.nextLine());
		DaoUsuario daoUsuario = context.getBean("daoUsuario", DaoUsuario.class);
		System.out.println("########## MENU ##########");
		System.out.println("Elige una opción");
		System.out.println("1- Dar de alta un usuario");
		System.out.println("2- Login");
		System.out.println("0- SALIR");

		while (opcion != 0) {

			switch (opcion) {
			case 1:
				System.out.println("Escribe el nombre de usuario:");
				String user = sc.nextLine();
				System.out.println("Escribe la contraseña:");
				String password = sc.nextLine();

				//
				byte[] contraseña = password.getBytes();
				MessageDigest md;
				try {
					md = MessageDigest.getInstance("SHA-512");
					md.update(contraseña);
					byte[] passHash = md.digest();
					String contraHaseada = Base64.getEncoder().encodeToString(passHash);
					Usuario usu = new Usuario (user, contraHaseada);
					daoUsuario.save(usu);
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case 2:
				System.out.println("Escribe el nombre de usuario:");
				String userIntroducido = sc.nextLine();
				System.out.println("escriba la contraseña:");
				String contraseñaIntro = sc.nextLine();
				Usuario u = daoUsuario.findByUser(userIntroducido);

				byte[] passIntroducida = contraseñaIntro.getBytes();
				MessageDigest md2;
				try {
					md2 = MessageDigest.getInstance("SHA-512");
					md2.update(passIntroducida);
					byte[] passHash2 = md2.digest();
					String contraHaseada2 = Base64.getEncoder().encodeToString(passHash2);

					if (contraHaseada2.equals(u.getPassword())) {
						System.out.println("Ha iniciado sesión correctamente");
					} else {
						System.out.println("ERROR: Invalid credentials");
					}
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

				break;

			default:
				break;
			}
			opcion = Integer.parseInt(sc.nextLine());

		}
	}

}
