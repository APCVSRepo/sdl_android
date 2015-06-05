package com.smartdevicelink.rpc.datatypes;

import java.util.Hashtable;

import com.smartdevicelink.proxy.RpcStruct;
import com.smartdevicelink.rpc.enums.VehicleDataStatus;

public class MyKey extends RpcStruct {
    public static final String KEY_E_911_OVERRIDE = "e911Override";

    public MyKey() { }
    public MyKey(Hashtable<String, Object> hash) {
        super(hash);
    }

    public void setE911Override(VehicleDataStatus e911Override) {
        if (e911Override != null) {
            store.put(KEY_E_911_OVERRIDE, e911Override);
        } else {
        	store.remove(KEY_E_911_OVERRIDE);
        }
    }
    public VehicleDataStatus getE911Override() {
        Object obj = store.get(KEY_E_911_OVERRIDE);
        if (obj instanceof VehicleDataStatus) {
            return (VehicleDataStatus) obj;
        } else if (obj instanceof String) {
        	return VehicleDataStatus.valueForString((String) obj);
        }
        return null;
    }
}