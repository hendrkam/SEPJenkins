package com.mycompany.sepjenkins;
/** @author Kamil */
import java.util.Arrays;
/**
 * @author Kamil
 */
public class SEP {
    public static void main(String[] args) {
        System.out.println("Running...");
        
        
    }
    
    public static int[] sortArray1(int[] numArray)
        {
            Arrays.sort(numArray);
            return numArray;
        }
    
    public static int[] sortArray2(int[] numArray)
        {
            return numArray;
        }
    
}

