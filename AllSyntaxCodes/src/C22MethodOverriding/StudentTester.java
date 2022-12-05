package C22MethodOverriding;

public class StudentTester {
    public static void main(String[] args) {
        Student[]arr={new Student(), new schoolStudent(), new SyntaxStudent1()};
        for(Student st:arr)
        {
            st.study();
            st.doHomeWork();
            st.doPractice();
        }}}
