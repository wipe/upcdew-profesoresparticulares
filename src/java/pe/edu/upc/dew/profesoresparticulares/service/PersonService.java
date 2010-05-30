package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.List;

import pe.edu.upc.dew.profesoresparticulares.model.Person;

public interface PersonService {
    public List<Person> findAll();

    public void save(Person person);

    public void remove(int id);

    public Person find(int id);
}
