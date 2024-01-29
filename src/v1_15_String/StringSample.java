package v1_15_String;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convert();
        sample.convertUTF16();
    }

    public void printByteArray(byte[] array){
        for(byte data:array){
            System.out.print(data+" ");
        }
        System.out.println("[byte 배열의 크기 : "+array.length+"]");
    }

    public void convert(){
        try{
            String korean ="앙앙앙앙앙앙"; //"한글"이라는 값을 갖는 String 객체인 korean을 생성한다.
            //EUC-KR : 한글 한 글자 표현 => 2byte

            byte[] array1 = korean.getBytes("EUC-KR"); //getByte() 메소드를 사용하여 korean을 byte배열로 만든다.

            printByteArray(array1);

            String korean2 = new String(array1,"EUC-KR"); //byte배열을 갖고 String 객체를 만들기 위해서

            // byte배열(array1)을 매개 변수로 갖는 String객체를 생성하고, 해당 문자열을 출력한다.
            System.out.println(korean2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void convertUTF16(){
        try{
            String korean = "앙앙앙앙앙앙";
            byte[] array1=korean.getBytes("UTF-16");
            printByteArray(array1);
            //UTF-16 인코딩시  BOM(byte of mark) 2바이트가 디폴트로 추가됨
            //배열 사이즈는 bom(2) + 문자수 * 2;
            String korean2 = new String(array1,"UTF-16");
//글자 깨짐 현상을 방지하기 위해서는 byte 배열로 생성할 때 사용한 캐릭터 셋을 문자열로 다시 전환할 때에도 동일하게 사용하여야 한다.
            System.out.println(korean2);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}