class Main {
    public static void main(String[] args){
        Student s = new Student();
        s.setMarks(100);
        System.out.println(s.getmarks());
    } 
}

class Student{
    private int marks;

    void setMarks(int marks){
        if(marks>=0 && marks<=100){
            this.marks=marks;
        }
        else{
            System.out.println("invalid marks");
        }
    }

    int getmarks(){
        return marks;
    }
    
}