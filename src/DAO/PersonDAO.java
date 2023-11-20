package DAO;

import Factory.ConnectionFactory;
import Model.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO implements IPersonDAO {

    /**
     * Lista Todas as Pessoas
     * @return listPerson
     */
    @Override
    public List<Person> listPerson() {
        List<Person> listPerson = new ArrayList<>();
        Person person = null;
        ResultSet resultSet = null;
        PreparedStatement pstm = null;
        Connection connection = null;

        try {
            connection = ConnectionFactory.getConnection();
            pstm = connection.prepareStatement("SELECT * FROM Crud");
            resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                person = new Person();
                person.setId(resultSet.getLong(1));
                person.setName(resultSet.getString(2));
                person.setCpf(resultSet.getString(3));
                person.setEmail(resultSet.getString(4));
                person.setPhone(resultSet.getString(5));
                listPerson.add(person);
            }

            connection.close();
            pstm.close();
            resultSet.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPerson;
    }

    /**
     * Cria uma Pessoa
     * @param person
     * @return person OU null
     */
    @Override
    public Person addPerson(Person person) {
        ResultSet resultSet = null;
        PreparedStatement pstm = null;
        Connection connection = null;

        try {
            connection = ConnectionFactory.getConnection();
            pstm = connection.prepareStatement("INSERT INTO Crud (id, name, cpf, email, phone) VALUES (nextVal('crudSerial'), ?, ?, ?, ?)");
            pstm.setString(1, person.getName());
            pstm.setString(2, person.getCpf());
            pstm.setString(3, person.getEmail());
            pstm.setString(4, person.getPhone());
            pstm.execute();

            pstm.close();
            connection.close();

            return person;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updatePerson() {

    }

    @Override
    public void deletePerson() {

    }
}
