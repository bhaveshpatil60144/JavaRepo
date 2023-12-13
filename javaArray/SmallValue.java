package javaArray;

public class SmallValue {
    public static void main(String[] args) {
    int [] x = {100, 200, 300, 400, 500};
    int big = x[0];

    for (int i =1; i < x.length; i++){
        if(x[i] > big){
           big = x [i];
        }
    }
    System.out.println("The Big Value" + big);
    }
}

