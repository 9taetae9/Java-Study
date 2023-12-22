public class StringCheck {
    public static void main(String[] args) {
        StringCheck sample = new StringCheck();

        String[] addresses =new String[]{
                "서울시 구로구 신도림동",
                "경기도 성남시 분당구 정자동 개발 공장",
                "서울시 구로구 개봉동",
        };

        sample.checkAddress(addresses);
        sample.checkMatch();
        sample.checkIndexOf();
        sample.checkLastIndexOf();
        sample.checkTrim();
        sample.checkReplace();
        sample.checkFormat();
    }

    public void checkAddress(String[] addresses){
        int startCount = 0, endCount=0, containCount=0;
        String startText = "서울시";
        String endText = "동";
        String containText = "구로";

        for(String address:addresses){
            if(address.startsWith(startText)){
                startCount++;
            }
            if(address.endsWith(endText)){
                endCount++;
            }
            if(address.contains(containText)){
                containCount++;
            }
        }
        System.out.println("Starts with "+startText+" count is "+startCount);
        System.out.println("Ends with "+endText+" count is "+endCount);
        System.out.println("Contains "+containText+" count is "+containCount);
    }

    public void checkMatch(){
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";
        System.out.println(text.regionMatches(2,compare1,0,1));
        System.out.println(text.regionMatches(5,compare1,0,2));
        System.out.println(text.regionMatches(true,0, compare2,0,4));


    }

    public void checkIndexOf(){
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.indexOf('a'));  //1
        System.out.println(text.indexOf("a ")); //3
        System.out.println(text.indexOf('a',20)); //24
        System.out.println(text.indexOf("a ",20)); //24
        System.out.println(text.indexOf('z')); //-1
    }

    public void checkLastIndexOf(){
        String text ="Java technology is both a programming language and a platform.";
        System.out.println(text.lastIndexOf('a'));  //55
        System.out.println(text.lastIndexOf("a ")); //51
        System.out.println(text.lastIndexOf('a',20)); //3
        System.out.println(text.lastIndexOf("a ",20)); //3
        System.out.println(text.lastIndexOf('z')); //-1
    }

    public void checkTrim(){
        String[] strings = new String[]{
                " a"," b ","    c","d    ","e    f", "    ",
        };

        for(String string : strings){
            System.out.println("["+string+"]");
            System.out.println("["+string.trim()+"]");
        }

        String text="   d ";
        if(text!=null&&text.trim().length()>0){
            System.out.println("OK");
        }
    }

    public void checkReplace(){
        String text = "The String class represents character strings.";
        System.out.println(text.replace('s','z'));
        System.out.println(text);
        System.out.println(text.replace("trings","trike"));
        System.out.println(text);
        System.out.println(text.replaceAll(" ","|"));
        System.out.println(text.replaceFirst(" ","|1|").replaceFirst(" ","|2|"));

        String text2 = "이 문장의 공백을 순서대로 바꿉니다.";
        int numberOfSpacesToReplace = 3; // 바꾸고 싶은 공백의 개수
        System.out.println("text2 replace 이전 : "+ text2);
        for (int i = 1; i <= numberOfSpacesToReplace; i++) {
            text2 = text2.replaceFirst(" ", "|" + i + "|");
        }

        System.out.println("text2 replace 이후 : "+ text2);
    }

    public void checkFormat(){
        String text="제 이름은 %s입니다. 지금까지 %d 권의 책을 썼고, "
                +"하루에 %f %%의 시간을 책을 쓰는데 할애하고 있습니다.";

        String realText = String.format(text,"이상민",7,10.5);
        //String realText = String.format(text,"이상민",7); missingformatargumentexception
        System.out.println(realText);

    }
}
