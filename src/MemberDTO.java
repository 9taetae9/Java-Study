public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO(){} // 아무 정보도 모를때

    public MemberDTO(String name){
        this.name = name; // 이름만 알때
    }

    public MemberDTO(String name, String phone){
        this.name = name;
        this.phone = phone; //이름과 전화번호만 알 때
    }

    public MemberDTO(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email; //모든 정보를 알고 있을 때
    }

    public MemberDTO getMemberDTO(){
        MemberDTO dto = new MemberDTO();

        return dto;
    }
}
