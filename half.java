public class half {

    public static void pyramidHalf(int n){

        for(int i=1; i<=n; i++){

            //space
            for(int space=1; space<=(n-i); space++){
                System.out.print(" ");


            }     // stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            } 
            System.out.println( );
            
        } 
    }


    public static void main(String args[]){
        pyramidHalf(4);

    }
    
}
