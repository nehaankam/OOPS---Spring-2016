/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coach;

import java.util.ArrayList;

/**
 *
 * @author Neha Ankam
 */
public class CoachList {
   
    
    private ArrayList<Coach> coachArrayList;   
   
    /**
     * this is no arg constructor
     */
    public CoachList(){
       coachArrayList = new ArrayList<Coach>();
   }
   
    /**
     * this is used to add a coach to array list
     * @param coach
     * @return true or false
     */
    public boolean addCoach(Coach coach){
       return coachArrayList.add(coach) ;
   }

    /**
     * this is used to add coach to position
     * @param coachPosition
     * @param coach
     * @return true or false
     */
    public boolean addCoach(int coachPosition, Coach coach){
       if(coachPosition > coachArrayList.size())
           return false;
       else {
           coachArrayList.add(coachPosition,coach);
           return true;
       }       
   }

    /**
     * this is used to remove coach
     * @param coachPosition
     * @return true or false
     */
    public boolean removeCoach(int coachPosition){
       if(coachPosition >= coachArrayList.size())
           return false;
       else{
           coachArrayList.remove(coachPosition);
           return true;
       }
   } 

    /**
     * this is used to get number of coach
     * @return int
     */
    public int getNumberOfCoach(){
       return coachArrayList.size();
   }

    /**
     * this is used to find avg salary
     * @return double
     */
    public double findAverageSalary(){
       if(coachArrayList.isEmpty())
           return 0.0;
       else{
           double sal=0.0;
           for(int i = 0;i<coachArrayList.size();i++)
           {
               sal+=coachArrayList.get(i).getSalary();
           }
           return (sal/coachArrayList.size());
       
       }
   }
    
    /**
     * this is used to display values
     * @return String
     */
   @Override
   public String toString(){
       String str ="";
       for(Coach ch : coachArrayList){
           str+=ch.toString()+"\n";
       }
       return str;
   }  
}
