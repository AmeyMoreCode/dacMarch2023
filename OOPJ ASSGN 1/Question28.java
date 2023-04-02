// 28.Write a program to convert:
// a. double value into String
// b. double value into Double instance.
// c. String instance into Double instance.
// d. double value into binary, octal and hexadecimal string(Note: Here you can use doubleToLongBits()

class Question28{
    public static void main(String [] args){

        double value = 123;
        String str = String.valueOf(value);

        Double abb = new Double(value);

        String str1="123";
        String str2= new String(str1);
        Double bb = new Double(str2);     

       
        String hex = Double.toHexString(value);
        System.out.println("Hexa decimal: " + hex);
        //integer to octal
       

    }
}