package edu.tutor.app;

import edu.tutor.RecordAccess;
import edu.tutor.RecordDao;
import edu.tutor.model.Record;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RecordAccess access = new RecordDao();
        
        access.putRecord(new Record("Shoe", 17));
        access.putRecord(new Record("Nail", 23));
        access.putRecord(new Record("Box", 5));
        
        for (Record curRecord : access)
        {
        	System.out.format("Record label=\"%s\", number=%d%n", curRecord.getLabel(), curRecord.getNumber());
        }
    }

}
