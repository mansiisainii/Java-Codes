abstract class A<T>{
    abstract T result(T a,T b);

}
public class generics {
    public static void main(String[] args) {
        A<Integer> a= new A<>(){
            Integer result(Integer x,Integer y){
                return(x+y);
            }
        };
        System.out.println(a.result(567,678));
    }
}
