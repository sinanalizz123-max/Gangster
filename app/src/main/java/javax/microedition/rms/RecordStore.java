package javax.microedition.rms;

public class RecordStore {
    public static RecordStore openRecordStore(String name, boolean create) throws RecordStoreException {
        return new RecordStore();
    }
    public void closeRecordStore() throws RecordStoreException {}
    public byte[] getRecord(int id) throws RecordStoreException { return null; }
    public int addRecord(byte[] data, int offset, int numBytes) throws RecordStoreException { return 0; }
}
