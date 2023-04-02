// 20.Write a program to convert:
// a. long value into String
// b. long value into Long instance.
// c. String instance into Long instance.
// d. long value into binary, octal and hexadecimal string.
class Question20{
    public static void main(String [] args){

        long value = 123;
        String str = String.valueOf(value);

        Long abb = new Long(value);

        String str1="123";
        String str2= new String(str1);
        Long bb = new Long(str2);     

        String by = Long.toBinaryString(value);
        System.out.println(by);

        String hex = Long.toHexString(value);
        System.out.println("Hexa decimal: " + hex);
        //integer to octal
        String oct = Long.toOctalString(value);
        System.out.println("Octal: " + oct);

    }
}