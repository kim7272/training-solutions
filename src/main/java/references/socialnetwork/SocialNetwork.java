package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    private List<Member> members = new ArrayList<>();

    public void addMember(String name) {
        members.add(new Member(name));
    }

    public void connect(String name, String anotherName) {
        findByName(name).connectMember(findByName(anotherName));
    }

    public Member findByName(String name) {
        for (Member member: members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public List<String> bidirectionalConnections() {
        List<String> connections = new ArrayList<>();
        for (Member member1 : members) {
            for (Member member2 : member1.getConnections()) {
                if (member2.getConnections().contains(member1))
                    connections.add(member1.getName() + " - " + member2.getName());
            }
        }
        return connections;
    }
        @Override
        public String toString() {
            return members.toString();
    }
}