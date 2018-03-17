package pattern.adapter.impl;

import pattern.adapter.impl.apdater.Adapter;
import pattern.adapter.impl.impl1.Ps2;

/**
 * Created by jiangry01 on 2018/3/17.
 */
public class Main {
    public static void main(String args[]){
        Ps2 p = new Adapter();
        p.isPs2();
    }
}
