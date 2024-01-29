package v1_8_Referencetype;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor referece = new ReferenceConstructor();
        referece.makeMemberObject();
    }

    public void makeMemberObject() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Sangmin");
        MemberDTO dto3 = new MemberDTO("Sangmin", "010XXXXYYYY");
        MemberDTO dto4 = new MemberDTO("Sangmin", "010XXXXYYYY", "god@godofjava.com");
    }
}
