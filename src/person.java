void main() {
    postgraduate s1=new postgraduate("moha cijo",4.0,"multimedia");
    System.out.println(s1.card());
    postgraduate s2=new postgraduate("hassan",3.0,"Business");
    System.out.println(s1.card());

}
public class person {
    protected String name;
    public person(String name){
        this.name=name;
        System.out.println("1. person: "+name);
    }
    String define(){
        return name;
    }
}
public class student extends person{
    protected double gba;
    student(String name,double gba){
        super(name);
        this.gba=gba;
        System.out.println("2. student GBA: "+gba);
    }
}

public class postgraduate extends student{
    protected String thesis;
    public postgraduate(String name,double gba, String thesis){
        super(name,gba);
        this.thesis=thesis;
        System.out.println("3. Postgraduate: "+thesis);
    }
    public String card(){
        return super.define()+" |GBA "+gba+" | "+thesis;

    }
}