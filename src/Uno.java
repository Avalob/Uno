/*1.Diseña un programa para utilizar el objeto String. Se pide por pantalla una dirección
de correo electrónico, se debe comprobar:
• Que contiene la @
• Que no se teclea más de 1 @
• Que aparece un punto, al final del correo electrónico.
• Que la longitud mínima sea de 20 caracteres.
• Que los textos aparecen en minúsculas.*/
import java.util.Scanner;
public class Uno {

	public static void main(String[] args) {
		System.out.println("Inserte su correo electrónico:");
		Scanner sc=new Scanner(System.in);
        String correo=sc.nextLine();
        char ultimo = correo.charAt(correo.length()-1);
        if (correo.contains("@")) {
            if (correo.indexOf("@")==correo.lastIndexOf("@")) {
                if (ultimo == '.') {
                    if (correo.length() < 20) {
                        if (((correo.equals(correo.toLowerCase())))) {
                            System.out.println("correo válido");
                        } else {
                            System.out.println("El correo debe estar en minúscula");
                        }
                    } else {
                        System.out.println("El correo debe contener mas de 20 caracteres");
                    }
                } else {
                    System.out.println("El correo debe contener un punto al final");
                }
            } else {
                System.out.println("El correo no puede contener má de una @");
            }
        } else {System.out.println("El correo debe contener un @");
            
        }
	}

}
