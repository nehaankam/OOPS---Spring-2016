/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coach;

/**
 *
 * @author Neha Ankam
 */
public class CoachArray {

    private Coach[] coachArray;
    private int coachCount;
    private static final int MAX = 100;

    /**
     * this is a no arg constructor
     */
    public CoachArray() {
        coachArray = new Coach[MAX];
        coachCount = 0;
    }

    /**
     *this is used to get number of coach
     * @return int
     */
    public int getNumberOfCoach() {
        return coachCount;
    }

    /**
     * this is used to add coach
     * @param coachIn
     * @return true or false
     */
    public boolean addCoach(Coach coachIn) {
        if (coachCount < MAX) {
            coachArray[getNumberOfCoach()] = coachIn;
            coachCount++;
            return true;
           
        } else {
             return false;
        }
    }

    /**
     * this is used to add coach to a position
     * @param coachPosition
     * @param coach
     * @return true or false
     */
    public boolean addCoach(int coachPosition, Coach coach) {
        if (coachCount >= MAX || coachPosition >= coachCount) {
            return false;
        } else {
            for (int i = coachCount; i >= coachPosition; i--) {
                coachArray[i] = coachArray[i-1];
            }
            coachArray[coachPosition - 1] = coach;
            coachCount++;
            return true;
        }
    }

    /**
     * this is used to remove coach at a position
     * @param coachPosition
     * @return  true or false
     */
    public boolean removeCoach(int coachPosition) {
        if (coachPosition >= coachCount) {
            return false;
        } else {
            for (int i = coachPosition; i < coachCount; i++) {
                if (i + 1 == MAX) {
                    coachArray[i] = null;
                } else {
                    coachArray[i] = coachArray[i + 1];
                }

            }
            coachCount--;
            return true;
        }
    }

    /**
     * this is used to find avg salary
     * @return double
     */
    public double findAverageSalary() {
        if (coachCount == 0) {
            return 0.0;
        } else {
            double sal = 0.0;

            for (int i = 0; i < coachCount; i++) {
                sal += coachArray[i].getSalary();
            }
            return sal / coachCount;

        }
    }
    /**
     * this is used to display values
     * @return String
     */
    @Override
    public String toString() {
        String str = "";
        for (Coach c : coachArray) {
            if (c != null) {
                str += c + "\n";
            }

        }
        return str;
    }

}
