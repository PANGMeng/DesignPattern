package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xiaojun YU on 2017-02-24.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons){
            if(person.getMaritalStatus().equalsIgnoreCase("Single")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}