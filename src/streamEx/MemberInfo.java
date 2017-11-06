package streamEx;


public class MemberInfo {

    private String name;
    private String age;
    private String address;

    public MemberInfo() {

    }

    public MemberInfo(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public MemberInfo(Member member) {
        this.name = member.getName();
        this.age = member.getAge();
        this.address = member.getAddress();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
