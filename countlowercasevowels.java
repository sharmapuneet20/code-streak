public class countlowercasevowels {
    public static void count_v(String str){
        int count =0;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch=='e'|| ch =='i'||ch=='o'||ch =='u'|| ch =='a'){
                count++;


            }


        }
        System.out.print(count);


    }

    public static void main(String[] args) {
        String str =" My name is Puneet ";
        count_v(str);

    }
}
