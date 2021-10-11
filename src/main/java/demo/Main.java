package demo;

import org.apache.commons.pool2.impl.GenericObjectPool;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2021/10/11 16:52
 */
public class Main {
    public static void main(String[] args) {
        ReaderUtilWithPooledStringBuffer readerUtil =
                new ReaderUtilWithPooledStringBuffer(new GenericObjectPool<>(new StringBufferFactory()));
    }
}
