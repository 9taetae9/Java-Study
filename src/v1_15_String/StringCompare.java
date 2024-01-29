package v1_15_String;

public class StringCompare {
    public static void main(String[] args) {
        StringCompare sample = new StringCompare();
        sample.checkString();
        sample.checkCompare();
        sample.checkCompareTo();
    }

    public void checkString(){
        String text ="You must know String class."; //공백 포함글자 수 27 text.length() => 27
        String text_kr ="자바의 신 만세.";
        //공백 포함글자 수 9 text.length() => 9 한글이여도 length()는 글자수만 세면 된다
        System.out.println(text_kr.length());
        System.out.println(text_kr.isEmpty());
    }

    public void checkCompare(){
        String text = "Check value";
        //String text2 = "Check value";
        String text2 = new String("Check value");
        if(text == text2){
            System.out.println("text==text2 result is same.");
//자바에 constant pool이 존재해 String의 경우 동일한 값을 갖는 객체가 있으면, 이미 만든 객체를 재사용.
//즉 text 와 text2는 실제로 같은 객체이다.
//서로 다른 두 객체로 취급하고 싶다면 String text2 = new String("Check value");처럼 객체를 생성해야된다.
        }else{
            System.out.println("text==text2 result is different.");
        }

        if(text.equals("Check value")){
            System.out.println("text.equals(text2) result is same.");
        }

        String text3 ="check value";
        if(text.equalsIgnoreCase(text3)){
            System.out.println("text.equalsIgnoreCase(text3) result is same.");
        }
    }

    public void checkCompareTo(){
        String text="a";
        String text2="b";
        String text3="c";

        System.out.println(text2.compareTo(text)); // 1 양수 text2가 text보다 한칸더뒤에 있어서
        System.out.println(text2.compareTo(text3)); // -1 음수 text2가 text3보다 한칸더 앞에 있어서
        System.out.println(text.compareTo(text3)); //-2 음수 text가 text3보다 두칸더 앞에 있어서
    }
}
