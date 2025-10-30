package h2;

public class H2_main {

    public static void main(String[] args) {
        int i=3;
        int j=7;
        int k= 200;
        int min=0;
        int max=0;

        if (i<j){           //min finder
            min=i;
            if (k<i){
                min=k;
            }
        }
        else {
            min=j;
            if (k<j){
                min=k;
            }
        }

        if (i>j){           //max finder
            max=i;
            if (k>i){
                max=k;
            }
        }
        else {
            max=j;
            if (k>j){
                max=k;
            }
        }

        System.out.println("min=" + min);       //test to see if it works
        System.out.println("max=" + max);       //

    }

}
