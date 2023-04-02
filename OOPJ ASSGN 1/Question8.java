class Question8{
    public static void main(String [] args){

          
            // 8.Write a program to convert:

            //byte value into String
            byte b = 123;
            String str = String.valueOf(b);
            System.out.println(b);            

            //b. byte value into Byte instance.
            byte c = 123;
            Byte a = new Byte(c);
            System.out.println(a); 

            //c. String instance into Byte instance.
            String cc = "123";
            String aa = new String(cc);
            Byte ab = new Byte(aa); 
            System.out.println(ab); 
    }
}