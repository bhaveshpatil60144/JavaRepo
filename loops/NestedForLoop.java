package loops;

public class NestedForLoop {

    public static void main(String[] args) {

        for (int i=0; i<=2; i++){                //Outerr Loop    //Row
            for (int j = 0; j<=2; j++){           //Inner Loop   //Colum

                System.out.println(i+ "  " +j);
            }
        }

    }
}
