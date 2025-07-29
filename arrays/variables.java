public class variables {
    public static void main(String[] args){
        int a = 15;
        int y = 10;
        int sum = a+y;
        int prd = a*y;
        System.out.println("sum is : " +sum );// to concatinate string we hav e to use + symbol..
        System.out.println("product is : " +prd);
        //lets see division and modulus 
        float div =a/y;
        int mod =a%y;
        float div2=y/a;
        System.out.println(div);
        System.out.println(mod);
        System.out.println(div2);// in divison java gives us quotient only and in modulo functon it gives us remainder.

        // solving an expreseinon 
        int exp =(a*y)/(a+y);// here BODMASS isn't followed here we have priorities based in functions */% > +- 
        System.out.println(exp);
    }
}
