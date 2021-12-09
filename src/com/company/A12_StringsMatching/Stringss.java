package com.company.A12_StringsMatching;


//polynomial Hashing == String Matching or hashing


/*
class Palindrome_string {
    public static void main(String[] args) {
        String str="MADAM";
        String orignal=str;
        String reversed="";
        int length= str.length();


        for (int i=length-1;i>=0;i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println("reverse " + reversed);
        if (orignal.equals(reversed)){
            System.out.println("Its palindrome");
        }else System.out.println("Its not palindrome");

    }


}

 */  //palindrome String

/*
class main{
    public static void main(String[] args) {

        String s="Java Dsa and Daa";
        String b=s.toLowerCase();
       int total_count =b.length();
        int total_count_after_a=s.replace("a","").length(); //total length after removing a;
        int count= total_count - total_count_after_a;
        System.out.println("Number of time a repeated "+count);
    }
}

 */ //count no of time a character came in the a string

/*
class main{
    public static void main(String[] args) {
        int count =1;

        String s="basic question to advance";
        for (int i=0;i<s.length()-1;i++){

            if ( (s.charAt(i)==' ') &&  (s.charAt(i+1)!=' ')){
                count++;
            }

        }
        System.out.println("number of words in string : "+count);
    }

}

 */ //no of words in a string

/*
class frequency{
    public static void main(String[] args) {
        String str="this is need to cover the advance questions";
        int[]a=new int[26];

        for (int i=0;i<str.length();i++){

            if (str.charAt(i)>=65 && str.charAt(i)<=90){
                a[str.charAt(i)-65]++;
            }else  if (str.charAt(i)>=97 && str.charAt(i)<=122){
                a[str.charAt(i)-97]++;
            }
        }
        for (int i=0;i<26;i++){
            if (a[i]>0){
                System.out.println((char)(i+65)+" - "+a[i]);
            }

        }
    }
}

 */ // Frequency of alphabets          (IMP)

/*
class substring{
    int resultStart;
    int resultLenght;

      String longestpalindrome(String s){
        int strlength=s.length();
        if (strlength<2){
           // System.out.println("Its palindrome");
            return s;

        }
        for (int start=0;start<strlength-1;start++){
            expandRange(s,start,start);

        }
        return s.substring(resultStart,resultStart+resultLenght);


    }
   private void expandRange(String str,int begin,int end){
          while(begin>=0 && end<str.length() &&
                  str.charAt(begin)==str.charAt(end))
          {
              begin--;
              end++;
          }
          if (resultLenght<end-begin-1)
          {
              resultStart=begin+1;
              resultLenght=end-begin-1;

          }

    }
    public static void main(String[] args) {
        String s="aaaaabuubaaaaa";
        substring call=new substring();
        call.longestpalindrome(s);

    }
}*/// longest palindromic substring

/*
class main{
    //declaring number of character in the alphabets
    public final static int d=256;

    static  void serch( String pattern,String txt, int prime) {
        int m = pattern.length();
        int n = txt.length();
        int p = 0;
        int t = 0;
        int h = 1;
        int i, j;

        // h="pow(d,m-1")%q;

        for (i = 0; i < m - 1; i++) {
            h = (h * d) % prime;
            //calculating hash value of pattern and first

            //Txt window

            for (i = 0; i < m; i++) {
                p = (d * p + pattern.charAt(i)) % prime;
                t = (d * t + txt.charAt(i)) % prime;
            }
            //sliding the pattern over text one at a time

            for (i = 0; i <= n - m; i++) {
                //checking hash of pattern and txt
                //if ti matches then only check for characters one by one

                if (p == t) {
                    //check character one by one

                    for (j = 0; j < m; j++) {
                        if (txt.charAt(i + j) != pattern.charAt(j))

                            break;


                    }

                    //HashPattern==HashTxt
                    if (j == m) {
                        System.out.println("Pattern found at index " + i);
                        System.out.println("run");
                    }
                    //calculating value of next window
                    if (i < n - m) {
                        t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % prime;
                        // we might get negative vlaue of t,
                        //conver it in positive

                        if (t < 0) {
                            t = (t + prime);
                        }
                    }
                }
            }

        }
    }


    public static void main(String[] args) {

        String txt="GREEKSFORGREEKS";

        String pattern="GREEKS";


        //talking a prime number
        int prime=101;

        //calling the function
        serch(pattern,txt,prime);

    }
}

 *///robin karp method =sting matching //Abdul Bari youtube channel //need to decode this

// Knuth-Morris-Pratt=sting matching //Abdul Bari youtube channel


// (interview special) (also on leetcode 5) // dynamic programme needed

// need to know some concepts of dynamic programing so this topic will be after some-time




