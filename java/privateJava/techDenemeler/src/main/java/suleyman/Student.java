package suleyman;

public class Student {
    /*
    1) "static" "class memberlar (variable+ method+constructor+code blocks)" tüm objctcle tarafaından paylaşılır.
    2)
     */
            "

    public static int numOfRegisteredStd = 0;
    public int num = 0;


    public Student() {
        numOfRegisteredStd++;
        num++;
    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        System.out.println(numOfRegisteredStd);
        System.out.println(s1.num);

    }
}
