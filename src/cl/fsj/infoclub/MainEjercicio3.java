package cl.fsj.infoclub;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer>Golocinas=new TreeMap<String,Integer>();
		Map<String,Integer>Golocinas_Baratas = new TreeMap<String,Integer>();
		Golocinas.put("Chocman", 100);
		Golocinas.put("Trululu", 100);
		Golocinas.put("Centella", 100);
		Golocinas.put("Kilate", 50);
		Golocinas.put("Miti-miti", 30);
		Golocinas.put("Traga-traga", 150);
		Golocinas.put("Tableton",5);
		
		
		for (Map.Entry<String,Integer> entry : Golocinas.entrySet()) {
            //System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
			
			if (entry.getValue()<100) {
				Golocinas_Baratas.put(entry.getKey(), entry.getValue());
			}
		}
		
		System.out.println(Golocinas_Baratas);
		
		
		
	}

}
