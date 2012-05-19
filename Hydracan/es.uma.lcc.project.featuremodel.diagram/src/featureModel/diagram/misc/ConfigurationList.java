package featureModel.diagram.misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConfigurationList implements Iterable{
	public List<Configuration> configurationList;
	
	public ConfigurationList (){
		configurationList = new ArrayList<Configuration>();
	}
	
	public void add(Configuration config){
		configurationList.add(config);
	}

	@Override
	public Iterator<Configuration> iterator() {
		// TODO Auto-generated method stub
		return configurationList.iterator();
	}
	
	public boolean isNameFree(String baseName){
		boolean res = true;
		Iterator<Configuration> iterador = iterator();
		while(res && iterador.hasNext()){
			Configuration config = (Configuration) iterador.next();
			res = !baseName.equals(config.getBaseName());
		}
		
		return res;
	}
	
	public void removeConfiguration(String name){
		Iterator it = configurationList.iterator();
		boolean exit = false;
		Configuration configuration = null;
		
		while (!exit && it.hasNext() ){
			configuration = (Configuration) it.next();
			if (configuration.getBaseName().equals(name)) exit = true;
		}
		
		if (exit) configurationList.remove(configuration);
	}
	
	
	public String getNewNameConfig (){
		String res = null, defaultName = "Config";
		int myInteger = 0;
		
		do {
			res = defaultName + myInteger++;
		}while (!isNameFree(res));
		
		return res;
	}
	
	
	
	public boolean isNotEmpty(){
		return configurationList.size() > 0;
	}
	
	
}
