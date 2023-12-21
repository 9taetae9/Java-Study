public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convert();
    }

    public void convert(){
        try{
            String korean ="한글"; //"한글"이라는 값을 갖는 String 객체인 korean을 생성한다.

            byte[] array1 = korean.getBytes(); //getByte() 메소드를 사용하여 korean을 byte배열로 만든다.

            for(byte data : array1){
                System.out.print(data+" "); //byte배열에 어떤 값들이 있는지 각각의 byte값을 출력시킨다.
            }

            System.out.println();
            String korean2 = new String(array1); //byte배열을 갖고 String 객체를 만들기 위해서
            // byte배열(array1)을 매개 변수로 갖는 String객체를 생성하고, 해당 문자열을 출력한다.
            System.out.println(korean2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}