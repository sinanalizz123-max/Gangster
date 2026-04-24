package javax.microedition.rms;

public class RecordStore {
    public static RecordStore openRecordStore(String name, boolean create) throws RecordStoreException {
        return new RecordStore();
    }
    public void closeRecordStore() throws RecordStoreException {}
    public byte[] getRecord(int id) throws RecordStoreException { return new byte[0]; }
    public int addRecord(byte[] data, int offset, int numBytes) throws RecordStoreException { return 0; }
    public int getNumRecords() throws RecordStoreException { return 0; }
    public void setRecord(int id, byte[] newData, int offset, int numBytes) throws RecordStoreException {}
}
