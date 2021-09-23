package e3;

public class Operators {
    public static int globalInt = 5;


    public static void main(String[] args) {


        int a = 16;
        int b = 5;
        int add = a + b;
        int subtract = a - b;
        int multiply = a * b;
        int divide = a / b;
        int reminder = a % b;

        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);

        a += 2;
        b -= 1;
        boolean bValue = true;
        bValue = !bValue;

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("bValue=" + bValue);

        a++;  // a=a+1
        b--; //b = b-1;
        System.out.println(a);

        if (bValue == false) {
            System.out.println("Boolean value is true");
        }
        if (bValue) {
            System.out.println("Boolean value is false");
        }
        if (b > 10) {
            System.out.println("b>10");
        } else {
            System.out.println("b<10");
        }

        //COnditonal Operators
        //==
        //!=
        //<
        //<=
        //>=
        //>
        //&& and
        // || or


        a=25;
        b += 7;
        if(b==10){
            if(a>22){
                System.out.println("b=10 and a>22");
            }
        }
        if (b==10 && a>=22){
            System.out.println("b=10 & a>22");
        }
        b--;
        if (b==10 || a>=22){
            System.out.println("b=10 or a>22");
        }


        // Ternary Operator

        int c =5;
        if (b > 10) {
            c=10;
        }else{
            c=12;
        }
        //result= (contional expression)? value 1: value2
        b = 18;
        int result = b>10 ? 10 : 15;

        if(b<10){
            System.out.println("b is less than 10");
        }else if(a>20){
            System.out.println(" a is greater than 20");
        }else{
            System.out.println("Nothing");
        }

        a = -55;
        a = -a;
        a = a+1;
        System.out.println(a);


        //Arrays //loops

        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=-3;
        arr[2]=9;
        arr[3]=10;
        arr[4]=5;

        int[] arrs={2,-3,9,4,1};

        System.out.println(arrs[0]);

        for(int i=0; i<=arr.length-1; i++){

            System.out.println(arr[i]);
        }
        for (int num:arr){
            System.out.println(num);
        }

        boolean[] bvalue = {true, false, false, true};

        for(boolean booleanValue : bvalue){

            System.out.println(booleanValue);
        }


        int count = 10;
        while (count>0){
            System.out.println(count);
            count--;
        }

        // DO while

        do{
            System.out.println(count);
            count--;
        }while(count>0);

        //STRING

        char[] name ={'p','a','v','i'};

        for (Character ch: name){
            System.out.print(ch);
        }
        System.out.println(name.toString());

        String Name ="Pavi";
        System.out.println(Name);

        String lastName = "Uma";
        Name = Name + lastName;
        System.out.println(Name);

        printName("Pavi","Uma");

       // NameClass myName = new NameClass("Pavithra", "Uma");

    }//End of Main function


    private static void printName(String firstName, String lastName){
        globalInt = 7;
        String fullName = firstName + lastName;
        System.out.println(fullName);
    }

}// end of the class

