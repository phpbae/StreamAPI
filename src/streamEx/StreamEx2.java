package streamEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {

    public static void callStream() {
        //map 연산자 -> Function

        Member member = new Member();
        member.setName("하이루");
        member.setAge("11");
        member.setAddress("서울시 어딘가");

        Member member2 = new Member();
        member.setName("헬로우");
        member.setAge("22");
        member.setAddress("부산시 어딘가");

        List<Member> memberList = new ArrayList<>();
        memberList.add(member);
        memberList.add(member2);


        List<MemberInfo> memberInfoList = memberList.stream()
                .map(MemberInfo::new)
                .collect(Collectors.toList());

        List<MemberInfo> memberInfoList2 = memberList.stream()
                .map((Member member1) -> {
                    return new MemberInfo(member1.getName(), member1.getAge(), member1.getAddress());
                })
                .collect(Collectors.toList());


    }
}
