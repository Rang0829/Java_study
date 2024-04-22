package Object_Ex;

class Object1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    } // main
} 

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
    
    public boolean equals(Object obj) {      
        if (!(obj instanceof Value)) // obj가 Value 클래스의 인스턴스인지 확인
            return false;
        
        Value v = (Value) obj; // obj를 Value로 형 변환
        return this.value == v.value;
	}
}