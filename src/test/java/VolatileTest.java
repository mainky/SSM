/**
 * @program: SSM
 * @author: kangyang
 * @create: 2018-09-30 15:49
 **/
public class VolatileTest {

    public volatile int inc = 0;
    public int inb = 0;

    public void increase() {
        inc = inc + 1;
        inb = inb + 1;
        //System.out.println("inc:"+inc);
        System.out.println("inb:"+inb);
    }

    public static void main(String[] args) {
        final VolatileTest test = new VolatileTest();
        for(int i=0;i<100;i++){
            new Thread(){
                public void run() {
                    test.increase();
                };
            }.start();
        }
        System.out.println("结束");
    }
}
