package com.tcl.designmode.creational.singleton;

/**
 *  单例模式   ------ 线程安全(双重检查锁)
 *
 *  双重检查锁，减少了没必要的获取和释放锁操作
 *
 *  Singleton mode .
 *
 *  The class is thread safe.
 *
 *  volatile
 *
 *  线程的安全必须满足：原子性、可见性、顺序性
 *
 *  volatile 只保证了 可见性 和顺序性 ，无法保证原子性
 *
 * @author: chenglong.tian@foxmail.com
 * <p>
 * create: 2018-11-27 19:35
 * @version: 1.0
 **/
public class SingletonThreadSafe {
    /**
     * 在这里 volatile  保证对象创建的有序性；
     * 对象创建一般分为：1 开辟空间  2 初始化  3 引用指向对象的首地址
     * 正常来讲顺序是 1->2->3 ,但是由于处理器对指令的重排序，可能会是 1->3->2 ,
     * 若果是这样的话，假如初始化耗费时间比较长，就会导致其他线程（第一个if外面的线程），判断
     * instance 不等null ,就不会进入同步块了，此时如果这个线程使用这个实例的一个方法，就会造成一些影响；比如：一些变量还未初始化，
     * 所以这里加了 volatile 就是为了保证了这个变量的的创建一定是 1,2,3 。
     */
    private volatile static SingletonThreadSafe instance;
    private SingletonThreadSafe(){

    }
    public static SingletonThreadSafe getInstance(){
        if(null == instance){
            synchronized(SingletonThreadSafe.class){
                if(null == instance){
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }

}
