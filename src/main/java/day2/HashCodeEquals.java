package day2;

public class HashCodeEquals {
    public static void main(String[] args) {
        HENode n1 = new HENode(1);
        HENode n2 = new HENode(1);
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

    }


}


class HENode {
    int value;
    HENode (int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if ( !(o instanceof HENode)) {
            return false;
        }
        HENode another = (HENode) o;
        return this.value == another.value;
    }

    @Override
    public int hashCode() {
        return this.value;
    }



}
