public class Singleton {
    //饿汉式单例模式，暴露接口对外提供对象
    //缺点：类加载初期就实例化对象
    public static final
    Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getSingleton() {
        return singleton;
    }
}
