/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moni_
 */
public class Team {
    
   
    private TeamName name;
    private List<Person> members;

    public Team(TeamName name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        if (members.size() < 5) {
            members.add(person);
        }
    }
    
    public List<Person> getMembers() {
    return members;
}

    // Getters and setters
    // ...

    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("TEAM: ").append(name).append(".  \n");
    for (Person person : members) {
        sb.append(person).append(".\n");
    }
    
    
   sb.append("\n");
    return sb.toString();

    }

}
    

