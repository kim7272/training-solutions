package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Member {

    private String name;
    private List<Member> connections = new ArrayList<>();

    public Member(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public List<Member> getConnections(){
        return connections;
    }
    public void  connectMember(Member member){
        connections.add(member);
    }
    private List<String> connectedNames() {
        List<String> connectedNames = new ArrayList<>();
        for (Member member: connections) {
            connectedNames.add(member.getName());
        }
        return connectedNames;
    }
}
