package pattern.adapter.impl.apdater;

import pattern.adapter.impl.impl1.Ps2;
import pattern.adapter.impl.impl1.Usber;

/**
 * Created by jiangry01 on 2018/3/17.
 */
public class Adapter extends Usber implements Ps2 {
    @Override
    public void isPs2() {
        isUsb();
    }
}
