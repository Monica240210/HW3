 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author moni_
 */
public class HW3 {

    /**
     * @param args the command line arguments
     */
    public static String centerAlign(String text, int width) {
        if (text.length() >= width) {
            return text; 
        }

        int totalPadding = width - text.length(); //Calculate the total padding space needed
        int leftPadding = totalPadding / 2; // Calculate left - side padding.
        int rightPadding = totalPadding - leftPadding; //Calculate right -side padding 

        StringBuilder paddedText = new StringBuilder(); //Create a StringBuilder to build the centered text.
        // Add left -side padding spaces
        for (int i = 0; i < leftPadding; i++) {
            paddedText.append(" ");
        }
        paddedText.append(text);
        // Add right - side padding spaces.
        for (int i = 0; i < rightPadding; i++) {
            paddedText.append(" ");
        }

        return paddedText.toString();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // Read data from a CSV file and store it in a list of people
        List<Person> people = readDataFromFile("MOCK_DATA.csv");
        // Shuffle (randomize) the people in the list
        Collections.shuffle(people);
        
        //Create a set to keep track of people assigned to teams
        Set<Person> usedPeople = new HashSet<>();
        //Create a list of teams
        List<Team> teams = new ArrayList<>();
        
        
        //Iterate through team names and form teams with 5 members each
        for (TeamName teamName : TeamName.values()) {
            Team team = new Team(teamName);
           //Add people to a team until it has 5 members or there no more people left
            while (team.getMembers().size() < 5 && !people.isEmpty()) {
                Person person = people.remove(0);// Take the first person from the list
                if (!usedPeople.contains(person)) { // Check if the person has not been assigned before
                    team.addMember(person);// Add the person to the team
                    usedPeople.add(person);// Record the person as assigned
                }
            }
            teams.add(team); //Add the team to the list of teams
        }
        
        //Print the information of each team
        for (Team team : teams) {
            System.out.println(team);
        }
    }
    // Method to read data from a CSV file and store it in a list of people

    private static List<Person> readDataFromFile(String filename) {
        List<Person> people = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                //If the line contains at least 4 fields, create a person object and add it to the list
                if (data.length >= 4) {
                    int id = Integer.parseInt(data[0]);
                    String firstName = data[1];
                    String lastName = data[2];
                    String email = data[3];
                    people.add(new Person(id, firstName, lastName, email));
                }
            }
        } catch (IOException e) {
             e.printStackTrace();// In case of an error,print the exception trace
        }
        return people; //Return the list of people read from the file
        }
    }
    