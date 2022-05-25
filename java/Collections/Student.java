package Collections;



public class Student implements Comparable<Student>{

    int id;
    String name;
    String branch;
    public Student( int id,String name,String branch){
        this.id = id;
        this.branch = branch;
        this.name = name;
    }

    @Override
    public int compareTo(Student st) {
        return this.id - st.id;
    }
    @Override
    public String toString(){
        return " [ " + " Id : "+ id + ", Name : "+name+ ", Branch : " + branch+" ]";
    }


}
