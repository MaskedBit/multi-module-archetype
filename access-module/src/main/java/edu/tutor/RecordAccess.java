package edu.tutor;

import edu.tutor.model.Record;

public interface RecordAccess extends Iterable<Record>
{
	Record getRecord(String label);
	void putRecord(Record record);
}
