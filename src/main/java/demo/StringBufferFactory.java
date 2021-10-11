package demo;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2021/10/11 16:50
 */
public class StringBufferFactory extends BasePooledObjectFactory<StringBuffer> {

    @Override
    public StringBuffer create() throws Exception {
        return new StringBuffer();
    }

    /**
     * Use the default PooledObject implementation.
     */
    @Override
    public PooledObject<StringBuffer> wrap(StringBuffer stringBuffer) {
        return new DefaultPooledObject<StringBuffer>(stringBuffer);
    }

    /**
     * When an object is returned to the pool, clear the buffer.
     */
    @Override
    public void passivateObject(PooledObject<StringBuffer> pooledObject) {
        pooledObject.getObject().setLength(0);
    }

    // for all other methods, the no-op implementation
    // in BasePooledObjectFactory will suffice
}
