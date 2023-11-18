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
}
