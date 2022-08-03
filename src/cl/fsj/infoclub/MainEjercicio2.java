package cl.fsj.infoclub;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainEjercicio2 {

	public static void main(String[] args) {
		Set<String> invitados = new TreeSet <>();
		invitados.add("Daniel");
		invitados.add("Paola");
		invitados.add("Facundo");
		invitados.add("Pedro");
		invitados.add("Jacinta");
		invitados.add("Florencia");
		invitados.add("Juan Pablo");
		
		Set<String> posiblesInvitados =new HashSet <>(Arrays.asList("Jorge","Francisco","Marcos"));
		
		Set<String> listadoFinal = new TreeSet <>(invitados);
		listadoFinal.addAll(posiblesInvitados);
		System.out.println(listadoFinal);
	}

}
