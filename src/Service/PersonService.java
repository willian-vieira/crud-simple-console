package Service;


import DAO.PersonDAO;
import Model.Person;

import java.util.List;

public class PersonService {
    PersonDAO personDAO = new PersonDAO();

    /**
     * Serviço - Encontra Pessoas
     * @return
     */
    public List<Person> findAllPerson() {
        return personDAO.listPerson();
    }

    /**
     * Serviço - Cria uma Pessoa
     * @param person
     * @return
     */
    public Person createPerson(Person person) {
        return personDAO.addPerson(person);
    }
}
