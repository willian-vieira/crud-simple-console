package DAO;

import Model.Person;

import java.util.List;

public interface IPersonDAO {
    public List<Person> listPerson();
    public Person addPerson(Person person);
    public void updatePerson();
    public void deletePerson(Integer idPerson);
}
