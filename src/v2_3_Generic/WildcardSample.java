package v2_3_Generic;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample w = new WildcardSample();
        w.callWildMethod();
    }

    public void callWildMethod(){
        WildcardGeneric<Integer> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard(1);
        wildcardMethod(wildcard);
    }

    public void wildcardMethod(WildcardGeneric<?> s){
        Object value = s.getWildcard();
        System.out.println(value.getClass());
        System.out.println(value);
    }
}
