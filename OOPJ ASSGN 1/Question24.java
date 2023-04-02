// 24.Write a program to convert:
// a. float value into String
// b. float value into Float instance.
// c. String instance into Float instance.
// d. float value into hexadecimal string.
class Question24{
    public static void main(String [] args){

        float value = 123;
        String str = String.valueOf(value);

        Float abb = new Float(value);

        String str1="123";
        String str2= new String(str1);
        Float bb = new Float(str2);     

        

        String hex = Float.toHexString(value);
        System.out.println("Hexa decimal: " + hex);
        //integer to octal
       

    }
}