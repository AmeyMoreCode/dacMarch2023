// 16. Write a program to convert:
// a. int value into String
// b. int value into Integer instance.
// c. String instance into Integer instance.
// d. int value into binary, octal and hexadecimal string.
class Question16{
    public static void main(String [] args){

        int value = 123;
        String str = String.valueOf(value);

        Integer abb = new Integer(value);

        String str1="123";
        String str2= new String(str1);
        Integer bb = new Integer(str2);     

        String by = Integer.toBinaryString(value);
        System.out.println(by);

        String hex = Integer.toHexString(value);
        System.out.println("Hexa decimal: " + hex);
        //integer to octal
        String oct = Integer.toOctalString(value);
        System.out.println("Octal: " + oct);

    }
}