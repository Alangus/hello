import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * @Author : hechucai
 * @Description :
 * @Date : Created in ${time} ${date}
 * @Modified By :
 */
@ThreadSafe
public class Sequence {
    @GuardedBy("this") private int value=0;

    public synchronized int getValue(){
        value++;
        return value;
    }
}
