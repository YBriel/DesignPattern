package vistor;

import java.util.LinkedList;
import java.util.List;

public class ObejectStructure {

    private List<Person> personList=new LinkedList<>();

    public void attach(Person p){
        personList.add(p);
    }

    public void detach(Person p){
        personList.remove(p);
    }

    public void display(Action action){
        for(Person p: personList){
            p.accept(action);
        }
    }
}
