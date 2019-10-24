package LeonsLengthyLearnerLab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {


    private List<Person> personList = new ArrayList<>(  );

    public void add(Person person){
        personList.add( person );


    }

    public Person findbyID(long id){
        for(Person person: personList){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person){

        return personList.contains( person );

    }

    public void remove (long id){
        personList.remove( findbyID( id ) );

    }

    public void remove(Person person){
        personList.remove( person );
    }

    public void removeAll(){
        personList.clear();
    }

    public Person[] toArray(){
        return(Person[]) personList.toArray();
    }

    @Override
    public Iterator<Person> iterator(){
        return personList.iterator();
    }
}