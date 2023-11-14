package DAO;

import Model.Person;

import java.util.List;

public interface IPersonDAO {
    public List<Person> listPerson();
    public Person addPerson();
    public void updatePerson();
    public void deletePerson();
}
