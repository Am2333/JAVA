
public class JarPackage {
    private static Singleton singleton;
    public static SingletonNotIdler singletonNotIdler;

    private JarPackage() {
    }
    //多线程调用get获取实例化
    public static void multithreading() {
        for (int i = 0; i < 10; i++) {
            new Thread() {
                @Override
                public void run() {
                    singletonNotIdler = SingletonNotIdler.getSingletonNotIdler();
                    System.out.println("singletonNotIdler:" + singletonNotIdler.hashCode());
                }
            }.start();
        }
    }

    public static void main(String[] args) {
//        singleton = Singleton.getSingleton();
//        System.out.println("singleton:" + singleton.hashCode());
//        singletonNotIdler = SingletonNotIdler.getSingletonNotIdler();
//        System.out.println("singletonNotIdler:" + singletonNotIdler.hashCode());
        multithreading();

    }
}
