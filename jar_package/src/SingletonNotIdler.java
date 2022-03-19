public class SingletonNotIdler {
    /*
    * 懒汉式单例模式，类加载不进行实例化
    * 第一次调用会实例一个对象，后续进行获取都是同一个对象
    * */
    public static SingletonNotIdler singletonNotIdler = null;
    private SingletonNotIdler(){};

    public static synchronized SingletonNotIdler getSingletonNotIdler(){
        if(singletonNotIdler == null)
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singletonNotIdler = new SingletonNotIdler();
        }


        return singletonNotIdler;
    }

}
