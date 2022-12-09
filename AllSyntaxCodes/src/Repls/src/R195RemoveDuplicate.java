import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class R195RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(111);
        nums.add(111);
        nums.add(111);
        nums.add(999);
        nums.add(999);
        nums.add(999);

        HashSet<Integer> unique=new HashSet<Integer>(nums);
        List<Integer>unique2=new ArrayList<Integer>(unique);
        for (Object ob : unique2) {
            System.out.println(ob);
        }}}
