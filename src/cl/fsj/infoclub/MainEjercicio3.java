package cl.fsj.infoclub;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer>Golosinas=new TreeMap<String,Integer>();
		Map<String,Integer>Golosinas_Baratas = new TreeMap<String,Integer>();
		Golosinas.put("Chocman", 100);
		Golosinas.put("Trululu", 100);
		Golosinas.put("Centella", 100);
		Golosinas.put("Kilate", 50);
		Golosinas.put("Miti-miti", 30);
		Golosinas.put("Traga-traga", 150);
		Golosinas.put("Tableton",5);
		
		
		for (Map.Entry<String,Integer> entry : Golosinas.entrySet()) {
            
			if (entry.getValue()<100) {
				Golosinas_Baratas.put(entry.getKey(), entry.getValue());
			}
		}
		
		System.out.println(Golocinas_Baratas);
		
		
		
	}

}
