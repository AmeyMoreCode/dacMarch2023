// 13.Write a program to convert:
// a. short value into String
// b. short value into Short instance.
// c. String instance into Short instance.

class Question13{
    public static void main(String [] args){
          
          short value = 1;
          /*
          String str = Short.toString(value);
          System.out.println(str);
          */

          /*
          Short ab=new Short(value);
          String str = ab.toString();
          System.out.println(str);
          */
           
        String value1 = "123";
        String aab = new String(value1);     
        Short ab = new Short(aab); 
        System.out.println(ab);
            



    }
}