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
		
		Set<String> posiblesInvitados =new TreeSet <>();
		posiblesInvitados.add("Jorge");
		posiblesInvitados.add("Francisco");
		posiblesInvitados.add("Marcos");
		
		posiblesInvitados.remove("Jorge");
		
		Set<String> listadoFinal = new TreeSet <>();
		listadoFinal.addAll(invitados);
		listadoFinal.addAll(posiblesInvitados);
		System.out.println(listadoFinal);
		
	}

}
