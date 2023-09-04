public class static1 {
        public static void main(String[] args) {

            Bird s1 = new Bird();
            s1.schoolName="ucet";

            s1.name="peacock";
            System.out.println(s1.name);
            s1.rollno=12;
            System.out.println(s1.rollno);
            System.out.println(s1.schoolName);


            System.out.println("==============================");

            Bird s2 = new Bird();
            s2.name="hen";
            System.out.println(s2.name);
            s2.rollno=13;
            System.out.println(s2.rollno);
            System.out.println(s2.schoolName);


            System.out.println("==============================");

            Bird s3 = new Bird();
            s3.name="parrot";
            System.out.println(s3.name);
            s3.rollno=13;
            System.out.println(s3.rollno);
            System.out.println(s3.schoolName);

        }
    }
    class Bird {
        String name;
        int rollno;
        static String schoolName;

        void setName(String name) {
            this.name = name;
        }
        String getName(){
            return this.name=name;
        }
    }


/*
peacock
12
ucet
==============================
hen
13
ucet
==============================
parrot
13
ucet


static keyword :- static keyword in java is used to share the same variable or method of a given class.
name
rollno
school etc.........
 */


