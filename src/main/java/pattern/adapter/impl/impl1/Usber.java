package pattern.adapter.impl.impl1;

/**
 * Created by jiangry01 on 2018/3/17.
 */
public class Usber  implements Usb{
    @Override
    public void isUsb() {
        System.out.println("Usb接口..........");
    }
}
