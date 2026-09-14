abstract class pen{
    abstract void write();
    abstract void refill();
}
 class fountainpen extends pen{
    void write(){
        System.out.println("writing");
    }
    void refill(){
        System.out.println("refill");
    }
    void changenib(){
        System.out.println("change the nib");
    }
}
class monkey{
     void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }
}
    interface basicanimal{
        void eat();
        void sleep();
    }

    class human extends monkey implements basicanimal{
        void speak(){
            System.out.println("hello...");
        }
        @Override
            public void eat(){
              System.out.println("eating...");
            }
        public void sleep(){
            System.out.println("sleeping...");
        }
    }
    interface tvremote{
        void meth1();
    }
    interface smarttvremote extends tvremote{
        void meth2();
        class remote implements smarttvremote{
            public void meth1(){
                System.out.println("method 1");
            }
            public void meth2(){
                System.out.println("method2");
            }
        }
    }
public class practicesetonabsandinterface {
    public static void main(String[] args) {
        //ques 1+2
      fountainpen p = new fountainpen(); 
      p.changenib();
      //ques 3
      human h = new human();
      h.sleep();
      //ques 5
      monkey m = new human();
      m.jump();
        //ques 

    }
}
