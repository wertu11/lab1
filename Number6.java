package ru.mirea.lab1;

public class Number6 {

    public static void main(String[] args) {
        String array[];
        array = new String[10];
        for(int i = 0; i < 10; i++){
            String s = Integer.toString(i+1);
            if(i == 0){
                array[i] = "1";
            }
            else {
                array[i] = "1/" + s;
            }
            System.out.println(array[i]);
        }

    }
}