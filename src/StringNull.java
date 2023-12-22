public class StringNull {
    public static void main(String[] args) {
        StringNull sample = new StringNull();
        System.out.println(sample.nullCheck2(null));
        System.out.println(sample.nullCheck(null));
    }

    public boolean nullCheck(String text) {
        int textLength = text.length(); // null이면 nullpointerexception error
        System.out.println(text);
        if(text==null) return true;
        else return false;
    }

    public boolean nullCheck2(String text){
        if(text == null) {
            return true;
        } else {
            int textLength = text.length();
            System.out.println(textLength);
            return false;
        }
    }

}
