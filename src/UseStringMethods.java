public class UseStringMethods {
    public static void main(String[] args) {
        UseStringMethods sample = new UseStringMethods();

        String str = "The String class represents character strings.";
        sample.printWord(str);
        sample.findString(str,"string");
        sample.findAnyCaseString(str,"string");
        sample.countChar(str,'s');
        sample.printContainWords(str,"ss");
    }

    public void printWord(String str){
        for(String word : str.split(" ")){
            System.out.println(word);
        }
    }

    public void findString(String str, String findstr){
        System.out.println(findstr+" is appeared at "+ str.indexOf(findstr));
    }

    public void findAnyCaseString(String str, String findstr){
        System.out.println(findstr+" is appeared at "+ str.toLowerCase().indexOf(findstr));
    }

    public void countChar(String str, char c){
        int charcount=0;
        for(char element : str.toCharArray()){
            if(element==c) charcount++;
        }
        System.out.println("char \'"+c+"\' count is "+charcount);
    }

    public void printContainWords(String str, String findStr){
        for(String word : str.split(" ")){
            if(word.contains(findStr))
                System.out.println(word + " contains "+findStr);
        }
    }
}

