package com.company;

//this is a class named solution
// we will call this class instance in main method to see if our program runs correctly

public class Solution {

    /* Inside solution class we declare a method of type string
    //This method accepts array of string
    //we passed a parameter named strs */
    public String longestCommonPrefix(String[] strs){

        /* we check the length of string array with if condition
        //if length of string is 0 , then print a blank or empty
        //if array of string = {"leet","leetcode","leed"} , then length of string is 3 */
        if (strs.length == 0)
            return " ";

        /* we made a variable of type string named prefix
        //we store the first string of our array strs[0] = "leet" */
        String prefix = strs[0];

        /* Now we use for loop to iterate over all the strings in arrays
        //iterate from starting 1 till length of array
        //from index 1 till less than length of string */
        for (int i = 1; i < strs.length; i++)

            //we create a while loop and we will run it till strs[i].indexOf(strs[0]) is not equal to 0
            while (strs[i].indexOf(prefix) != 0){

                /*substring is a part of string
                so, starting of substring is 0 till length of string - 1 */
                prefix = prefix.substring(0,prefix.length()-1);

                //if prefix is empty return empty
                if (prefix.isEmpty())
                    return " ";
            }
        //return the prefix value
        return prefix;
    }
}
