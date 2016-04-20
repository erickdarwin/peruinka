package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.com.peruInka.service.util.Person;

@Service("peruInkaService")
public class PeruInkaService {

	public static List<Person> listPerson = new ArrayList<Person>();

	public void savePerson(Person person) {
		listPerson.add(person);
		// peruInkaDAO.savePerson(person);
	}

	public List<Person> findAllPerson() {
		// return peruInkaDAO.findAllPerson();
		return listPerson;
	}

	public void deletePerson(Long id) {
		// peruInkaDAO.deletePerson(id);
		List<Person> listPersoTemp = new ArrayList<Person>();

		for (Person person : listPerson) {
			if(id.compareTo(person.getId())!=0 ){
				listPersoTemp.add(person);
			}
		}
		listPerson = new ArrayList<Person>();
		listPerson.addAll(listPersoTemp);		
	}

	
	public void updatePerson(Person personUpdate){
		List<Person> listTemp = new ArrayList<Person>();
		
		for (Person person : listPerson) {
			if(personUpdate.getId().compareTo(person.getId())==0){
				listTemp.add(personUpdate);
			}else{
				listTemp.add(person);
			}
		}
		listPerson = new ArrayList<Person>();
		listPerson.addAll(listTemp);

	}
	
	public Person searchPerson(Long id){
		Person personReturn = new Person();
		for (Person person : listPerson) {
			if(id.compareTo(person.getId())==0){
				personReturn = person;
				continue;
			}
		}
		return personReturn;
	}
}
