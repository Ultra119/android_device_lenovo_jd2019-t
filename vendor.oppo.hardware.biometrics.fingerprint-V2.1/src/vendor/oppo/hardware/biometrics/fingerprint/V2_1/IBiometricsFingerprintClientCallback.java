package vendor.oppo.hardware.biometrics.fingerprint.V2_1;

import android.hidl.base.V1_0.DebugInfo;
import android.hidl.base.V1_0.IBase;
import android.os.HidlSupport;
import android.os.HwBinder;
import android.os.HwBlob;
import android.os.HwParcel;
import android.os.IHwBinder;
import android.os.IHwBinder.DeathRecipient;
import android.os.IHwInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public interface IBiometricsFingerprintClientCallback extends IBase {
    public static final String kInterfaceName = "vendor.oppo.hardware.biometrics.fingerprint@2.1::IBiometricsFingerprintClientCallback";

    public static final class Proxy implements IBiometricsFingerprintClientCallback {
        private IHwBinder mRemote;

        public Proxy(IHwBinder remote) {
            this.mRemote = (IHwBinder) Objects.requireNonNull(remote);
        }

        public IHwBinder asBinder() {
            return this.mRemote;
        }

        public String toString() {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(interfaceDescriptor());
                sb.append("@Proxy");
                return sb.toString();
            } catch (RemoteException e) {
                return "[class or subclass of vendor.oppo.hardware.biometrics.fingerprint@2.1::IBiometricsFingerprintClientCallback]@Proxy";
            }
        }

        public final boolean equals(Object other) {
            return HidlSupport.interfacesEqual(this, other);
        }

        public final int hashCode() {
            return asBinder().hashCode();
        }

        public void onEnrollResult(long deviceId, int fingerId, int groupId, int remaining) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBiometricsFingerprintClientCallback.kInterfaceName);
            _hidl_request.writeInt64(deviceId);
            _hidl_request.writeInt32(fingerId);
            _hidl_request.writeInt32(groupId);
            _hidl_request.writeInt32(remaining);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(1, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void onAcquired(long deviceId, int acquiredInfo, int vendorCode) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBiometricsFingerprintClientCallback.kInterfaceName);
            _hidl_request.writeInt64(deviceId);
            _hidl_request.writeInt32(acquiredInfo);
            _hidl_request.writeInt32(vendorCode);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(2, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void onAuthenticated(long deviceId, int fingerId, int groupId, ArrayList<Byte> token) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBiometricsFingerprintClientCallback.kInterfaceName);
            _hidl_request.writeInt64(deviceId);
            _hidl_request.writeInt32(fingerId);
            _hidl_request.writeInt32(groupId);
            _hidl_request.writeInt8Vector(token);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(3, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void onError(long deviceId, int error, int vendorCode) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBiometricsFingerprintClientCallback.kInterfaceName);
            _hidl_request.writeInt64(deviceId);
            _hidl_request.writeInt32(error);
            _hidl_request.writeInt32(vendorCode);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(4, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void onRemoved(long deviceId, int fingerId, int groupId, int remaining) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBiometricsFingerprintClientCallback.kInterfaceName);
            _hidl_request.writeInt64(deviceId);
            _hidl_request.writeInt32(fingerId);
            _hidl_request.writeInt32(groupId);
            _hidl_request.writeInt32(remaining);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(5, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void onEnumerate(long deviceId, int fingerId, int groupId, int remaining) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBiometricsFingerprintClientCallback.kInterfaceName);
            _hidl_request.writeInt64(deviceId);
            _hidl_request.writeInt32(fingerId);
            _hidl_request.writeInt32(groupId);
            _hidl_request.writeInt32(remaining);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(6, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void onTouchDown(long deviceId) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBiometricsFingerprintClientCallback.kInterfaceName);
            _hidl_request.writeInt64(deviceId);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(7, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void onTouchUp(long deviceId) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBiometricsFingerprintClientCallback.kInterfaceName);
            _hidl_request.writeInt64(deviceId);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(8, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void onMonitorEventTriggered(int type, String data) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBiometricsFingerprintClientCallback.kInterfaceName);
            _hidl_request.writeInt32(type);
            _hidl_request.writeString(data);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(9, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void onImageInfoAcquired(int type, int quality, int match_score) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBiometricsFingerprintClientCallback.kInterfaceName);
            _hidl_request.writeInt32(type);
            _hidl_request.writeInt32(quality);
            _hidl_request.writeInt32(match_score);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(10, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void onSyncTemplates(long deviceId, ArrayList<Integer> fingerIds, int groupId) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBiometricsFingerprintClientCallback.kInterfaceName);
            _hidl_request.writeInt64(deviceId);
            _hidl_request.writeInt32Vector(fingerIds);
            _hidl_request.writeInt32(groupId);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(11, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void onEngineeringInfoUpdated(int lenth, ArrayList<Integer> keys, ArrayList<String> values) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBiometricsFingerprintClientCallback.kInterfaceName);
            _hidl_request.writeInt32(lenth);
            _hidl_request.writeInt32Vector(keys);
            _hidl_request.writeStringVector(values);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(12, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public void onFingerprintCmd(int cmdId, ArrayList<Byte> result, int resultLen) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBiometricsFingerprintClientCallback.kInterfaceName);
            _hidl_request.writeInt32(cmdId);
            _hidl_request.writeInt8Vector(result);
            _hidl_request.writeInt32(resultLen);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(13, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public ArrayList<String> interfaceChain() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256067662, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                return _hidl_reply.readStringVector();
            } finally {
                _hidl_reply.release();
            }
        }

        public String interfaceDescriptor() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256136003, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                return _hidl_reply.readString();
            } finally {
                _hidl_reply.release();
            }
        }

        public ArrayList<byte[]> getHashChain() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                int _hidl_index_0 = 0;
                this.mRemote.transact(256398152, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                ArrayList arrayList = new ArrayList();
                HwBlob _hidl_blob = _hidl_reply.readBuffer(16);
                int _hidl_vec_size = _hidl_blob.getInt32(8);
                HwBlob childBlob = _hidl_reply.readEmbeddedBuffer((long) (_hidl_vec_size * 32), _hidl_blob.handle(), 0, true);
                arrayList.clear();
                while (true) {
                    int _hidl_index_02 = _hidl_index_0;
                    if (_hidl_index_02 >= _hidl_vec_size) {
                        return arrayList;
                    }
                    byte[] _hidl_vec_element = new byte[32];
                    childBlob.copyToInt8Array((long) (_hidl_index_02 * 32), _hidl_vec_element, 32);
                    arrayList.add(_hidl_vec_element);
                    _hidl_index_0 = _hidl_index_02 + 1;
                }
            } finally {
                _hidl_reply.release();
            }
        }

        public void setHALInstrumentation() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256462420, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public boolean linkToDeath(DeathRecipient recipient, long cookie) throws RemoteException {
            return this.mRemote.linkToDeath(recipient, cookie);
        }

        public void ping() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256921159, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public DebugInfo getDebugInfo() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(257049926, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                DebugInfo _hidl_out_info = new DebugInfo();
                _hidl_out_info.readFromParcel(_hidl_reply);
                return _hidl_out_info;
            } finally {
                _hidl_reply.release();
            }
        }

        public void notifySyspropsChanged() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IBase.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(257120595, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public boolean unlinkToDeath(DeathRecipient recipient) throws RemoteException {
            return this.mRemote.unlinkToDeath(recipient);
        }
    }

    public static abstract class Stub extends HwBinder implements IBiometricsFingerprintClientCallback {
        public IHwBinder asBinder() {
            return this;
        }

        public final ArrayList<String> interfaceChain() {
            return new ArrayList<>(Arrays.asList(new String[]{IBiometricsFingerprintClientCallback.kInterfaceName, IBase.kInterfaceName}));
        }

        public final String interfaceDescriptor() {
            return IBiometricsFingerprintClientCallback.kInterfaceName;
        }

        public final ArrayList<byte[]> getHashChain() {
            return new ArrayList<>(Arrays.asList(new byte[][]{new byte[]{26, -80, -106, -40, -116, -25, 4, 112, 9, 84, 93, 47, 6, -77, -22, 89, -82, 118, -32, -93, -54, -9, -86, 101, -11, -40, -96, 122, -47, 121, 99, -119}, new byte[]{-67, -38, -74, 24, 77, 122, 52, 109, -90, -96, 125, -64, -126, -116, -15, -102, 105, 111, 76, -86, 54, 17, -59, 31, 46, 20, 86, 90, 20, -76, 15, -39}}));
        }

        public final void setHALInstrumentation() {
        }

        public final boolean linkToDeath(DeathRecipient recipient, long cookie) {
            return true;
        }

        public final void ping() {
        }

        public final DebugInfo getDebugInfo() {
            DebugInfo info = new DebugInfo();
            info.pid = HidlSupport.getPidIfSharable();
            info.ptr = 0;
            info.arch = 0;
            return info;
        }

        public final void notifySyspropsChanged() {
            HwBinder.enableInstrumentation();
        }

        public final boolean unlinkToDeath(DeathRecipient recipient) {
            return true;
        }

        public IHwInterface queryLocalInterface(String descriptor) {
            if (IBiometricsFingerprintClientCallback.kInterfaceName.equals(descriptor)) {
                return this;
            }
            return null;
        }

        public void registerAsService(String serviceName) throws RemoteException {
            registerService(serviceName);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(interfaceDescriptor());
            sb.append("@Stub");
            return sb.toString();
        }

        public void onTransact(int _hidl_code, HwParcel _hidl_request, HwParcel _hidl_reply, int _hidl_flags) throws RemoteException {
            HwParcel hwParcel = _hidl_request;
            HwParcel hwParcel2 = _hidl_reply;
            int _hidl_index_0 = 0;
            boolean _hidl_is_oneway = true;
            switch (_hidl_code) {
                case 1:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_index_0 = 1;
                    }
                    if (_hidl_index_0 != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(IBiometricsFingerprintClientCallback.kInterfaceName);
                    onEnrollResult(_hidl_request.readInt64(), _hidl_request.readInt32(), _hidl_request.readInt32(), _hidl_request.readInt32());
                    return;
                case 2:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_index_0 = 1;
                    }
                    if (_hidl_index_0 != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(IBiometricsFingerprintClientCallback.kInterfaceName);
                    onAcquired(_hidl_request.readInt64(), _hidl_request.readInt32(), _hidl_request.readInt32());
                    return;
                case 3:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_index_0 = 1;
                    }
                    if (_hidl_index_0 != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(IBiometricsFingerprintClientCallback.kInterfaceName);
                    onAuthenticated(_hidl_request.readInt64(), _hidl_request.readInt32(), _hidl_request.readInt32(), _hidl_request.readInt8Vector());
                    return;
                case 4:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_index_0 = 1;
                    }
                    if (_hidl_index_0 != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(IBiometricsFingerprintClientCallback.kInterfaceName);
                    onError(_hidl_request.readInt64(), _hidl_request.readInt32(), _hidl_request.readInt32());
                    return;
                case 5:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_index_0 = 1;
                    }
                    if (_hidl_index_0 != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(IBiometricsFingerprintClientCallback.kInterfaceName);
                    onRemoved(_hidl_request.readInt64(), _hidl_request.readInt32(), _hidl_request.readInt32(), _hidl_request.readInt32());
                    return;
                case 6:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_index_0 = 1;
                    }
                    if (_hidl_index_0 != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(IBiometricsFingerprintClientCallback.kInterfaceName);
                    onEnumerate(_hidl_request.readInt64(), _hidl_request.readInt32(), _hidl_request.readInt32(), _hidl_request.readInt32());
                    return;
                case FingerprintError.ERROR_LOCKOUT /*7*/:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_index_0 = 1;
                    }
                    if (_hidl_index_0 != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(IBiometricsFingerprintClientCallback.kInterfaceName);
                    onTouchDown(_hidl_request.readInt64());
                    return;
                case FingerprintError.ERROR_VENDOR /*8*/:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_index_0 = 1;
                    }
                    if (_hidl_index_0 != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(IBiometricsFingerprintClientCallback.kInterfaceName);
                    onTouchUp(_hidl_request.readInt64());
                    return;
                case 9:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_index_0 = 1;
                    }
                    if (_hidl_index_0 != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(IBiometricsFingerprintClientCallback.kInterfaceName);
                    onMonitorEventTriggered(_hidl_request.readInt32(), _hidl_request.readString());
                    return;
                case 10:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_index_0 = 1;
                    }
                    if (_hidl_index_0 != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(IBiometricsFingerprintClientCallback.kInterfaceName);
                    onImageInfoAcquired(_hidl_request.readInt32(), _hidl_request.readInt32(), _hidl_request.readInt32());
                    return;
                case 11:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_index_0 = 1;
                    }
                    if (_hidl_index_0 != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(IBiometricsFingerprintClientCallback.kInterfaceName);
                    onSyncTemplates(_hidl_request.readInt64(), _hidl_request.readInt32Vector(), _hidl_request.readInt32());
                    return;
                case 12:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_index_0 = 1;
                    }
                    if (_hidl_index_0 != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(IBiometricsFingerprintClientCallback.kInterfaceName);
                    onEngineeringInfoUpdated(_hidl_request.readInt32(), _hidl_request.readInt32Vector(), _hidl_request.readStringVector());
                    return;
                case 13:
                    if ((_hidl_flags & 1) != 0) {
                        _hidl_index_0 = 1;
                    }
                    if (_hidl_index_0 != 1) {
                        hwParcel2.writeStatus(Integer.MIN_VALUE);
                        _hidl_reply.send();
                        return;
                    }
                    hwParcel.enforceInterface(IBiometricsFingerprintClientCallback.kInterfaceName);
                    onFingerprintCmd(_hidl_request.readInt32(), _hidl_request.readInt8Vector(), _hidl_request.readInt32());
                    return;
                default:
                    switch (_hidl_code) {
                        case 256067662:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway = false;
                            }
                            if (_hidl_is_oneway) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(IBase.kInterfaceName);
                            ArrayList<String> _hidl_out_descriptors = interfaceChain();
                            hwParcel2.writeStatus(0);
                            hwParcel2.writeStringVector(_hidl_out_descriptors);
                            _hidl_reply.send();
                            return;
                        case 256131655:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway = false;
                            }
                            if (_hidl_is_oneway) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(IBase.kInterfaceName);
                            hwParcel2.writeStatus(0);
                            _hidl_reply.send();
                            return;
                        case 256136003:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway = false;
                            }
                            if (_hidl_is_oneway) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(IBase.kInterfaceName);
                            String _hidl_out_descriptor = interfaceDescriptor();
                            hwParcel2.writeStatus(0);
                            hwParcel2.writeString(_hidl_out_descriptor);
                            _hidl_reply.send();
                            return;
                        case 256398152:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway = false;
                            }
                            if (_hidl_is_oneway) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(IBase.kInterfaceName);
                            ArrayList<byte[]> _hidl_out_hashchain = getHashChain();
                            hwParcel2.writeStatus(0);
                            HwBlob _hidl_blob = new HwBlob(16);
                            int _hidl_vec_size = _hidl_out_hashchain.size();
                            _hidl_blob.putInt32(8, _hidl_vec_size);
                            _hidl_blob.putBool(12, false);
                            HwBlob childBlob = new HwBlob(_hidl_vec_size * 32);
                            while (_hidl_index_0 < _hidl_vec_size) {
                                childBlob.putInt8Array((long) (_hidl_index_0 * 32), (byte[]) _hidl_out_hashchain.get(_hidl_index_0));
                                _hidl_index_0++;
                            }
                            _hidl_blob.putBlob(0, childBlob);
                            hwParcel2.writeBuffer(_hidl_blob);
                            _hidl_reply.send();
                            return;
                        case 256462420:
                            if ((_hidl_flags & 1) != 0) {
                                _hidl_index_0 = 1;
                            }
                            if (_hidl_index_0 != 1) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(IBase.kInterfaceName);
                            setHALInstrumentation();
                            return;
                        case 256660548:
                            if ((_hidl_flags & 1) != 0) {
                                _hidl_index_0 = 1;
                            }
                            if (_hidl_index_0 != 0) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            return;
                        case 256921159:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway = false;
                            }
                            if (_hidl_is_oneway) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(IBase.kInterfaceName);
                            ping();
                            hwParcel2.writeStatus(0);
                            _hidl_reply.send();
                            return;
                        case 257049926:
                            if ((_hidl_flags & 1) == 0) {
                                _hidl_is_oneway = false;
                            }
                            if (_hidl_is_oneway) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(IBase.kInterfaceName);
                            DebugInfo _hidl_out_info = getDebugInfo();
                            hwParcel2.writeStatus(0);
                            _hidl_out_info.writeToParcel(hwParcel2);
                            _hidl_reply.send();
                            return;
                        case 257120595:
                            if ((_hidl_flags & 1) != 0) {
                                _hidl_index_0 = 1;
                            }
                            if (_hidl_index_0 != 1) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            hwParcel.enforceInterface(IBase.kInterfaceName);
                            notifySyspropsChanged();
                            return;
                        case 257250372:
                            if ((_hidl_flags & 1) != 0) {
                                _hidl_index_0 = 1;
                            }
                            if (_hidl_index_0 != 0) {
                                hwParcel2.writeStatus(Integer.MIN_VALUE);
                                _hidl_reply.send();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    IHwBinder asBinder();

    DebugInfo getDebugInfo() throws RemoteException;

    ArrayList<byte[]> getHashChain() throws RemoteException;

    ArrayList<String> interfaceChain() throws RemoteException;

    String interfaceDescriptor() throws RemoteException;

    boolean linkToDeath(DeathRecipient deathRecipient, long j) throws RemoteException;

    void notifySyspropsChanged() throws RemoteException;

    void onAcquired(long j, int i, int i2) throws RemoteException;

    void onAuthenticated(long j, int i, int i2, ArrayList<Byte> arrayList) throws RemoteException;

    void onEngineeringInfoUpdated(int i, ArrayList<Integer> arrayList, ArrayList<String> arrayList2) throws RemoteException;

    void onEnrollResult(long j, int i, int i2, int i3) throws RemoteException;

    void onEnumerate(long j, int i, int i2, int i3) throws RemoteException;

    void onError(long j, int i, int i2) throws RemoteException;

    void onFingerprintCmd(int i, ArrayList<Byte> arrayList, int i2) throws RemoteException;

    void onImageInfoAcquired(int i, int i2, int i3) throws RemoteException;

    void onMonitorEventTriggered(int i, String str) throws RemoteException;

    void onRemoved(long j, int i, int i2, int i3) throws RemoteException;

    void onSyncTemplates(long j, ArrayList<Integer> arrayList, int i) throws RemoteException;

    void onTouchDown(long j) throws RemoteException;

    void onTouchUp(long j) throws RemoteException;

    void ping() throws RemoteException;

    void setHALInstrumentation() throws RemoteException;

    boolean unlinkToDeath(DeathRecipient deathRecipient) throws RemoteException;

    static IBiometricsFingerprintClientCallback asInterface(IHwBinder binder) {
        if (binder == null) {
            return null;
        }
        IHwInterface iface = binder.queryLocalInterface(kInterfaceName);
        if (iface != null && (iface instanceof IBiometricsFingerprintClientCallback)) {
            return (IBiometricsFingerprintClientCallback) iface;
        }
        IBiometricsFingerprintClientCallback proxy = new Proxy(binder);
        try {
            Iterator it = proxy.interfaceChain().iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(kInterfaceName)) {
                    return proxy;
                }
            }
        } catch (RemoteException e) {
        }
        return null;
    }

    static IBiometricsFingerprintClientCallback castFrom(IHwInterface iface) {
        if (iface == null) {
            return null;
        }
        return asInterface(iface.asBinder());
    }

    static IBiometricsFingerprintClientCallback getService(String serviceName, boolean retry) throws RemoteException {
        return asInterface(HwBinder.getService(kInterfaceName, serviceName, retry));
    }

    static IBiometricsFingerprintClientCallback getService(boolean retry) throws RemoteException {
        return getService("default", retry);
    }

    static IBiometricsFingerprintClientCallback getService(String serviceName) throws RemoteException {
        return asInterface(HwBinder.getService(kInterfaceName, serviceName));
    }

    static IBiometricsFingerprintClientCallback getService() throws RemoteException {
        return getService("default");
    }
}
